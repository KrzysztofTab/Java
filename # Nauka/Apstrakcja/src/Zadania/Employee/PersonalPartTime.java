package Zadania.Employee;

public class PersonalPartTime extends Employee{
    private int hours;
    private double hourlyWage;

    public PersonalPartTime(String nameEmployee, int hours, double hourlyWage) {
        super(nameEmployee);
        this.hours = hours;
        this.hourlyWage = hourlyWage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    @Override
    double getMonthlySalary() {
        return hours * hourlyWage;
    }

    @Override
    double getYearlySalary() {
        return getMonthlySalary()*MONTHS_OF_THE_YEAR;
    }
}
