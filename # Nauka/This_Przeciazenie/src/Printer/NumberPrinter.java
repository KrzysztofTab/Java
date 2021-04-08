package Printer;

public class NumberPrinter {

    void printNumber(int a) {
//        System.out.println("tworzy a");
        System.out.println(a);
    }

    void printNumber(int a, int b) {
        printNumber(a);
//        System.out.println("tworzy b");
        System.out.println(b);
    }

    void printNumber(int a, int b, int c) {
        printNumber(a,  b);
        System.out.println(+c);
    }
}
