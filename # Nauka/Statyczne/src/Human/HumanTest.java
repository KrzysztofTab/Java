package Human;

public class HumanTest {
    public static void main(String[] args) {

        Human adam = new Human("Adam", 185.5);
        Human ewa = new Human("Ewa", 167.55);

        double avgHeight = (adam.getHeight() + ewa.getHeight()) / 2;
        Human.avgHeight = avgHeight;

        System.out.println("Pierwsi ludzie na Ziemi: ");
        System.out.println(adam.getName() + " " + adam.getHeight() + "cm");
        System.out.println(ewa.getName() + " " + ewa.getHeight() + "cm");

        System.out.println("Średni wzrost: " + Human.avgHeight);
    }
}