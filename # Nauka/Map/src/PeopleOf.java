import java.util.Map;

public class PeopleOf {
    public static void main(String[] args) {
        Map<String,Integer> people = Map.of("Jan", 12345, "Karol", 23456, "Zofia", 34567);
        System.out.println(people);
    }
}
