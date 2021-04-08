package Car;

public class Car {
    int year;
    String brand;
    String model;
    String color;

//    konstruktor1
    Car(int yearA, String brandA, String modelA, String colorA) {
//        wywołujemy konstruktor2, który ustawi nam rok, markę i model
        this(yearA, brandA, modelA);
//        i dodatkowo ustawiamy jeszcze kolor
        this.color = colorA;
    }
//    konstruktor2
    Car(int yearB, String brandB, String modelB){
        this.year = yearB;
        this.brand = brandB;
        this.model = modelB;
}

}
