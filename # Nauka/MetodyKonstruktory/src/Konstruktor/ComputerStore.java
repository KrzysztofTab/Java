package Konstruktor;

public class ComputerStore {
    public static void main(String[] args) {
//        po utworzeni konstruktora w clasie "Computre" w nawiasacj podajesz zadeklarowane argumenty
        Computer comp1 = new Computer("Intel i7", 8192); //tworzę nowy komputer
        Computer comp2 = new Computer("Intel i5", 4096); //tworzę nowy komputer
        ComputerJedenParam comp3 = new ComputerJedenParam("Intel Celeron");

        comp1.printInfo();
        comp2.printInfo();
        comp3.printInfo();
    }
}