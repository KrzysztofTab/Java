package Funcion;

import java.util.function.Consumer;
import java.util.function.Function;

public class InterfejsyFuncion {
    public static void main(String[] args) {
        String original = "   WIELKI NAPIS   ";

//        Interfejs Function  -  R apply(T t);
        Function <String, String> function = text ->text.toLowerCase().trim();
//        W celu wywołania utworzonej funkcji z jakimś argumentem należy wywołać metodę,
//        która zdefiniowana jest w naszym interfejsie funkcyjnym. U nas chodzi o metodę apply().
        String lowerCasseTrim = function.apply(original);
        System.out.println(lowerCasseTrim);
   }
}

//  Function<T, R> - posiada metodę apply(T t) - reprezentuje funkcję przyjmującą argument typu T i zwracającą argument typu R,