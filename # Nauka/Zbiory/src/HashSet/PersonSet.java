package HashSet;

import java.util.HashSet;

public class PersonSet {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        people.add(new Person("Jan", "Kowalski"));
        people.add(new Person("Jan", "Kowalski"));
        people.add(new Person("Ania", "Kawalec"));
        people.add(new Person("Ania", "Kawalec"));
        people.add(new Person("Szymon", "Zalewski"));

        System.out.println("size() " + people.size());
        System.out.println("contains Jan Kowalski? " + people.contains(new Person("Jan", "Kowalski")));
        people.remove(new Person("Ania", "Kawalec"));
        System.out.println("size() " + people.size());
    }
}
