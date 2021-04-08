import java.math.BigDecimal;

public class BigDesimals {
    public static void main(String[] args) {
        double a = 0.7;
        double b = 0.3;
        System.out.println(a - b);

        BigDecimal big1 = new BigDecimal("0.7");
        BigDecimal big2 = new BigDecimal("0.3");
        BigDecimal result = big1.subtract(big2);   // odejmowanie
        System.out.println(result);

        double pow = Math.pow(9, 2);
        System.out.println("9 do potęgi ^ 2 = " + pow);  // 9 do potęgi

        double sqrt = Math.sqrt(9);   //  pierwiastek z 9
        System.out.println("Pierwiastek z 9 = " + sqrt);

//        double area = 3.14 * 9 * 9;
        double arae = Math.PI * Math.pow(9, 2);
        System.out.printf("Pole koła o promieniu 9cm :%.2f", arae);
    }
}

