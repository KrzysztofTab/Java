package Game;

public class BattleSimulator {
    static void fight(Team team01, Team team02) {
//        atakuje drużyna 1
        double team02Energy = attack(team01, team02);
//        atakuje druznyna 2
        double team01Energy = attack(team02, team01);
//        obliczamy energię drużyny01 odejmujac energię drużyny02
        double energyDiff = team01Energy - team02Energy;
//        jeśli energia jest > 0
        if (energyDiff > 0) {
//            wygrywa drużyna Team01
            System.out.println("Wygrywa drużyna " + team01.getNameTeame() + " z przewagą " + energyDiff + " energii");
//            jeśli energia jest < 0
        } else if (energyDiff < 0) {
//            wygrywa drużyna Team02
            System.out.println("Wygrywa drużyna " + team02.getNameTeame() + " z przewagą " + (-energyDiff) + " energii");
        } else {
//            energi =0 jest remis
            System.out.println("Remis, obie drużyny zachowały " + team01Energy + " energii");
        }
    }

    private static double attack(Team attacker, Team defender) {
//        zliczone punkty ataku całej drużyny atakującej
        double attack = attacker.attack();
//        zliczone punkty obrony całej drużny broniacej się
        double defense = defender.defenders();
//       pełan moc ataku - odejmujemy punkty obrony D.broniacej się od drużyny atakujacej
        double attackPower = attack - defense;
//        zliczone punkty energi załej drużyny broniącej się
        double energy = defender.energy();

//        jesli pełna moc ataku > 0
        if (attackPower > 0) {
//            odejmnij od punktów energi pełną moc ataku
            return energy - attackPower;
        } else {
//             jesli pełana moc ataku  =< 0 zwróć energię
            return energy;
        }
    }
}
