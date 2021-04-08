package Boat;

public class BoatTest {
    public static void main(String[] args) {
        Boat boat1 = new Boat();
        Boat boat2 = new Sailboat();
        Boat boat3 = new Canoe();
        boat2.setLenght(32);
        System.out.println("Długosć łodzi:" + boat2.getLenght()+"m.");
        boat1.liquid();
        boat3.liquid();
        boat2.liquid();
    }
}