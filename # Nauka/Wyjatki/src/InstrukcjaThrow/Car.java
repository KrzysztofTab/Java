package InstrukcjaThrow;

public class Car {
    private static final double FUEL_CONSUMPTION = 8; // 8l na 100 km
    private static final double MAX_FUEL = 50;
    private double fuel;

    //    metoda symuluje zatankowanie samochodu
    public void refuel(double additionalFuel) {
        if (fuel + additionalFuel > MAX_FUEL)

//            Wyjątki to w rzeczywistości obiekty, które rzucamy przy pomocy instrukcji throw.
//            Działa to podobnie do zwracania obiektu poprzez instrukcję return jako wynik metody.
            throw new IllegalArgumentException("Ne można zatankować tyle paliwa! Pojemność baku: " + MAX_FUEL
                    + " Można zatnkować: " + (MAX_FUEL - fuel));
        else
            fuel += additionalFuel;
    }

    //    metoda symuluje przejechanie 100km na 8l paliwa
    public void drive() {
        if (fuel - FUEL_CONSUMPTION < 0)
            throw new IllegalStateException("Masz za mało paliwa, zatankuj!");
        else
            fuel -= FUEL_CONSUMPTION;
    }

    @Override
    public String toString() {
        return "Stan paliwa: " + fuel;
    }
}
