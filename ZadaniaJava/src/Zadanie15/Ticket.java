package Zadanie15;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {
    //  Do czasu zakupu wykorzystujemy klasę LocalDateTime,
    //  która pozwala przechowywać informację o punkcie w
    //  czasie wyrażonym jako datę+czas (data, godzina, minuta i sekunda)
    private final LocalDateTime timeOfDeletion;
    private final int validityTime;

    // służy do utworzenia biletu, który będzie ważny od czasu zakupu (utworzenia obiektu) przez określony czas
    public Ticket(int validityTime) {
        // Statyczna metoda LocalDateTime.now() zwraca obiekt LocalDateTime reprezentujący aktualny czas
        this(LocalDateTime.now(), validityTime);
    }

    //  Drugi konstruktor przyjmuje dodatkowo argument, który pozwala ustawić czas zakupu
    public Ticket(LocalDateTime timeOfDeletion, int validityTime) {
        this.timeOfDeletion = timeOfDeletion;
        this.validityTime = validityTime;
    }

    public LocalDateTime getTimeOfDeletion() {
        return timeOfDeletion;
    }

    public int getValidityTime() {
        return validityTime;
    }

    // metoda  zwraca true lub false w zależności od tego, czy bilet jest nadal ważny czy już nie.
    // Do sprawdzenia tego warunku wykorzystujemy klasę Duration, która wyraża fragment czasu.
    // Metoda Duration.between() tworzy obiekt typu Duration wyrażający fragment czasu pomiędzy dwoma punktami w czasie.
    // W naszym przypadku odcinek między czasem zakupu biletu, a aktualnym czasem.
    // Jeśli różnica ta jest mniejsza od tego jak długo ważny jest bilet (validityTime), oznacza to, że bilet nadal jest ważny.
    public boolean isValid() {
        LocalDateTime currentTime = LocalDateTime.now();
        Duration duration = Duration.between(timeOfDeletion, currentTime);
        return duration.toMinutes() < validityTime;
    }
}
