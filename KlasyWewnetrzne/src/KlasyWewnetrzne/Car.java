package KlasyWewnetrzne;

/*
 W Javie możliwe jest jednak definiowanie różnego rodzaju klas wewnętrznych (eng. inner class),
 które będą szczególnie przydatne w przypadku tworzenia struktur danych
 Klasa wewnętrzna w odróżnieniu od "zwykłej" może być prywatna i niewidoczna dla kogoś korzystającego
 z klasy zewnętrznej. Dodatkowo może być oznaczana słowami kluczowymi,
 które już również znasz - final, abstract, public, protected.
 Klasy wewnętrzne wykorzystywane są najczęściej wtedy, gdy chcemy w niej mieć dostęp do klasy otaczającej
 bez konieczności tworzenia i przekazywania jej instancji lub gdy chcemy ją wykorzystać tylko
 w celach pomocniczych i nie ma sensu jej wydzielać tak, aby inni również mogli z niej korzystać.?
*/
public class Car {
    private final Engine engine;
    private int fuel;

    public Car() {
        engine = new Engine("Ferrari");
        System.out.println("Utworzono samochód z silnikiem " + engine.engineType);

    }
//    metoda - spala paliwo w baku
    public void go() throws InterruptedException {
        while (fuel > 0) {
            engine.consumeFuel();
            System.out.println("Pozostało " + fuel + " litrów paliwa");
//            Thread.sleep(1000) - wstrzymujemy wątek (czyli w naszej sytuacji cały program) na 1 sekundę
//            sleep() może wygenerować wyjątek kontrolowany InterruptedException,
            Thread.sleep(1000);
        }
        System.out.println("Brak paliwa");
    }

//    metoda - tankowania samochodu
    public void refuel(int liters) {
        fuel = fuel + liters;
    }

    //    clasa wewnetrzna - Jedną z zalet stworzenia klasy wewnątrz klasy
    //    jest to, że mamy dostęp do wszystkich pól klasy opakowującej, nawet jeśli nie udostępnia ona gettera.
    public class Engine {
        private final String engineType;
        private static final int FUEL_CONSUPTION = 20;

        //         konstruktor
        public Engine(String type) {
            engineType = type;
        }

        //        metoda
        public void consumeFuel() {
            fuel = fuel - FUEL_CONSUPTION;
        }
    }
}
