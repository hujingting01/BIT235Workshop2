import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();
        System.out.print("Enter annual interest rate: ");
        double rate = scanner.nextDouble();
        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        double amount = principal * Math.pow(1 + rate / 100, years);
        System.out.println("Compound amount: " + amount);

        scanner.close();
    }
}

