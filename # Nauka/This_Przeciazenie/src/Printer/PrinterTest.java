package Printer;

import Printer.NumberPrinter;

public class PrinterTest {
    public static void main(String[] args) {
        NumberPrinter np = new NumberPrinter();
        np.printNumber(5, 10); //wywołanie printNumber(int a, int b)
        System.out.println("\n");
        np.printNumber(5, 10, 15); //wywołanie printNumber(int a, int b, int c)
    }
}
