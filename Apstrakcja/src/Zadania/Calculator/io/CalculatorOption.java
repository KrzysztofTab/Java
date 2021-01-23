package Zadania.Calculator.io;

import Zadania.Calculator.exception.NoSuchOptionException;
import Zadania.Calculator.model.Circle;
import Zadania.Calculator.model.Square;
import Zadania.Calculator.model.Triangle;
import Interfejs.Rectangle;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CalculatorOption {
    private static final Scanner sc = new Scanner(System.in);

    public void controlLoop() {
        Option option;
        do {
            printOptions();
            option = getOption();
            switch (option) {
                case CIRCLE -> readCirkle();
                case TRIANGLE -> readTriangle();
                case RECTANGLE -> readRectangle();
                case SQUARE -> readSquare();
                case EXIT -> exit();
                default -> printLine("Nie ma takiej opcji, wprowadź ponownie:");
            }
        } while (option != Option.EXIT);
    }

    private void readSquare() {
        CalculatorOption.printLine("Podaj długość boku kwadratu 'a': ");
        Square square = new Square(sc.nextDouble());
        printLine("Pole kwadratu wynois: " + square.calculateArea());
        printLine("Obwód kwadratu wynosi: " + square.calculatePerimeter());
    }

    private void readRectangle() {
        CalculatorOption.printLine("Podaj długości boków prostokąta 'a', 'b': ");
        Rectangle rectangle = new Rectangle(sc.nextDouble(), sc.nextDouble());
        printLine("Pole prostokąta wynois: " + rectangle.calculateArea());
        printLine("Obwód prostokąta wynosi: " + rectangle.calculatePerimeter());
    }

    private void readTriangle() {
        CalculatorOption.printLine("Podaj długości boków trójkąta 'a', 'b', 'c': ");
        Triangle triangle = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        printLine("Pole trójkąta wynois: " + triangle.calculateArea());
        printLine("Obwód trójkąta wynosi: " + triangle.calculatePerimeter());
    }

    private void readCirkle() throws InputMismatchException {
        CalculatorOption.printLine("Podaj promień okregu 'r': ");
        Circle circle = new Circle(sc.nextDouble());
        printLine("Pole koła wynois: " + circle.calculateArea());
        printLine("Obwód koła wynosi: " + circle.calculatePerimeter());
    }

    private void printOptions() {
        printLine("\nWybierz figure: \n");
        for (Option option : Option.values()) {
            printLine(option.toString());
        }
    }

    private Option getOption() {
        boolean optionOk = false;
        Option option = null;
        while (!optionOk) {
            try {
                option = Option.createFromInt(getInt());
                optionOk = true;
            }catch (InputMismatchException e) {
                System.out.println("Wprowadziłeś dane w złym formacie, spróbuj ponownie");
            } catch (NoSuchElementException e) {
                System.out.println("Wybrany identyfikator kształtu jest niepoprawny, spróbuj ponownie");
            }
        }
        return option;
    }

    public static int getInt() {
        try {
            return sc.nextInt();
        } finally {
            sc.nextLine();
        }
    }

    private void exit() {
        printLine("Koniec programu");
        sc.close();
    }

    public static void printLine(String text) {
        System.out.println(text);
    }
}
