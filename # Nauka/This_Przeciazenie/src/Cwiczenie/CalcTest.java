package Cwiczenie;

import java.util.Random;

public class CalcTest {
    public static void main(String[] args) {

//        losowe wybieranie liczb
        int liczba01 = new Random().nextInt(50);
        int liczba02 = new Random().nextInt(30);
        int liczba03 = new Random().nextInt(15);
        System.out.println("Liczby: "+ "a= "+liczba01+", b= "+liczba02+", c="+liczba03+"\n");

        Calculator calculator = new Calculator();
        System.out.println("a+b= "+calculator.add(liczba01,liczba02));
        System.out.println("a+b+c= "+calculator.add(liczba01,liczba02,liczba03));
        System.out.println("\n");
        System.out.println("a-b= "+calculator.subtract(liczba01,liczba02));
        System.out.println("a-b-c= "+calculator.subtract(liczba01,liczba02,liczba03));
    }
}
