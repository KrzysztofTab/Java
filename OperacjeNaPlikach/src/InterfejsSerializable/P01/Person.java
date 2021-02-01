package InterfejsSerializable.P01;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable {

    @Serial
//    wymyslona dowolna wartość
    private static final long serialVersionUID = 3812017177088226528L;
    private String firstName;
    private String LastName;

    public Person(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }
}
