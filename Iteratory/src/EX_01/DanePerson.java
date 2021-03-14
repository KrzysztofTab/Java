package EX_01;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class DanePerson {
    public static void main(String[] args) {
//        sorowanie w mapach "TreeMap" od A do Z
        Map<String, Person> personMap = new TreeMap<>();

//        Person p1 = new Person("Jan", "Kowalski", 35);
//        personMap.put(p1.getLastName(), p1);
        personMap.put("Kowalski", new Person("Jan", "Kowalski", 35));
        personMap.put("Adamiak", new Person("Ania", "Adamiak", 21));
        personMap.put("Zaręba", new Person("Adam", "Zaręba", 17));
        personMap.put("Piotrowski", new Person("Karol", "Piotrowski", 42));
        personMap.put("Bobrowska", new Person("Michalina", "Bobrowska", 15));

        Collection<Person> values = personMap.values();
        Iterator<Person> iterator = values.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}