package Sort03;

public class Premises implements Comparable<Premises> {
    private String city;
    private double price;
    private double area;

    public Premises(String city, double price, double area) {
        this.city = city;
        this.price = price;
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    double getPricePerSqm() {
        return price / area;
    }

    @Override
    public int compareTo(Premises o) {
        return Double.compare(getPricePerSqm(), o.getPricePerSqm());
    }

    @Override
    public String toString() {
        return city + ", pow.= " + area + "mKw, cena= " + price + "zł, "
                + String.format("%.2f", getPricePerSqm()) + "zł/mkw";
    }
}
