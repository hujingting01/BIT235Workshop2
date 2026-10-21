package BIT235Workshop2;

public class FuelConsumption {
    public static void main(String[] args) {
        double tankCapacity = 40;
        double fuelPer100kmNormal = 8;

        double kmPerLitreNormal = 100.0 / fuelPer100kmNormal;
        double distanceNormal = tankCapacity * kmPerLitreNormal;

        double fuelPer100kmRough = fuelPer100kmNormal * 1.15;
        double kmPerLitreRough = 100.0 / fuelPer100kmRough;
        double distanceRough = tankCapacity * kmPerLitreRough;

        System.out.println("Distance on normal road: " + distanceNormal + " km");
        System.out.println("Distance on rough road: " + distanceRough + " km");
    }
}


