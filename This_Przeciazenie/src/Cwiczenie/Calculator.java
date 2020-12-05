package Cwiczenie;

public class Calculator {

    double add(double liczba01, double liczba02) {
        return liczba01 + liczba02;
    }
    double add(double liczba01, double liczba02, double liczba03){
        return add(liczba01, liczba02) + liczba03;
    }
    int subtract(int liczba01, int liczba02){
        return liczba01 - liczba02;
    }
    int subtract(int liczba01, int liczba02, int liczba03){
        return subtract(liczba01, liczba02) - liczba03;
    }

}
