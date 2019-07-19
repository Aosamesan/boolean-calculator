package com.aosamesan.model.operand;

public enum Constant implements Operand {
    TRUE(true),
    FALSE(false)

    ;

    boolean value;

    Constant(boolean value) {
        this.value = value;
    }

    @Override
    public boolean getValue() {
        return value;
    }

    @Override
    public String toString() {
        return Boolean.toString(value);
    }
}
