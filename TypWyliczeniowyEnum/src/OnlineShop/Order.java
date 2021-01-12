package OnlineShop;

public class Order {
    private String nameOrder;
    private double priceOrder;
    private OrderStatus status;

    public Order(String nameOrder, double priceOrder, OrderStatus status) {
        this.nameOrder = nameOrder;
        this.priceOrder = priceOrder;
        this.status = status;
    }

    public String getNameOrder() {
        return nameOrder;
    }

    public void setNameOrder(String nameOrder) {
        this.nameOrder = nameOrder;
    }

    public double getPriceOrder() {
        return priceOrder;
    }

    public void setPriceOrder(double priceOrder) {
        this.priceOrder = priceOrder;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return nameOrder + " (" + priceOrder + "zł) - " + status;
    }
}
