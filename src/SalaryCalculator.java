import java.math.BigDecimal;

public class SalaryCalculator {
    public BigDecimal dayShift = BigDecimal.valueOf(31.40);
    public BigDecimal nightShift = BigDecimal.valueOf(37.68);

    public BigDecimal calculateDayPay(int dayHours) {
        return BigDecimal.valueOf(dayHours).multiply(dayShift);
    }

    public BigDecimal calculateNightPay(int nightHours) {
        return BigDecimal.valueOf(nightHours).multiply(nightShift);
    }

    public BigDecimal calculateTotalWithoutPremium(BigDecimal dayPay, BigDecimal nightPay) {
        return dayPay.add(nightPay);
    }

    public BigDecimal calculatePremium(int OverallHours) {
        return BigDecimal.valueOf(OverallHours).multiply(dayShift).multiply(new BigDecimal("0.15"));
    }

    public BigDecimal calculateOverall(BigDecimal totalWithBonus, BigDecimal Premium) {
        return totalWithBonus.add(Premium);
    }
}
