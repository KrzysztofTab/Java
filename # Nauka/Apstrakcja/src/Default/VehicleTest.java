package Default;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new SpeedCar();// poliformizm

        car.speedUp();

        System.out.println(car.toString() + car.getSpeed() + "km/h");

    }
}
