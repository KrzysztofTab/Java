package Zadanie03;

public class Add {
    public static void main(String[] args) {
        double liczba1 = 12.5;
        double liczba2 = 23.69;
        double liczba3 = 96.5;
        System.out.println("Suma: " + (liczba1 + liczba2 + liczba3)+"\n");

        double suma = liczba1+liczba2+liczba3;
        System.out.println("Wynik dodawania: "+suma+"\n");
        System.out.printf("%.2f + %.2f + %.2f = %.2f", liczba1, liczba2, liczba3, suma);
        System.out.println("\n");

//        bez wykorzystania zmiennych
        System.out.printf("%.2f + %.2f + %.2f = %.2f", 3.0, 2.5, 6.4, (3.0 + 2.5 + 6.4));
    }
}