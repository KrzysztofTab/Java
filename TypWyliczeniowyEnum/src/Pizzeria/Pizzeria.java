package Pizzeria;

import ShirtShop.Size;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {

//        wyświetlanie wszystkich wartosci z "Pizza"
        printPizza();
        Pizza pizza = getPizza();
        System.out.println("Dziekujemy za łożenie zamówienia " + pizza.name());
    }

    private static Pizza getPizza() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWybierz pizze: ");
        Pizza pizza = Pizza.valueOf(sc.nextLine().toUpperCase());
        sc.close();
        return pizza;
    }

    private static void printPizza() {

        System.out.println("Dostępne pizze:");
        for (Pizza pizza : Pizza.values()) {
            System.out.println(pizza);
        }
    }
}
