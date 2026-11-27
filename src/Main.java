import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int OverallHours = 0;

        System.out.print("Enter amount of hours for day shifts: ");
        int dayHours = scanner.nextInt();
        OverallHours += dayHours;

        System.out.print("Enter amount of hours for night shifts: ");
        int nightHours = scanner.nextInt();
        OverallHours += nightHours;

        System.out.print("Did You have any bonuses? (yes/no): ");
        String answer = scanner.next();
        int bonus = 0;
        if ("yes".equalsIgnoreCase(answer)) {
            System.out.print("How much?: ");
            bonus = scanner.nextInt();
            System.out.println("Bonus is: " + bonus);
        } else {
            System.out.println("No bonuses");
        }

        SalaryCalculator salaryCalculator = new SalaryCalculator();
        BigDecimal dayPay = salaryCalculator.calculateDayPay(dayHours);
        BigDecimal nightPay = salaryCalculator.calculateNightPay(nightHours);
        BigDecimal totalWithoutPremium = salaryCalculator.calculateTotalWithoutPremium(dayPay, nightPay);
        BigDecimal totalWithBonus = totalWithoutPremium.add(BigDecimal.valueOf(bonus));
        BigDecimal Premium = salaryCalculator.calculatePremium(OverallHours);
        BigDecimal totalWithPremiumOverall = salaryCalculator.calculateOverall(totalWithBonus, Premium);

        System.out.println("Total pay for day shifts: " + dayPay + " zł");
        System.out.println("Total pay for night shifts: " + nightPay + " zł");
        System.out.println("Total pay for both shifts: " + totalWithoutPremium + " zł");
        System.out.println("Total pay for both shifts with bonus: " + totalWithBonus + " zł");
        System.out.println("Premium is: " + Premium + " zł");
        System.out.println("Overall salary with premium is: " + totalWithPremiumOverall + " zł");
    }
}