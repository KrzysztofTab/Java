public class StringsTest {
    public static void main(String[] args) {
        long time1, time2;

        long startTime = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
//            append() - metoda w wielu przeciążonych wersjach, która jako parametr przyjmuje napisy,
//            liczby lub obiekty i dokleja je do budowanego napisu
            builder.append(i);
            builder.append(" ");
        }
        String numbers = builder.toString();
        time1 = System.nanoTime() - startTime;
        System.out.println("Time1: " + time1);
        System.out.println(numbers);

        startTime = System.nanoTime();
        String numbers2 = "";
        for (int i = 0; i < 1000; i++) {
            numbers2 = numbers2 + i + " ";
        }
        time2 = System.nanoTime() - startTime;
        System.out.println("Time2: " + time2);
        System.out.println(numbers2);

        System.out.println("Time2 / Time1: " + time2 / time1);
    }
}
