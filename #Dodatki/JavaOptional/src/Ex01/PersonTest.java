package Ex01;

public class PersonTest {
    public static void main(String[] args) {
        PersonDatabase db = new PersonDatabase();
        db.add(new Person(1, "Jan", "Kowalski"));
        db.add(new Person(2, "Karol", "Zawadzki"));
        db.add(new Person(3, "Bartosz", "Abacki"));
        db.add(new Person(4, "Ania", "Walczak"));

        Person person1 = db.findById(2); // Karol Zawadzki
        Person personNull = db.findById(55); // null

        System.out.println(person1.getLastName());
        System.out.println(personNull.getLastName()); //NullPointerException
    }
}
