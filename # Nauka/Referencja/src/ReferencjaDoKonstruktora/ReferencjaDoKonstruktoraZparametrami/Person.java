package ReferencjaDoKonstruktora.ReferencjaDoKonstruktoraZparametrami;

import java.util.Random;

public class Person {
    private static Random random = new Random();

    private String firstName;
    private String lastName;
    private int age;

    //   losowanie z tablic znajduje się w konstruktorze
    //   String[] fn, String[] ln, int[] a) -> Person.
    Person(String[] firstNames, String[] lastNames, int[] ages) {
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
