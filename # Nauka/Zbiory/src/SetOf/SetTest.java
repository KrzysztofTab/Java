package SetOf;

import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> names = Set.of("Marek", "Kasia", "Karol", "Basia");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
