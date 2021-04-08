package OnlineShop;

import ShirtShop.Size;

public enum OrderStatus {
    NEW("złożono zamówienie"), PAID("zamówienie opłacone"), SHIPPED("zamówienie wysłane"),
    DELIVERED("zamówienie dostarczone"), CANCELLED("zamówienie anulowano");
    private final String description;

    OrderStatus(String description) {
        this.description = description;
            }
    @Override
    public String toString() {
        return description;
    }
}