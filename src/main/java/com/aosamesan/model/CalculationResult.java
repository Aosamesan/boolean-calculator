package com.aosamesan.model;

import com.aosamesan.model.operand.Constant;
import com.aosamesan.model.operand.Operand;
import com.aosamesan.model.operand.Variable;
import com.aosamesan.model.operator.BinaryOperator;
import com.aosamesan.model.operator.Operator;
import com.aosamesan.model.operator.OperatorType;
import com.aosamesan.model.operator.UnaryOperator;

import java.util.*;

public class CalculationResult {
    private String expression;
    private Variable.VariableMap variableMap;
    private final List<ExpressionToken> expressionTokenList;

    private CalculationResult(String expression, Variable.VariableMap variableMap, List<ExpressionToken> expressionTokenList) {
        this.expression = expression;
        this.variableMap = variableMap;
        this.expressionTokenList = expressionTokenList;
    }

    public String getExpression() {
        return expression;
    }

    public static class Builder {
        private String expression;
        private List<ExpressionToken> expressionTokenList;
        private Variable.VariableMap variableMap;

        public Builder(String expression) {
            this.expression = expression;
            expressionTokenList = new ArrayList<>();
            variableMap = Variable.createVariableMap();
        }

        public void add(Constant constant) {
            expressionTokenList.add(constant);
        }

        public void add(UnaryOperator unaryOperator) {
            expressionTokenList.add(unaryOperator);
        }

        public void add(BinaryOperator binaryOperator) {
            expressionTokenList.add(binaryOperator);
        }

        public void add(String id) {
            Variable variable = Variable.createVariable(id, variableMap);
            expressionTokenList.add(variable);
        }

        public CalculationResult build() {
            return new CalculationResult(expression ,variableMap, expressionTokenList);
        }
    }

    private boolean calculate() {
        Stack<Boolean> calculationStack = new Stack<>();
        Queue<ExpressionToken> tokenQueue = new LinkedList<>(expressionTokenList);

        while (!tokenQueue.isEmpty()) {
            ExpressionToken token = tokenQueue.poll();

            if (token.getType() == ExpressionTokenType.OPERAND) {
                calculationStack.push(((Operand) token).getValue());
            } else {
                Operator rawOperator = (Operator) token;
                if (rawOperator.getOperatorType() == OperatorType.UNARY_OPERATOR) {
                    UnaryOperator operator = (UnaryOperator) rawOperator;
                    calculationStack.push(operator.getOperator().apply(calculationStack.pop()));
                } else if (rawOperator.getOperatorType() == OperatorType.BINARY_OPERATOR) {
                    BinaryOperator operator = (BinaryOperator) rawOperator;
                    boolean post = calculationStack.pop();
                    boolean prev = calculationStack.pop();
                    calculationStack.push(operator.getOperator().apply(prev, post));
                }
            }
        }

        if (calculationStack.size() != 1) {
            throw new RuntimeException("올바르지 않은 식");
        }

        return calculationStack.pop();
    }

    public List<CalculationResultRow> getResultList() {
        int size = variableMap.getSize();

        if (size == 0) {
            return Collections.emptyList();
        }
        variableMap.build();
        long all = 1L << size;

        List<CalculationResultRow> calculationResultRowList = new ArrayList<>();
        for (long idx = 0; idx < all; idx++) {
            Map<String, Boolean> operandMap = variableMap.getCurrentValueMap();
            boolean result = calculate();
            calculationResultRowList.add(new CalculationResultRow(operandMap, result));
            variableMap.next();
        }

        Collections.reverse(calculationResultRowList);
        return calculationResultRowList;
    }

}
