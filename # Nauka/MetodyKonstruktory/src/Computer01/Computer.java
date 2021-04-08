package Computer01;

public class Computer {
    String processor;
    int memory;

//          I - Wskazujemy jedynie, że chcemy wyświetlić pola klasy, czyli processor i memory
//          I - metoda do wyswietlania podanych parametrów
//      void printInfo(){
//      System.out.println(processor+" "+memory);

//          II - Metoda getInfo() zwraca napis powstały z połączenia nazwy procesora oraz ilości pamięci
    String getInfo() {
        return processor + " " + memory;
    }

}
