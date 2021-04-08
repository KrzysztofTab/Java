package Monsters;

public class MonstersTest {
    public static void main(String[] args) {
        Monsters[] monster = new Monsters[3];
        monster[0] = new Vampire();
        monster[1] = new Dragon();
        monster[2] = new Monsters();
        for (int i = 0; i < 3; i++){
            monster[i].scare(i);
        }
    }
}
