package House;

public class Resources {
    House house;
    int Tv;

    public Resources(House house, int tv) {
        this.house = house;
        Tv = tv;
    }

    //    takeShower() - metoda która odpowiada wzięciu prysznica przez 1 osobę.
//    Jeden prysznic powoduje zużycie 48 litrów wody
    public void takeShower() {
        double water = house.getWater() - 48.00;
        System.out.println("Bierzemy prysznic." + "\n   Pozostałe zasoby:");
        System.out.println("   Woda: " + water + "l.; " + house.fuel + "l.");
        house.setWater(water);
    }

    //    takeBath() - metoda, która odpowiada pojedynczej kąpieli. Jedna kąpiel powoduje zużycie 86 litrów wody.
    public void takeBath() {
        double water = house.getWater() - 86.00;
        System.out.println("Bierzemy kąpiel." + "\n   Pozostałe zasoby:");
        System.out.println("   Woda: " + water + "l.; " + house.fuel + "l.");
        house.setWater(water);
    }

    //    makeDinner() - metoda, która symuluje ugotowanie obiadu.
//    Operacja ta powoduje zużycie 0,1L ropy (do wytworzenia prądu) i 4L wody.
    public void makeDinner() {
        double water = house.getWater() - 4.00;
        double fuel = house.getFuel() - 1.00;
        System.out.println("Gotujemy obiad." + "\n   Pozostałe zasoby:");
        System.out.println("   Woda: " + water + "l.; " + fuel + "l.");
        house.setWater(water);
        house.setFuel(fuel);
    }

    //    boilWater() - metoda, która symuluje ugotowanie wody w czajniku elektrycznym.
//    Operacja ta powoduje zużycie 0,05L ropy (do wytworzenia prądu) oraz 0,5 litra wody (taka jest pojemność czajnika).
    public void boilWater() {
        double water = house.getWater() - 0.50;
        double fuel = house.getFuel() - 0.50;
        System.out.println("Gotujemy wodę." + "\n   Pozostałe zasoby:");
        System.out.println("   Woda: " + water + "l.; " + fuel + "l.");
        house.setWater(water);
        house.setFuel(fuel);
    }

    //    watchTv() - metoda, która przyjmuje jako parametr liczbę godzin, przez jaką oglądaliśmy telewizję.
//    Oglądanie telewizora przez 1 godzinę, powoduje zużycie 0,06L ropy (do wytworzenia prądu).
//    Zakładamy, że zawsze telewizor oglądamy licząc w pełnych godzinach.
    public void watchTv() {
        double fuel = house.getFuel()-(Tv * 0.60);
        System.out.println("Oglądamy TV przez " + Tv + "\n   Pozostałe zasoby:");
        System.out.println("   Woda: " + house.getWater() + "l.; " + fuel + "l.");
        house.setFuel(fuel);
    }
}
