package Ingredients;

public class KitchenCalculator {
    public static void main(String[] args) {
        double waterGlasses = 2;
        double oilSpoons = 2.5;
        double honeyTeaspoons = 4;

        double waterMI = Ingredients.glasswsToMI(waterGlasses);
        double oilMI = Ingredients.spoonsToMI(oilSpoons);
        double honeyMI = Ingredients.teaspoonsToMI(honeyTeaspoons);

        System.out.println("Potrzebujesz: ");
        System.out.println(waterGlasses+" szklani wody, to jest "+waterMI+"ml wody");
        System.out.println(oilSpoons+ " łyżki oleju, to jest " +oilMI+"ml oleju");
        System.out.println(honeyTeaspoons+" łyżeczki miodu, to jest "+honeyMI+"ml miodu");
    }
}
