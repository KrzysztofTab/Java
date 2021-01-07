package Game;

public class Defenders extends Characters{
    private double defenseBonus;

    public Defenders(String name, int attackPower, int defensePower, int energy, double defenseBonus) {
        super(name, attackPower, defensePower, energy);
        this.defenseBonus = defenseBonus;
    }

    @Override
    double totalDefensePower() {
        return getDefensePower()+defenseBonus*getDefensePower();
    }

    public double getDefenseBonus() {
        return defenseBonus;
    }

    public void setDefenseBonus(double defenseBonus) {
        this.defenseBonus = defenseBonus;
    }
}
