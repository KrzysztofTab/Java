//Ponieważ listy, zbiory i kolejki implementują interfejs Collection,
// a ten interfejs dziedziczy po interfejsie Iterable,
// to metoda iterator() jest dostępna we wszystkich tych kolekcjach

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetIterator {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(45);
        numbers.add(4);
        numbers.add(150);
        numbers.add(19);
        numbers.add(69);

        Iterator<Integer> numIterator = numbers.iterator();
//        Metoda hasNext() sprawdza, czy istnieje kolejny element kolekcji, ale do niego nie przechodzi
        while (numIterator.hasNext()){
//            metoda next() przechodzi do kolejnego elementu i go zwraca,
//            dzięki czemu możemy go przypisać np. do zmiennej.
            int number = numIterator.next();
            System.out.println(number);
        }
    }
}
