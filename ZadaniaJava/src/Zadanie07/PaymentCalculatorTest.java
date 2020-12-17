package Zadanie07;

import java.util.Scanner;

public class PaymentCalculatorTest {
    public static void main(String[] args) {
//          dane pracownika
        Scanner sc = new Scanner(System.in);
        System.out.println("\n"+"Wpisz pokoleji imie, nazwisko, miesieczny dochud.");
        Employee employee = new Employee(sc.nextLine(), sc.nextLine() , sc.nextDouble());

        PaymentCalculator paymentCalculator = new PaymentCalculator();
        paymentCalculator.nettoYearPayment(employee);
        paymentCalculator.bruttoYearPayment(employee);
        System.out.println("\n"+employee.getFirstName() + " " + employee.getLastName() +
                " zarobił w zeszłym roku "
                + paymentCalculator.bruttoYearPayment(employee) + "zł brutto z tego otrzymał "
                + paymentCalculator.nettoYearPayment(employee) + "zł netto");
    }
}
