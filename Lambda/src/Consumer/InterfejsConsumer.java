package Consumer;

import java.util.function.Consumer;

public class InterfejsConsumer {
    public static void main(String[] args) {

//        Interfejs Consumer  - void accept(T t);
//        Metoda print3Times() odpowiada takiemu wyrażenia lambda jak String print -> void,
//        czyli przyjmuje parametr typu String i nie zwraca nic w wyniku.
        Consumer<String> print3Times = print->{
            System.out.println(print);   //ramach ciała wyrażenia lambda wykonujemy kilka operacji
            System.out.println(print);   //  konkretnie wywołujemy trzykrotnie metodę System.out.println(),
            System.out.println(print);
        };
//         interfejs Consumer z metodą accept() jest typu void ( nie zwraca nic tylko wyświetla)
        print3Times.accept("abc");
        print3Times.accept("xxx");
    }
}

//  Consumer<T> - posiada metodę accept(T t) - przyjmuje argument typu T, ma za zadanie wykonać pewną operację i nie zwraca wyniku,