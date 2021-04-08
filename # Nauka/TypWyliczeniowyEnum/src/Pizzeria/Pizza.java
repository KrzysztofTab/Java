package Pizzeria;

public enum Pizza {
    MARGHERITA(true, true, false, false),
    CAPRICIOSA(true, true, true, false),
    PROSCIUTTO(true, true, false, true);

    private final boolean tomatoSause;
    private final boolean cheese;
    private final boolean mushrooms;
    private final boolean ham;

    Pizza(boolean tomatoSause, boolean cheese, boolean mushrooms, boolean ham) {
        this.tomatoSause = tomatoSause;
        this.cheese = cheese;
        this.mushrooms = mushrooms;
        this.ham = ham;
    }

    @Override
    public String toString() {
        String result = "Pizza " + name() + " (";
        if (tomatoSause) {
            result += "sos pomidorowy";
        }
        if (cheese) {
            result += ", ser";
        }
        if (mushrooms) {
            result += ", pieczarki";
        }
        if (ham) {
            result += ", szynka";
        }
        result += ").";
        return result;
    }
}