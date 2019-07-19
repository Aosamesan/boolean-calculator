package com.aosamesan.model.operand;

import com.aosamesan.model.ExpressionToken;
import com.aosamesan.model.ExpressionTokenType;

public interface Operand extends ExpressionToken {
    boolean getValue();
    default ExpressionTokenType getType() {
        return ExpressionTokenType.OPERAND;
    }
}
