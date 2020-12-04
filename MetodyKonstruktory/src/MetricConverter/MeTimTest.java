package MetricConverter;

import java.util.Random;

public class MeTimTest {
    public static void main(String[] args) {

        double m = new Random().nextInt(100);
        MetricConverter metric = new MetricConverter();
        double mToCm = metric.metersToCm(m);
        double mToMm = metric.metersToMm(m);
        double cmToM = metric.cmToMeters(m);
        double mmToM = metric.mmToMeters(m);
        System.out.println(m + "m to " + mToCm + "cm i " + mToMm + "mm");
        System.out.println("W 1m: " +mmToM + "mm to " + cmToM + "cm");

        int t = new Random().nextInt(48);
        TimeConverter time = new TimeConverter();
        int minutes = time.hoursToMinutes(t);
        int seconds = time.minutesToSeconds(minutes);
        int millis = time.secondsToMiliseconds(seconds);
        System.out.println("\n"+t + " godz. =" + minutes+"min. ="+seconds+"sek. ="+millis + "milisek");
    }
}


