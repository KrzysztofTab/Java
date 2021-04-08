package InstrukcjaThrow;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car();
        try {
            car.refuel(10);
        } catch (IllegalArgumentException ex) {
//            'getMessage' podaję nam informację zapisaną przy metodzie "IllegalArgumentException" w nawiasach
            System.err.println(ex.getMessage());
        }
        System.out.println(car);
        try {
            car.drive();
            car.drive();
        } catch (IllegalStateException ex) {
            System.err.println(ex.getMessage());
        }
        System.out.println(car);
    }
}
