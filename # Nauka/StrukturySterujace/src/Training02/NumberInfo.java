package Training02;

import java.util.Random;

public class NumberInfo {
    public static void main(String[] args) {
        int number = new Random().nextInt(1000);
        Info info = new Info();
        System.out.println("Wylosowana liczba: " + number);
        info.comparisonInfo(number, 500);
        info.evenInfo(number);
        info.getVerificationNumber(number);
        System.out.println("Uzupełnienie do 4 cyfr " +info.getVerificationNumber(number));

    }
}