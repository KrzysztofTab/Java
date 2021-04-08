package EX01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionTask {
    public static void main(String[] args) {
        Random random = new Random();  // losowanie
        List<Integer> randomNumbers = new ArrayList<>();
        generate(randomNumbers, 10, () -> random.nextInt(200));  // generujemy liczby 10 z 200
        consume(randomNumbers, x -> System.out.print(x + " ")); // wyświetla
        System.out.println();
        filterList(randomNumbers, x -> x % 2 == 0);
        consume(randomNumbers, x -> System.out.print(x + " ")); // wyświetla
    }

    private static <T> void generate(List<T> list, int toGeneraye, Supplier<T> supplier) {  // InterfejsSupplier
        for (int i = 0; i < toGeneraye; i++) {
            list.add(supplier.get());  // metoda get() w Supplier
        }
//        Supplier<Integer> numberSupplier = () -> random.nextInt(200);  // jest to metoda = generate
//        for (int i= 0 ; i<10; i++){
//            randomNumbers.add(numberSupplier.get());
//        }
    }

    private static <T> void consume(List<T> list, Consumer<T> consumer) {  // InterfejsConsumer
        for (T t : list)
            consumer.accept(t); // metoda accept(T t) w Consumer

//        Consumer<Integer> consumer = x -> System.out.println(x + " ");     //  jest to metoda = consume
//            consumer.accept(randomNumber);
//        }
    }

    private static <T> void filterList(List<T>list, Predicate<T>predicate){  // InterfejsPredicate
        list.removeIf(predicate);                           // WERSJA TRZECIA

//        list.removeIf(predicate::test);                   // WERSJA DRUGA

//        Iterator<T> iterator = list.listIterator();       // WERSJA PIERWSZA
//        while (iterator.hasNext()){
//            T tmp = iterator.next();
//            if(predicate.test(tmp)){
//                iterator.remove();
//            }
//        }
    }
}