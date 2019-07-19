package com.aosamesan.model;

import java.util.Map;
import java.util.TreeMap;

public class CalculationResultRow {
    private Map<String, Boolean> operandMap;
    private boolean result;

    public CalculationResultRow(Map<String, Boolean> operandMap, boolean result) {
        this.operandMap = new TreeMap<>(operandMap);
        this.result = result;
    }

    public Map<String, Boolean> getOperandMap() {
        return operandMap;
    }

    public boolean getResult() {
        return result;
    }
}
