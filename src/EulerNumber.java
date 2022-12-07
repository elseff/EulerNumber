import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public final class EulerNumber {
    private EulerNumber() {
    }

    public static String getNumber(int accuracy) {
        return "Euler number with " + accuracy + " accuracy is: \n" + String.format("%." + accuracy + "f", eulerNumber(accuracy));
    }

    private static BigDecimal eulerNumber(int accuracy) {
        BigDecimal number = new BigDecimal(1);
        for (int i = 1; i < accuracy; i++) {
            BigDecimal result = BigDecimal.valueOf(1)
                    .divide(factorial(BigDecimal.valueOf(i)),new MathContext(accuracy,RoundingMode.HALF_EVEN));
            number = number.add(result);
        }
        return number;
    }

    private static BigDecimal factorial(BigDecimal n) {
        BigDecimal number = new BigDecimal("1");
        for (int i = 1; i <= n.longValue(); i++) {
            number = number.multiply(BigDecimal.valueOf(i));
        }
        return number;
    }
}
