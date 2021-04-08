package Car;

class CarShop {

    public static void main(String[] args) {

//        obiekt tworzymy na podstawie szablonu zawartego w klasie
//        new Car - obiekt
//        Car audi - jest to referenacja wskazujaca nam obiekt
        Car audi = new Car();
        audi.brand = "Audi";
        audi.model = "A4";
        audi.doors = 4;
        audi.carColor = "Czarny";
        audi.wheelsColor = "Srebrny";
        audi.tiresColor = "Czarny";
        String audiInfo = audi.brand + " " + audi.model
                + ", Drzwi: " + audi.doors
                + ", Kolor nadwozia: " + audi.carColor
                + ", Kolor felg: " + audi.wheelsColor
                + ", Kolor opon: " + audi.tiresColor;
        System.out.println("Wybrałeś następujący samochód: ");

        Car bmw = audi;
        bmw.model = "A5";
        System.out.println(audiInfo);
        System.out.println(bmw.model);

    }
}
