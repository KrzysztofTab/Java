package Ex02;

import Ex02.Pair;

public class PairTest {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<>("Ania", 1987);
        Pair<Double, Double> p2 = new Pair<>(20.39, 5.55);
        Pair<String, String> p3 = new Pair<>("Lotek", "Bułka");

        printPair(p1);
        printPair(p2);
        printPair(p3);
    }

    private static <T, V> void printPair(Pair<T, V> pair) {
        System.out.println("< " + pair.getT() + "; " + pair.getV() + " >");
    }
}
