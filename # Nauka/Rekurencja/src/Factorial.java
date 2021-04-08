public class Factorial {
    public static void main(String[] args) {
        int factArg = 5;
        int result = factorial(factArg);
        System.out.println("Silnia " + factArg + " = " + result);
    }

    static int factorial(int n) {
//        if ( n == 0 || n == 1) {
//            return 1;
//        }else{
//            return n* factorial(n -1);
//        }
        if ( n < 0)
            throw new IllegalArgumentException("Tylko liczby naruralne");  // kiedy "n" bedzie ("-") żucamy argument
        return n == 0 || n == 1 ? 1 : n * factorial(n - 1);
    }
}
//silnia -  0!=1; 1!=1; 2!=1*2; 3!=1*2*3