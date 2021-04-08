import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NEW {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ala","ma","kota");
//        String resultString1 = names.stream().collect(Collectors.joining(","));
        String resultString1 = String.join(",", names);
        System.out.println("Wynik 1: " + resultString1);
//        String resultString2 = names.stream().collect(Collectors.joining("-"));
        String resultString2 = String.join("-", names);
        System.out.println("Wynik 2: " + resultString2);
//        String resultString3 = names.stream().collect(Collectors.joining());
        String resultString3 = String.join("", names);
        System.out.println("Wynik 3: " + resultString3);
    }
}

//  Collectors.joining(...)
//Kolektor łączący, służy do łączenia Stringów przy użyciu podanego separatora (jako parametr metody joining).
// Wyrażenie names.stream().collect(Collectors.joining(",")); zwraca Stringa,
// który zawiera wszystkie połączone wszystkie imiona przy użyciu separatora , (przecinek).
//Jeśli wywołamy metodę joining() bez żadnego parametru, Stringi zostaną połączone bez żadnego separatora.