package com.aosamesan.calculator;

import com.aosamesan.model.CalculationResult;
import com.aosamesan.model.operand.Constant;
import com.aosamesan.model.operator.BinaryOperator;
import com.aosamesan.model.operator.UnaryOperator;
import com.aosamesan.parser.CalculatorBaseListener;
import com.aosamesan.parser.CalculatorParser;

public class BooleanCalculatorListener extends CalculatorBaseListener {
    private CalculationResult.Builder scopeBuilder;

    public CalculationResult getResult() {
        return scopeBuilder.build();
    }

    @Override
    public void enterStatement(CalculatorParser.StatementContext ctx) {
        scopeBuilder = new CalculationResult.Builder(ctx.expression().getText());
    }
    @Override
    public void exitExpression(CalculatorParser.ExpressionContext ctx) {
        if (ctx.op != null) {
            scopeBuilder.add(BinaryOperator.IFF);
        }
    }

    @Override
    public void exitImply_expression(CalculatorParser.Imply_expressionContext ctx) {
        if (ctx.op != null) {
            scopeBuilder.add(BinaryOperator.IF);
        }
    }

    @Override
    public void exitOr_expression(CalculatorParser.Or_expressionContext ctx) {
        if (ctx.op != null) {
            scopeBuilder.add(BinaryOperator.OR);
        }
    }

    @Override
    public void exitAnd_expression(CalculatorParser.And_expressionContext ctx) {
        if (ctx.xor_expression() != null) {
            return;
        }
        scopeBuilder.add(BinaryOperator.AND);
    }

    @Override
    public void exitXor_expression(CalculatorParser.Xor_expressionContext ctx) {
        if (ctx.op != null) {
            scopeBuilder.add(BinaryOperator.XOR);
        }
    }

    @Override
    public void exitNot_expression(CalculatorParser.Not_expressionContext ctx) {
        if (ctx.op != null) {
            scopeBuilder.add(UnaryOperator.NEGATE);
        }
    }

    @Override
    public void exitVariable(CalculatorParser.VariableContext ctx) {
        scopeBuilder.add(ctx.getText());
    }

    @Override
    public void exitTrue_expression(CalculatorParser.True_expressionContext ctx) {
        scopeBuilder.add(Constant.TRUE);
    }

    @Override
    public void exitFalse_expression(CalculatorParser.False_expressionContext ctx) {
        scopeBuilder.add(Constant.FALSE);
    }
}
