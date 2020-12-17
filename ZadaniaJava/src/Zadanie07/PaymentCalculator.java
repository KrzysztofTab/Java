//      nettoYearPayment zwraca roczną sumę wypłat danego pracownika,
//      bruttoYearPayment zwraca roczną sumę wypłat wraz z dodatkowymi podatkami (ZUS, podatki do urzędu skarbowego).

package Zadanie07;

public class PaymentCalculator {

    private final static double ZUS=1000;

    public double nettoYearPayment(Employee employee) {
        return employee.getSalary() *12;
    }

    public double bruttoYearPayment(Employee employee) {
        double nettoSalary = employee.getSalary();
        double tax = nettoSalary * 0.2;
        return (nettoSalary+tax+ZUS)*12;
    }
}
