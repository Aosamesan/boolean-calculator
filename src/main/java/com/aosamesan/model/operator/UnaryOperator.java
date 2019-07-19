package com.aosamesan.model.operator;

import java.util.function.Function;

public enum UnaryOperator implements Operator<Function<Boolean, Boolean>> {
    NEGATE(a -> !a)

    ;
    private Function<Boolean, Boolean> operator;

    UnaryOperator(Function<Boolean, Boolean> operator) {
        this.operator = operator;
    }

    @Override
    public Function<Boolean, Boolean> getOperator() {
        return operator;
    }

    @Override
    public OperatorType getOperatorType() {
        return OperatorType.UNARY_OPERATOR;
    }
}
