package Example01;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ReadText {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszy napis: ");
        String firstText = scanner.nextLine();
        System.out.println("Podaj drugi napis: ");
        String secondText = scanner.nextLine();
        boolean compareResult = compareLetters(firstText, secondText);
        if (compareResult){
            System.out.println("Napisy składają się z tych samych liter");
        }else  {
            System.out.println("Napis składa się z róznych liter");
        }
    }

    private static boolean compareLetters(String fText, String sText) {
        if (fText == null && sText == null)
            return true;
        if (fText == null || sText == null || fText.length() != sText.length())
            return false;
        char[] chars1 = fText.trim().toLowerCase().toCharArray();
        char[] chars2 = sText.trim().toLowerCase().toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        return Arrays.equals(chars1, chars2);
    }

}
