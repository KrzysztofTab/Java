package Hospital;

public class Hospital {
    private static final int MAX_EMPLOYEES = 5;
    private final Person[] employees = new Person[MAX_EMPLOYEES];
    private int employeesNumber = 0;

    void add(Person person) {
        if (employeesNumber < MAX_EMPLOYEES) {
            employees[employeesNumber] = person;
            employeesNumber++;
        } else
            System.out.println("Niemożemy dodawać więcej pracowników !");
    }

    String getInfo() {
        String result = "";
        for (int i = 0; i < employeesNumber; i++) {
            result = result + employees[i].getInfo() + "\n";
        }
        return result;
    }
}