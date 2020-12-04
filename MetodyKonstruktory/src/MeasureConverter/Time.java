package MeasureConverter;

public class Time {
    void minuty(int godziny) {
        int result = godziny * 60;
        System.out.println("        = "+result +" min.");
    }
    void sekundy(int godziny) {
        int result = godziny * 60 * 60;
        System.out.println("        = "+result +" sek.");
    }
    void milisekund(int godziny) {
        int result = godziny * 60 * 60 * 1000;
        System.out.println("        = "+result +" milisek.");
    }
}


//    1 godzina to 60 minut, 1 minuta to 60 sekund, 1 sekunda to 1000 milisekund.