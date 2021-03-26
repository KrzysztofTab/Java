package MetodyPosrednie;

//metod pośrednich (intermediate), które pozwalają wykonywać transformacje strumieniu przed metodami Terminalnymi

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamBoxed {
    public static void main(String[] args) {
        List<Integer> collect = IntStream.rangeClosed(0, 10)
                .boxed()                        // do postaci kolekcji z liczb z 'int' na 'INTEGER'
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
