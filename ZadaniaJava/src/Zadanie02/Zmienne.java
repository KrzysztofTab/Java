package Zadanie02;

public class Zmienne {
    short a = 5;
    final int b = 129;
    final char c = 'c';
    String x ="Ala ";
    String y = "ma ";
    String z = "kota ";
    String laczenie = z + y + x;

    void zmiennePrint(){
        System.out.println(a+"\n"+b+"\n"+c+"\n");
    }
    void  laczeniePrint(){
        System.out.println(laczenie);
    }
    void wylaczeniePrint(){
//        substring - wyswietlanie fragmentu tekstu (start, koniec)
        System.out.println(laczenie.substring(0, 7));
    }
}
