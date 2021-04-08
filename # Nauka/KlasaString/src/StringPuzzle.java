import java.util.Scanner;

public class StringPuzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ile wyrazów chcesz wpowadzić: ");
        int manyWords = sc.nextInt();
        sc.nextLine();

        String[] words = new String[manyWords];

        for (int i = 0; i < manyWords; i++) {
            System.out.println("Podaj wyraz: ");
            words[i] = sc.nextLine();
        }

        StringBuilder build = new StringBuilder();
        for (int i = 0; i < manyWords; i++) {
            build.append(words[i].charAt(words[i].length() - 1));
        }

        System.out.println("Nowe słowo: " + build.toString());

        sc.close();
    }
}
