public class OddTester {
    public static void main(String[] args) {
        checkNumber(10);
        checkNumber(11);
        checkNumber(13);
        checkNumber(20);
    }

    private static void checkNumber(int n) {
        String check = n % 2 == 0 ? "Parzysta" : "Nieparzysty";
        System.out.println(n + " " + check);
    }
}
