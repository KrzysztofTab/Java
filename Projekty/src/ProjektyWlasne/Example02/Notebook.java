package ProjektyWlasne.Example02;

import java.util.Objects;

public class Notebook {
    private final int numbers;
    private final String name;
    private final double price;

    public Notebook(int numbers, String name, double price) {
        this.numbers = numbers;
        this.name = name;
        this.price = price;
    }

    public int getNumbers() {
        return numbers;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Notebook)) return false;
        Notebook notebook = (Notebook) o;
        return getNumbers() == notebook.getNumbers() && Double.compare(notebook.getPrice(),
                getPrice()) == 0 && Objects.equals(getName(), notebook.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumbers(), getName(), getPrice());
    }

    @Override
    public String toString() {
        return name + ", " + price + "zł";
    }
}