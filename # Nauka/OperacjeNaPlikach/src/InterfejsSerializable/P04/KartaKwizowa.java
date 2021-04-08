package InterfejsSerializable.P04;

import java.io.Serializable;

public class KartaKwizowa implements Serializable {
    private String pytanie;
    private String odpowiedz;

    public KartaKwizowa(String pytanie, String odpowiedz) {
        this.pytanie = pytanie;
        this.odpowiedz = odpowiedz;
    }

    public String getPytanie() {
        return pytanie;
    }

    public String getOdpowiedz() {
        return odpowiedz;
    }
}
