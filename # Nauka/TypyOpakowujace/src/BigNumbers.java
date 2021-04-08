
import java.math.BigInteger;

public class BigNumbers {
    public static void main(String[] args) {
        double a = 0.7;
        double b = 0.3;
        System.out.println(a-b);
        System.out.printf("%.2f",(a-b));

        BigInteger big1 = new BigInteger("9999999999999999999999999999999");
        BigInteger big2 = new BigInteger("5555555555555555555555");
        BigInteger result = big1.add(big2);
        System.out.println("\nBigInteger: " + result);

    }
}

    //        add() - dodawanie
    //        subtract() - odejmowanie
    //        multiply() - mnożenie
    //        divide() - dzielenie