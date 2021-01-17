package Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class CalcApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        liczby wczytujemy z kropką
        sc.useLocale(Locale.US);
        double a = 0;
        double b = 0;
        String operator = null;
        boolean readComplete1 = false;
        boolean readComplete2 = false;
        while (!readComplete1) {
            try {
                System.out.println("Podaj pierwszą liczbę: ");
                a = sc.nextDouble();
                sc.nextLine();
                readComplete1 = true;
            } catch (InputMismatchException e) {
                System.err.println("Wprowadzono niepoprawne dane, zacznij jeszcze raz");
                sc.nextLine();
            }
        }
        System.out.print("Podaj operator (+, -, * lub /): ");
        operator = sc.nextLine();
        while (!readComplete2) {
            try {
                System.out.println("Podaj drugą liczbę: ");
                b = sc.nextDouble();
                readComplete2 = true;
            } catch (InputMismatchException e) {
                System.err.println("Wprowadzono niepoprawne dane, zacznij jeszcze raz");
                sc.nextLine();
            }
        }
        try {
            double result = Calculator.calculate(a, b, operator);
            System.out.println(a + " " + " " + operator + " " + b + " = " + result);
        } catch (UnknownOperatorException | ArithmeticException e) {
            System.err.println(e.getMessage());
            System.err.println("Nie udało się obliczyć wyniku wyrażenia " + a + " " + operator + " " + b);
        }
    }
}