package Zadanie16.Exam;


import java.util.Arrays;

public class Exa {
    public static void main(String[] args) {
        // tworzymy tablice znaków przechowującą kolejne nukleotydy w sekwencji
        // początkowo przechowuje 6 znaków (nukleotydów)
        char[] seq = {'A', 'C', 'T', 'A', 'A', 'G'};

        // drukowanie zawartości tablicy
        System.out.println("seq: " + Arrays.toString(seq));

        // tworzymy tablicę tymczasową, o długości o 3 dłuższą niż tablica seq
        char[] tmp = new char[seq.length + 3];
        System.out.println("tpm: " + Arrays.toString(tmp));

        // kopiujemy zawartość tablicy seq to tmp
        System.arraycopy(seq, 0, tmp, 0, seq.length);

        System.out.println("tmp: " + Arrays.toString(tmp));

        // teraz tablica seq będzie wskazywała na elementy
        // przechowywane w tmp a tmp ma długość 9
        seq = tmp;
        System.out.println("seq: " + Arrays.toString(seq));

        // wypełniamy puste miejsca
        seq[6] = 'C';
        seq[7] = 'A';
        seq[8] = 'T';
        System.out.println("seq: " + Arrays.toString(seq));

    }
}
                                    