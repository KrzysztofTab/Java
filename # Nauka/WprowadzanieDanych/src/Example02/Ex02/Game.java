package Example02.Ex02;

public class Game {
    public static void main(String[] args) {
        HeadsOrTails headsOrTails = new HeadsOrTails();
        headsOrTails.betResult(); //obstawiamy wynik
        headsOrTails.flipCoin(); //rzucamy 1 raz
        headsOrTails.showResult();

        headsOrTails.flipCoin(); //rzucamy 2 raz
        headsOrTails.showResult();
    }
}
