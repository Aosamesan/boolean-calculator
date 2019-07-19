import com.aosamesan.model.CalculationResultRow;
import com.aosamesan.model.CalculationResult;
import com.aosamesan.calculator.BooleanCalculator;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class CalculatorTest {
    @Test
    public void shouldCalculate() {
        String test = "~(A AND B)->C<>A";
        CalculationResult calculationResult = BooleanCalculator.calculate(test);
        Assert.assertNotNull(calculationResult);
        int idx = 0;
        System.out.println(calculationResult.getExpression());
        for (CalculationResultRow calculationResultRow : calculationResult.getResultList()) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.format("(%3d) ", idx));
            Map<String, Boolean> operandMap = calculationResultRow.getOperandMap();
            for (Map.Entry<String, Boolean> entry : operandMap.entrySet()) {
                sb.append(String.format("<%s> %5s\t", entry.getKey(), entry.getValue()));
            }
            sb.append(String.format("/ Result : %5s", calculationResultRow.getResult()));
            System.out.println(sb.toString());
            idx++;
        }
    }
}
