package GroceryShop;

public class Apple extends Fruit {
    private static final String TYPE = "jabłowate";
    private String variety;

    public Apple(double weight, String variety) {
        super(weight, TYPE);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    String getinfo() {
        return super.getinfo() + ", odmiana: " + variety;
    }
}
