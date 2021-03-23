package EX02;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class EmailManager {
    public static void main(String[] args) {
        List<Email> emails = new ArrayList<>();
        emails.add(new Email("joe@example.com", "barbara@example.com", "Kup bułki",
                "Cześć!, Kup proszę bułki, gdy będziesz wracać z pracy.", false));
        emails.add(new Email("carl@example.com", "joe@example.com", "Nowa inwestycja",
                "Siema! Musimy omówić temat nowej inwestycji, pasuje Ci jutro?", true));
        emails.add(new Email("joe@example.com", "bart@example.com", "Wypad na miasto",
                "Cześć. Idziemy dzisiaj wieczorem z chłopakami na miasto. Dołączasz do nas?", true));

        createEmailList(emails, System.out::println); // (emails, email -> System.out.println(email))
        //tylko wysłane emaile
        System.out.println("\nWysłane maile:");
        List<Email> sentEmails = filterEmailsSent(emails, Email::isSent); // (emails, email -> email.isSent())

//        //filtrowanie maili, w których nadawca lub odbiorca ma wskazany adres email
//        List<Email> bartEmails = filterEmailsBySenderOrRecipient(emailList, "bart@example.com");
//        System.out.println("Maile przefiltrowane na podstawie nadawcy lub odbiorcy");
//        System.out.println(bartEmails);
    }

    private static List<Email> filterEmailsBySenderOrRecipient(List<Email> emails, String emailAddress) {
        List<Email> filteredEmails = new ArrayList<>();
        for (Email email : emails) {
            if (email.getSender().equals(emailAddress) || email.getRecipient().equals(emailAddress))
                filteredEmails.add(email);
        }
        return filteredEmails;
    }

    private static <T> List<T> filterEmailsSent(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T t : list) {
            if (predicate.test(t))
                result.add(t);
        }
        return result;
    }

    private static <T> void createEmailList(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
