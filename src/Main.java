import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter amount of hours for day shifts: ");
        int dayHours = scanner.nextInt();

        System.out.println("Enter amount of hours for night shifts: ");
        int nightHours = scanner.nextInt();

        SalaryCalculator salaryCalculator = new SalaryCalculator();
        BigDecimal dayPay = salaryCalculator.calculateDayPay(dayHours);

        System.out.println(dayPay);
    }
}
