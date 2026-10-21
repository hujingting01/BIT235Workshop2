package BIT235Workshop2;
import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14;

        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();

        double area = PI * Math.pow(radius, 2);
        System.out.println("Area of circle = " + area);

        scanner.close();
    }
}



