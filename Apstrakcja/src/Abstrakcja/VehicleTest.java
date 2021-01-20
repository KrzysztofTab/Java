package Abstrakcja;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle car = new Car();// poliformizm
        Vehicle boat = new Boat();// poliformizm
        Vehicle plane = new Plane();// poliformizm
        car.speedUp();
        boat.speedUp();
        plane.speedUp();
        System.out.println(car.toString() + car.getSpeed() + "km/h");
        System.out.println(boat.toString() + boat.getSpeed() + "km/h");
        System.out.println(plane.toString() + plane.getSpeed() + "km/h");
    }
}
