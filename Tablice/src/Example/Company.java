package Example;

public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Jan", "Nowak", 3500);
        employees[1] = new Employee("Marta", "Zięba", 3700);
        employees[2] = new Employee("Karol", "Wojak", 4500);
        employees[3] = new Employee("Tosia", "Zakrzewska", 5200);
        employees[4] = new Employee("Ireneusz", "Ostrowski", 3500);
        employees[5] = new Employee("Jagod", "Borkowski", 2900);
        employees[6]= new Employee("Mieszko", "Szymczak", 4900);
        employees[7] = new Employee("Agnieszka", "Głowacka", 4300);

        int employeeIndex = 6;
        System.out.println("\n"+employees[employeeIndex-1].getFirstName()+" "+
                employees[employeeIndex-1].getLastName()+": "+
                employees[employeeIndex-1].getSalary()+"zł");

//        błąd - ostatni indeks z 20 elementowej tablicy to 19
//        System.out.println(employees[20]);
//        System.out.println("Ten tekst się nie wyświetli, bo nastąpił błąd programu");

//        Wielkość tablicy - "length"
        int employeesSize = employees.length;
        System.out.println("\n"+"Wielkość tablicy: " + employeesSize);
        System.out.println("Ostatni element tablicy to: " + employees[employeesSize - 1]);
    }

}

