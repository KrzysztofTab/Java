package For;

import java.util.Scanner;

public class ForEachProblem {
    public static void main(String[] args) {
        int[] mumbers = new int[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < mumbers.length; i++) {
            System.out.println("Podaj liczbę:");
            mumbers[i] = sc.nextInt();
        }
        for (int i = 0; i < mumbers.length; i++) {
            System.out.println(mumbers[i]);
        }
        sc.close();
    }
}