package ProjektyWlasne.Ex01;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static final Scanner CONSOLE = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> userNumbers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Podaj liczbę z przedziału [1 - 49]: ");
            int nextNumber = getInt();
            while (nextNumber >49){
                System.err.println("Podałeś za duża wartość");
                nextNumber=getInt();
            }
            nextNumber = getNextNumber(userNumbers, nextNumber);
            userNumbers.add(nextNumber);
        }
        System.out.println(userNumbers);
    }

    private static int getNextNumber(List<Integer> userNumbers, int nextNumber) {
        for (int number : userNumbers) {
            if (number == nextNumber) {
                System.err.println("Ta liczba jest już podana: " + number);
                nextNumber = getInt();
            }
        }
        return nextNumber;
    }

    private static int getInt() {
        try {
            return CONSOLE.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("Nie poprawne dane");
        } finally {
            CONSOLE.nextLine();
        }
        return getInt();
    }
}
