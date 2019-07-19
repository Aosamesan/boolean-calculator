package com.aosamesan.model.operand;

import java.util.*;
import java.util.stream.Collectors;

public class Variable implements Operand {
    private VariableMap variableMap;
    private String id;

    private Variable(String id, VariableMap variableMap) {
        this.id = id;
        this.variableMap = variableMap;
    }

    public static Variable createVariable(String id, VariableMap variableMap) {
        if (variableMap.check(id)) {
            return variableMap.getVariable(id);
        } else {
            Variable variable = new Variable(id, variableMap);
            variableMap.register(variable);
            return variable;
        }
    }

    public static VariableMap createVariableMap() {
        return new VariableMap();
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean getValue() {
        return variableMap.getVariableValue(id);
    }

    @Override
    public String toString() {
        return Boolean.toString(getValue());
    }

    public static class VariableMap {
        private List<String> idList;
        private Map<String, Byte> idIndexMap;
        private Map<String, Variable> idVariableMap;
        private long currentValue;

        private VariableMap() {
            idList = new ArrayList<>();
            idIndexMap = new HashMap<>();
            idVariableMap = new HashMap<>();
            currentValue = 0;
        }

        public void build() {
            if (idList.size() > 64) {
                throw new RuntimeException("ID의 개수는 64개를 넘을 수 없음.");
            }
            idList.sort(Comparator.reverseOrder());
            for (byte index = 0; index < idList.size(); index++) {
                String id = idList.get(index);
                idIndexMap.put(id, index);
            }
        }

        public void reset() {
            currentValue = 0;
        }

        public void next() {
            if (currentValue < (1L << idList.size())) {
                currentValue++;
            } else {
                currentValue = 0;
            }
        }

        private void register(Variable variable) {
            String id = variable.getId();

            idList.add(id);
            idVariableMap.put(id, variable);
        }

        private boolean check(String id) {
            return idVariableMap.containsKey(id);
        }

        private Variable getVariable(String id) {
            return idVariableMap.get(id);
        }

        private boolean getVariableValue(String id) {
            byte index = idIndexMap.get(id);
            return (currentValue & (1L << index)) != 0;
        }

        public int getSize() {
            return idVariableMap.size();
        }

        public Map<String, Boolean> getCurrentValueMap() {
            return idVariableMap.entrySet().stream()
                    .collect(Collectors.toMap(Map.Entry::getKey, item -> item.getValue().getValue()));
        }
    }
}
