package Konstruktor;

public class Computer {
        String processor;
        int memory;

//    KONSTRUKTOR
//    Wewnątrz konstruktora możemy robić dokładnie te same rzeczy,
//    co wewnątrz metod, np. deklarować nowe zmienne i wywoływać inne metody.
//    Konstruktor służy do utworzenia nowego obiektu. Ma nazwę identyczną z nazwą klasy, w której się znajduje.
//    Nie ma określonego żadnego typu zwracanego - nawet void, a do jego wywołania używamy operatora new.

//    Do klasy Computer dodaliśmy konstruktor, który przyjmuje dwa parametry
    Computer(String proc, int mem){
        processor = proc;
        memory = mem;
        System.out.println("Tworzę nowy komputer");
    }

        void printInfo() {
            System.out.println(processor + ", " + memory);
        }
}
