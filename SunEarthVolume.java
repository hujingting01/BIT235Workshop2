import java.util.Scanner;

public class SunEarthVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159;

        System.out.print("Enter radius of Earth: ");
        double earthR = scanner.nextDouble();
        System.out.print("Enter radius of Sun: ");
        double sunR = scanner.nextDouble();

        double earthVol = (4.0/3)*PI*earthR*earthR*earthR;
        double sunVol = (4.0/3)*PI*sunR*sunR*sunR;
        double ratio = sunVol / earthVol;

        System.out.println("Volume ratio (Sun/Earth): " + ratio);
        scanner.close();
    }
}
