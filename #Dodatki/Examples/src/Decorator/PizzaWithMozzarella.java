package Decorator;

import java.math.BigDecimal;

public class PizzaWithMozzarella extends Pizza {
    private static final BigDecimal MOZZARELLA_PRICE = new BigDecimal(5);
    private final Pizza basePizza;

    public PizzaWithMozzarella(Pizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public BigDecimal getPrice() {
        return basePizza.getPrice().add(MOZZARELLA_PRICE);
    }
}
