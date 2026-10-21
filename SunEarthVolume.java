public class SunEarthVolume {
package BIT235Workshop2;

public class SunEarthVolume {
    public static void main(String[] args) {
        final double PI = 3.14;
        double sunDiameter = 865000;
        double earthDiameter = 7600;

        double sunRadius = sunDiameter / 2;
        double earthRadius = earthDiameter / 2;

        double volumeSun = (4.0 / 3) * PI * Math.pow(sunRadius, 3);
        double volumeEarth = (4.0 / 3) * PI * Math.pow(earthRadius, 3);

        double ratio = volumeSun / volumeEarth;

        System.out.println("a) Volume of Earth: " + volumeEarth + " cubic miles");
        System.out.println("b) Volume of Sun: " + volumeSun + " cubic miles");
        System.out.println("c) Ratio Sun/Earth volume: " + ratio);
    }
}
