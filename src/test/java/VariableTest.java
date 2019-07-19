import com.aosamesan.model.operand.Variable;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class VariableTest {

    @Test
    public void shouldIterate() {
        Variable.VariableMap variableMap = Variable.createVariableMap();
        List<Variable> variableList = new ArrayList<>();
        for (char ch = 'a'; ch < 'e'; ch++) {
            Variable variable = Variable.createVariable(Character.toString(ch), variableMap);
            variableList.add(variable);
        }

        variableMap.build();

        for (int i = 0; i < 17; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("(%2d) ", i));
            for (Variable variable : variableList) {
                sb.append(String.format("<%s> %s,\t", variable.getId(), variable.toString()));
            }
            System.out.println(sb.toString());
            variableMap.next();
        }
    }

    @Test
    public void shouldSort() {
        Map<String, Integer> map = new TreeMap<>();

        map.put("b", 2);
        map.put("c", 3);
        map.put("a", 1);
        map.put("e", 5);
        map.put("d", 4);

        for (String key : map.keySet()) {
            System.out.println(String.format("%s : %d", key, map.get(key)));
        }

    }
}
