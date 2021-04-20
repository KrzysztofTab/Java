package Zadanie17;

import java.util.Arrays;

public class Task02 {

    public static void main(String[] args) {
        String name1 = "PIERWSZA tablica";
        String name2 = "DRUGA tablica";
        String[] inscription01 = {"registration", "inscription", "enrollment", "registry", "initiation", "enrolment", "entries" };
        String[] inscription02 = {"inicjacja", "zapoczątkowanie", "wprowadzenie", "wtajemniczenie", "początek", "wpis" };

        printInformacionArrays(name1, inscription01);
        printInformacionArrays(name2, inscription02);
        comparisonOfArrays (name1, name2, inscription01, inscription02);
    }

    private static void printInformacionArrays(String name1, String[] inscription01) {
        informationAboutArrays(name1, inscription01);
        System.out.println("Suma liter " + name1 + " = " + sumOfLettersInTheArray(inscription01));
    }

    private static void comparisonOfArrays(String nameA,String nameB, String[] inscriptionA, String[] inscriptionB) {
        if(sumOfLettersInTheArray(inscriptionA) > sumOfLettersInTheArray(inscriptionB)){
            System.out.println("\nŁączna liczba znaków we wszystkich słowach jest większa " + nameA + ", wynosi: "
            +sumOfLettersInTheArray(inscriptionA));
        }else{
            System.out.println("\nŁączna liczba znaków we wszystkich słowach jest większa " + nameB+ ", wynosi: "
                    +sumOfLettersInTheArray(inscriptionB));
        }
    }

    private static int sumOfLettersInTheArray(String[] inscription) {
        int sum = 0;
        for (int i = 0; i < inscription.length; i++) {
            //System.out.println(inscription01[i].length());  // długości wyrazów w tabeli
            sum += inscription[i].length();
        }
        return sum;
    }

    private static void informationAboutArrays(String name, String[] inscription) {
        System.out.println("\n" + name);
        System.out.println(Arrays.toString(inscription));
        System.out.println("Długość " + name + " : " + inscription.length);
    }
}