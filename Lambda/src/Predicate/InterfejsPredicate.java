package Predicate;

import java.util.function.Predicate;

public class InterfejsPredicate {
    public static void main(String[] args) {
        int personAge = 19;

//        interfejsowi Predicate -  boolean test(T t);
        Predicate<Integer>checklfAdult = age -> age >=18;
        checklfAdult.test(personAge); //które będzie pasowało do sygnatury metody test().
    }
}

//  Predicate<T> - posiada metodę test(T t) - przyjmuje argument typu T i zwraca wartość typu boolean,