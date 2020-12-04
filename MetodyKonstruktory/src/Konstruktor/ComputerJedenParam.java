package Konstruktor;

public class ComputerJedenParam {
        String processor;
        int memory;
//        int memory = 81369;


//          Do klasy Computer dodaliśmy konstruktor, który przyjmuje dwa parametry
//          Przykładowo jeśli chcemy żeby wszystkie komputery miały 8GB (8192MB) ramu,
//          ale różne procesory, to lepiej będzie zdefiniować konstruktor,
//          który przyjmuje tylko typ procesora, ale nie ilość pamięci.
    ComputerJedenParam(String proc){
        processor = proc;
//          Częstą praktyką jest też inicjowanie pól zawsze wewnątrz konstruktorów
        memory = 6192;
        System.out.println("Tworzę nowy komputer");
    }

        void printInfo() {
            System.out.println(processor + ", " + memory);
        }
}
