public class NumberAdder01 {
    public static void main(String[] args) {
        int number = sum(10);
        System.out.println(number);
    }

    static int sum(int n) {
//        int sum = 0;
//        while (n > 0) {
//            sum = sum + n;
//            n--;
//        }
//        return sum;
        return n > 1 ? n + sum(n - 1) : n;    //  operator trójargumentowy
    }                                           // najczęściej stosowany jest właśnie przy wywołaniach rekurencyjnych
}
