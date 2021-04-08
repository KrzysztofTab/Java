package Zadania.Employee;

abstract class Employee {
    public final int MONTHS_OF_THE_YEAR = 10;
    private String nameEmployee;

    public Employee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    @Override
    public String toString() {
        return nameEmployee + ", wypłata miesięczna: " + getMonthlySalary()
                + "zł, wypłata roczna: " + getYearlySalary()+"zł";
    }

    abstract double getMonthlySalary();

    abstract double getYearlySalary();
}