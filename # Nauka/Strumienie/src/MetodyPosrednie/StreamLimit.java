package MetodyPosrednie;

//metod pośrednich (intermediate), które pozwalają wykonywać transformacje strumieniu przed metodami Terminalnymi

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamLimit {
    public static void main(String[] args) {
        List<Integer> collect = IntStream.iterate(0, n -> n + 1)
                .limit(20)                  //zwraca nowy strumien z limitem wartosci w ty przpadku "20"
                .boxed()                    // zwraca nowy stumień INTEGER
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
