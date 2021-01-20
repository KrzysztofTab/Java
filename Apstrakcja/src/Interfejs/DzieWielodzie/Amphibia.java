package Interfejs.DzieWielodzie;

public class Amphibia implements Car, Boat {

    @Override
    public void printName() {
        System.out.print("Amfibia to trochę ");
        Car.super.printName();
        System.out.print(" a trochę ");
        Boat.super.printName();
    }
}
