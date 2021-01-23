package Zadania.Employee;

public class PersonalFullTime extends Employee {
    private static final double YEARLY_BONUS = 0.05;
    private double salaryMonth;

    public PersonalFullTime(String nameEmployee, double salaryMonth) {
        super(nameEmployee);
        this.salaryMonth = salaryMonth;
    }

    public double getSalaryMonth() {
        return salaryMonth;
    }

    public void setSalaryMonth(double salaryMonth) {
        this.salaryMonth = salaryMonth;
    }

    @Override
    double getMonthlySalary() {
        return salaryMonth;
    }

    @Override
    double getYearlySalary() {
        double yearSalary = salaryMonth * MONTHS_OF_THE_YEAR;
        double bonus = yearSalary * YEARLY_BONUS;
        return yearSalary + bonus;
    }
}
