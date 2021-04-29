package Decorator;

import java.text.DecimalFormat;
import java.util.List;

public class Decorator {
    public static void main(String[] args) {
        Pizza margherita = new Pizza();
        Pizza withMozzarella = new PizzaWithMozzarella(margherita);
       // Pizza withMozzarellaAndHam = new PizzaWithHam(withMozzarella);
        // Pizza withMozzarellaHamAndBasil = new PizzaWithBasil(withMozzarellaAndHam);

        DecimalFormat df = new DecimalFormat("#,00 zł");
        for (Pizza pizza : List.of(margherita, withMozzarella/*,withMozzarellaAndHam, withMozzarellaHamAndBasil*/)) {
            System.out.println(String.format("%s costs %s.", pizza, df.format(pizza.getPrice())));
        }
    }
}
