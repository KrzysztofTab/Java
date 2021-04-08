package Example01;
import java.util.Locale;
import java.util.Scanner;

public class Calkulator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

//        podaj liczbę a
        double a = input.nextDouble();
        input.nextLine();
//        podaj operator
        String operator = input.nextLine();
//        podaj liczbę b
        double b = input.nextDouble();

        Numbers calc = new Numbers();
        double result = calc.calculate(a, b, operator);
        System.out.println(a + operator + b + " = " + result);

        input.close();
    }
}
