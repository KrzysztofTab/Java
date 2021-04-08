public class NumberAdder {
    public static void main(String[] args) {
        int number = sum(3);
        System.out.println(number);
    }

    static int sum(int n) {
        int sum = 0;
        while (n > 0) {
            sum = sum + n;
            n--;
        }
        return sum;
    }
}
