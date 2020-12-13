package Zadanie05;

public class Ingredient {
//    Klasa Ingredient posiada dwa pola. Jedno typu String na nazwę składnika,
//    drugie typu double na ilość (w mililitrach).
    private String name;
    private double amount;

    public Ingredient(String nazwa, double amount) {
        this.name = nazwa;
        this.amount = amount;
    }

    public String getNazwa() {
        return name;
    }

    public void setNazwa(String nazwa) {
        this.name = nazwa;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
