package InterfejsSerializable.P03;

import java.io.*;

public class Bohater implements Serializable {
    int moc;
    String typ;
    String[] bronie;

    public Bohater(int moc, String typ, String[] bronie) {
        this.moc = moc;
        this.typ = typ;
        this.bronie = bronie;
    }

    public int getMoc() {
        return moc;
    }

    public String getTyp() {
        return typ;
    }

    public String getBronie() {
        String listaBroni = "";
        for (int i = 0; i < bronie.length; i++) {
            listaBroni += bronie[i] + "";
        }
        return listaBroni;
    }
}
