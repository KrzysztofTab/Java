package ClassyGeneryczne;

public class GenericTester {
    public static void main(String[] args) {
        // definiujemy kontener przechowujący liczby całkowite
        ContainerNEW<Integer> integers = new ContainerNEW<>();
        // przypisujemy nową tablicę typu Integer
        integers.setArray(new Integer[5]);
        // do pierwszego elementu przypisujemy liczbę 5
        integers.getArray()[0] = 5;

        // tworzymy kontener przechowujący obiekty String
        ContainerNEW<String> strings = new ContainerNEW<>();
        // przypisujemy tablicę typu String
        strings.setArray(new String[10]);
        // przypisujemy 1 i 2 element tablicy
        strings.getArray()[0] = "Ania";
        strings.getArray()[1] = "Basia";

        // odczytanie danych bez konieczności rzutowania!
        Integer num = integers.get(0);
        String str = strings.get(0);
        strings.printObjects();

        // wyświetlenie wartości
        System.out.println(num);
        System.out.println(str);
    }
}

