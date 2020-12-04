package CompMetody;

public class ComputerStore {
    public static void main(String[] args) {

//        korzystamy z klasy ComputerFactory
//        tworzymy nowy obiekt "factory = new ComputerFactory()"
        ComputerFactory factory = new ComputerFactory();
//        tworzymy dwa obiekty "Computer" o referencji "comp01" i "comp02"
        Computer comp01 = factory.create("Intel i5", 16390);
//                                                      "Tworzę nowy komputer" - konstruktor
        Computer comp02 = factory.create("AMD Ryzar 1700", 24585);
//                                                      "Tworzę nowy komputer" - konstruktor

        System.out.println(comp01.getInfo());
        System.out.println(comp02.getInfo());

//        kient chce dodac 4GB ramu
//        korzystamy z klasy ComputerUpgrade
        ComputerUpgrade upgrade = new ComputerUpgrade();
//        korzystamy z metody dodawania pamieci zawartej w clasie upgrade
        upgrade.addMemory(comp01, 4096);
//        wyswietla wartość po dodaniu pamieci
        System.out.println("\n"+comp01.getInfo());


    }
}
