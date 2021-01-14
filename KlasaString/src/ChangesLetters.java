import java.util.Scanner;

public class ChangesLetters {
    public static void main(String[] args) {
        String text = readText();
        String textTrim = changeText(text);
        System.out.println("Tekst po transormacji: " + textTrim);
    }

    private static String readText() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        String text = sc.nextLine();
        return text;
    }

    private static String changeText(String text) {
        String textTrim = text.trim();
        char firstChar = textTrim.charAt(0);
        if (Character.isUpperCase(firstChar)) {
            textTrim = textTrim.toUpperCase();
        } else if (Character.isLowerCase(firstChar)) {
            textTrim = textTrim.toLowerCase();
        }
        return textTrim;
    }
}
