package Game;

public class Attackers extends Characters {
    private double attackBonus;

    public Attackers(String name, int attackPower, int defensePower, int energy, double attackBonus) {
        super(name, attackPower, defensePower, energy);
        this.attackBonus = attackBonus;
    }

    @Override
    double totalAttackPower() {
        return getAttackPower() + attackBonus * getAttackPower();
    }

    public double getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(double attackBonus) {
        this.attackBonus = attackBonus;
    }
}
