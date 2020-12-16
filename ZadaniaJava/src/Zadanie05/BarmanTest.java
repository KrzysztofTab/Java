package Zadanie05;

public class BarmanTest {
    public static void main(String[] args) {
        Drink drink = Barman.createDrink("Sok ananasowy", 100, "Likier malibu", 50,
                "Mleko kokosowe", 100);
        Barman.printDrink(drink);
    }
}