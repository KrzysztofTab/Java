package Game;

public class GameSimulator {
    public static void main(String[] args) {
        Attackers character1 = new Attackers("Joe", 100, 100, 100, 0.2);
        Attackers character2 = new Attackers("Marta", 100, 100, 100, 0.9);
        Attackers character3 = new Attackers("Matti", 100, 100, 100, 0.2);
        Attackers character4 = new Attackers("Bela", 100, 100, 100, 0.2);
        Defenders character5 = new Defenders("Kris",100,100,100,0.2);
        Defenders character6 = new Defenders("Chess",100,100,100,0.8);


        Team team1 = new Team("Team_One", character2, character3, character6);
        Team team2 = new Team("Team_Two", character1, character5, character4);
        BattleSimulator.fight(team1, team2);
    }
}
