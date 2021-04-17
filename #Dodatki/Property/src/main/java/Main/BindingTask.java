package Main;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

import java.util.Scanner;

public class BindingTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        IntegerProperty first = new SimpleIntegerProperty();
        IntegerProperty second= new SimpleIntegerProperty();
        second.bind(first);             //Metoda bind() pozwala powiązać ze sobą wartości w dwóch różnych kontrolkach.

//              observable - obserwowana wartość obiektu,
//              oldValue - wartość valueProperty przed wywołaniem zdarzenia,
//              newValue - wartość valueProperty po zdarzeniu.
        second.addListener((observable,oldValue,newValue) -> System.out.println("Zmiana w second: " + newValue));

        System.out.println("Pierwsza Liczba: ");
        first.set(sc.nextInt());
        sc.nextLine();
        System.out.println("liczba powiazana: " + second.get());

        System.out.println("\nDruga liczba: ");
        first.set(sc.nextInt());
        sc.nextLine();
        System.out.println("liczba powiazania: " + second.get());

        sc.close();
    }
}
