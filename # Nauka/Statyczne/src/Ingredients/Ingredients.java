package Ingredients;

public class Ingredients {
    static final double GLASS = 250;
    static final double SPOON = 15;
    static final double TEASPOON = 5;

    static double glasswsToMI(double glasses){
        return glasses * GLASS;
    }

    static double spoonsToMI(double spoons){
        return spoons * SPOON;
    }
    static  double teaspoonsToMI(double teaspoons){
        return teaspoons * TEASPOON;
    }
}
