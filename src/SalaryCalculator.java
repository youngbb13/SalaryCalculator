import java.math.BigDecimal;

public class SalaryCalculator {
    public BigDecimal dayShift = BigDecimal.valueOf(31.40);
    public BigDecimal nightShift = BigDecimal.valueOf(37.68);

    public BigDecimal calculateDayPay(int dayHours) {
        return BigDecimal.valueOf(dayHours).multiply(dayShift);
    }
}
