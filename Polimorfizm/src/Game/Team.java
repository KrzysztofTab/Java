package Game;

public class Team {
    private static final int PLAYERS_TEAM = 3;
    private String nameTeame;
    private Characters[] players = new Characters[PLAYERS_TEAM];

    public Team(String nameTeame, Characters players1, Characters players2, Characters players3) {
        this.nameTeame = nameTeame;
        this.players[0] = players1;
        this.players[1] = players2;
        this.players[2] = players3;
    }

    public String getNameTeame() {
        return nameTeame;
    }

    public void setNameTeame(String nameTeame) {
        this.nameTeame = nameTeame;
    }

    double attack() {
//        całkowity atak całej drużyny początkowy
        double attack = 0;
//        zliczanie punków atak całej drużyny
        for (Characters characters : players) {
            attack += characters.totalAttackPower();
        }
        return attack;
    }

    double defenders() {
//        całkowita obrona całej drużyny poczatkowy
        double defenders = 0;
//        zliczanie punków obrony całej drużyny
        for (Characters characters : players) {
            defenders += characters.totalDefensePower();
        }
        return defenders;
    }

    double energy() {
//        całkowity poziom życia całej drużyny poczatkowy
        double energy = 0;
//        zliczanie punktów życia całej drużyny
        for (Characters characters : players) {
            energy += characters.getEnergy();
        }
        return energy;
    }
}
