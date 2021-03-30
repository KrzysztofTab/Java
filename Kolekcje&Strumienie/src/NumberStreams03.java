import java.util.stream.IntStream;

public class NumberStreams03 {
    public static void main(String[] args) {
        IntStream.range(1950, 2150)
                // lepiej opakować kod w metodę i użyć odnośnika do metody wewnątrz strumienia
//                .filter(y -> (y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
                .filter(NumberStreams03::isLeapYear)
                .forEach(System.out::println);
    }

    public static boolean isLeapYear(int year) {
        boolean every4Years = year % 4 == 0;
        boolean notEvery100Years = year % 100 != 0;
        boolean every400Years = year % 400 == 0;

        return (every4Years && notEvery100Years) || every400Years;
    }
}
