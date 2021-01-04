package GroceryShop;

public class Fruit {
    private double weight;
    private String type;

    public Fruit(double weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    //    zwraca informację (nie wyswietla)
    String getinfo() {
        return "Waga: " + getWeight() + "g, typ:" + getType();
    }
}
