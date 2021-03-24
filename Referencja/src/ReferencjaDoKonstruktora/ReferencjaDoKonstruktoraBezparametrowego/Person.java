package ReferencjaDoKonstruktora.ReferencjaDoKonstruktoraBezparametrowego;

import java.util.Random;

public class Person {
    String[] firstNames = {"Jan", "Karol", "Piotr", "Andrzej"};
    String[] lastNames = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski"};
    int[] ages = {22, 33, 44, 55};
    Random random = new Random();

    private String firstName;
    private String lastName;
    private int age;

    Person(){
        firstName = firstNames[random.nextInt(firstNames.length)];
        lastName = lastNames[random.nextInt(lastNames.length)];
        age = ages[random.nextInt(ages.length)];
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age;
    }
}
