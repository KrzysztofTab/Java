import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class CheckName {
    public static void main(String ... args) {
        System.out.println("Podaj zdnie");
        Scanner sc = new Scanner (System.in);
        String sentence = sc.nextLine();

        if(StringUntil.containsIgnoreCase(sentence, "Krzysztof")){
            System.out.println("To zdanie zawiera moje imię!");
        } else {
            System.out.println("To zdanie nie zawiera mojego imienia!");

        }
    }
}
