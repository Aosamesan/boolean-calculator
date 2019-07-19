package com.aosamesan.model.operator;

import com.aosamesan.model.ExpressionToken;
import com.aosamesan.model.ExpressionTokenType;

public interface Operator<T> extends ExpressionToken {
    T getOperator();
    OperatorType getOperatorType();
    default ExpressionTokenType getType() {
        return ExpressionTokenType.OPERATOR;
    }
}
