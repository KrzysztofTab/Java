package Phone;

public class Charger {

    public void charger(Telephone telephone) {
        telephone.setChargeLevel(telephone.getChargeLevel() + 1);
    }
}
