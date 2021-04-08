package Game;

public class Characters {
    private String name;
    private int attackPower;
    private int defensePower;
    private int energy;

    public Characters(String name, int attackPower, int defensePower, int energy) {
        this.name = name;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.energy = energy;
    }

    double totalAttackPower(){
        return attackPower;
    }
    double totalDefensePower(){
        return  defensePower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public void setDefensePower(int defensePower) {
        this.defensePower = defensePower;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}
