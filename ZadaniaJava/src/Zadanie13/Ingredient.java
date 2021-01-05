package Zadanie13;

public class Ingredient {

    private final String name;
    private final double amount;

    public Ingredient(String name, double amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getAmount() {
        return amount;
    }

}