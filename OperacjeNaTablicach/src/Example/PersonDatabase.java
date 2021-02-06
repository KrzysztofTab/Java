package Example;

import java.util.Arrays;

public class PersonDatabase {
    private final int INITIAL_CAPACITY = 1;
    private Person[] people = new Person[INITIAL_CAPACITY];
    private int emptyPlace = 0;

    public void add(Person person) {
        if (person == null)  // jeśli wynosi null żucamy wyjatek
            throw new NullPointerException("Dane nie mogą być puste!");
        if (emptyPlace == people.length) { //jeśli puste miejsce jest równy długosci tablicy
            people = Arrays.copyOf(people, people.length * 2); //kopiuj tablicę i dodaj dwa miejsca
        }
        people[emptyPlace] = person;
        emptyPlace++;
    }

    public void remove(Person person) {
        if (person == null)  // jeśli wynosi null żucamy wyjatek
            throw new NullPointerException("Dane nie mogą być puste!");
        final int notFound = -1;
        int foundIndex = notFound;
        for (int i = 0; i < emptyPlace && foundIndex == notFound; i++) {
            if (person.equals(people[i])) {
                foundIndex = i;
            }
        }
        if (foundIndex != notFound) {
            System.arraycopy(people, foundIndex + 1, people, foundIndex, people.length - foundIndex - 1);
            emptyPlace--;
            people[emptyPlace] = null;
        }
    }

    public Person get(int index) throws ArrayIndexOutOfBoundsException {
        if (index >= emptyPlace || index < 0)
            throw new ArrayIndexOutOfBoundsException("Indeks musi być dodatni i niższy niż" + emptyPlace);
        return people[index];
    }

    public int size() {
        return emptyPlace;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersonDatabase size: ");
        sb.append(emptyPlace);
        sb.append("\n");
        for (int i = 0; i < emptyPlace; i++) {
            sb.append(" > ");
            sb.append(people[i].toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}