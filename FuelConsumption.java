import java.util.Scanner;

public class FuelConsumption {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter kilometres travelled: ");
        double km = scanner.nextDouble();
        System.out.print("Enter litres of fuel used: ");
        double litre = scanner.nextDouble();

        double consumption = litre / km * 100;
        System.out.println("Fuel consumption (L/100km): " + consumption);

        scanner.close();
    }
}


