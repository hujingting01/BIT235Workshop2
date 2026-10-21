import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159;

        System.out.print("Enter radius of circle: ");
        double radius = scanner.nextDouble();

        double area = PI * radius * radius;
        System.out.println("Area of the circle: " + area);

        scanner.close();
    }
}




