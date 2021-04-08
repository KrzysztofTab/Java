package Hospital;

public class Person {
    private final String firstName;
    private final String lastName;
    private final double pay;

    public Person(String ferstName, String lastName, double pay) {
        this.firstName = ferstName;
        this.lastName = lastName;
        this.pay = pay;
    }

    public String getFerstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getPay() {
        return pay;
    }

    String getInfo() {
        return "Imię: " + getFerstName() + ", Nazwisko: " + getLastName() + ", Wypłata: " + getPay() + "zł";
    }
}
