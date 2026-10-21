public class FuelConsumption {
    public static void main(String[] args) {
        double normalPer100km = 8;
        double roughPer100km = normalPer100km * 1.15;
        double tank = 40;

        double normalDistance = tank / normalPer100km * 100;
        double roughDistance = tank / roughPer100km * 100;

        System.out.println("Distance on normal road(40L tank): " + normalDistance + " km");
        System.out.println("Distance on rough road(40L tank): " + roughDistance + " km");
    }
}


