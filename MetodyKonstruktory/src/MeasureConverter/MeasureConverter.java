package MeasureConverter;

import java.util.Random;

public class MeasureConverter {

    public static void main(String[] args) {

        int a = new Random().nextInt(48);
        System.out.println(a + " godz.");

        Time time = new Time();
        time.minuty(a);
        time.sekundy(a);
        time.milisekund(a);

        int b = new Random().nextInt(1000);
        System.out.println("\n"+b + " m.");

        Length length = new Length();
        length.centymetry(b);
        length.milimetry(b);
    }
}
