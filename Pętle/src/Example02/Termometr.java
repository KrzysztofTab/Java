package Example02;

import java.util.Scanner;

public class Termometr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj temperaturę aktualną: ");
        int curentTempe = sc.nextInt();
        System.out.println("Podaj temperaturę oczekiwaną: ");
        int expectedTemp = sc.nextInt();

    }

    private static void extracted(int curentTempe, int expectedTemp) {
        int difference = expectedTemp - curentTempe;
        if (difference > 0) {
            for (double i = 0; i < difference; i += 0.5) {
                System.out.println("Aktualna temperatura: " + (curentTempe + i));
            }
        }else if ( difference <0 ){
            for (double i = 0; i> difference; i-=0.5){
                System.out.println("Aktualna temperatura: " + (curentTempe +i));
            }
        }
        System.out.println("Osiągnieto temperaturę docelową "+ expectedTemp +" stopni");
    }
}
