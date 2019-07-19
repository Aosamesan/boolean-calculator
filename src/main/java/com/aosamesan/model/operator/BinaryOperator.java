package com.aosamesan.model.operator;

import java.util.function.BiFunction;

public enum BinaryOperator implements Operator<BiFunction<Boolean, Boolean, Boolean>> {
    AND((a, b) -> a && b),
    OR((a, b) -> a || b),
    IF((a, b) -> !a || b),
    IFF((a, b) -> (!a || b) && (a || !b)),
    XOR(BinaryOperator.IFF.getOperator().andThen(UnaryOperator.NEGATE.getOperator()))

    ;

    private BiFunction<Boolean, Boolean, Boolean> operator;

    BinaryOperator(BiFunction<Boolean, Boolean, Boolean> operator) {
        this.operator = operator;
    }

    @Override
    public BiFunction<Boolean, Boolean, Boolean> getOperator() {
        return operator;
    }

    @Override
    public OperatorType getOperatorType() {
        return OperatorType.BINARY_OPERATOR;
    }
}
