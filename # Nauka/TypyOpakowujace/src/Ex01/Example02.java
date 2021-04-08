package Ex01;

import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
        String text = readWord();
        int digits = countDigits(text);
        System.out.println("\nLiczba cyfr w tekscie: " + digits);
        int letters = countLetters(text);
        System.out.println("Liczba liter w tekscie: " + letters);
        try {
            int biggestDigits = findBiggestDigit(text);
            System.out.println("Najwieksza cyfraz tekscie to: " + biggestDigits);
        }catch(DigitNotFoundException e){
            System.out.println("W tekście nie znajdowała się żadna cyfra");
        }

    }

    private static int findBiggestDigit(String text) {
        char[] chars = text.toCharArray();
        final int notFound = -1;  // w teksie nie może być licz ujemnych
        int biggestNumber = notFound;
        for (char aChar : chars) {
            if (Character.isDigit(aChar)) {
                int digit = Character.getNumericValue(aChar);   // zamieniamy char na int w celu porównania
                biggestNumber = Integer.max(biggestNumber, digit);  // porównujemy bigeNum.. z digit
            }
        }
        if (biggestNumber == notFound)
            throw new DigitNotFoundException();
        return biggestNumber;
    }

    private static int countLetters(String text) {
        char[] chars = text.toCharArray();
        int letters = 0;
        for (char aChar : chars) {
            if (Character.isLetter(aChar))  // sprawdzam, czy kolejny znak jest literą
                letters++;
        }
        return letters;
    }

    private static int countDigits(String text) {
        char[] chars = text.toCharArray();
        int digits = 0;
        for (char aChar : chars) {
            if (Character.isDigit(aChar))  // sprawdzam, czy kolejny znak jest cyfrą
                digits++;
        }
        return digits;
    }

    private static String readWord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj dowolny napis z literami i cyframi:");
        return sc.nextLine();
    }

    private static class DigitNotFoundException extends RuntimeException { }
}

