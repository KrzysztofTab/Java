package Garden;

public class WateringPlants {
    public static void main(String[] args) {
        Plants plant01 = new Plants();
        plant01.name = "Bratki";
        plant01.descryption = "koloroew kwiaty";
        plant01.water = 0.45;

        Plants plant02 = new Plants();
        plant02.name = "Storczyki";
        plant02.descryption = "Żółte kwiaty";
        plant02.water = 0.30;

        Plants plant03 = new Plants();
        plant03.name = "Róże";
        plant03.descryption = "Koloroew kwiaty,kłujące kolce";
        plant03.water = 0.15;

        int week = 7;
        int year = 365;                ;
        double sumOfWater = plant01.water + plant02.water + plant03.water;
        double weeklyWaterConsumption = sumOfWater * week;
        double yearWaterConsumpyion = sumOfWater * year;
        System.out.println("\n");
        System.out.println(plant01.name + "; " + plant01.descryption + "; " + plant01.water + "l. wody na dzień");
        System.out.println(plant02.name + "; " + plant02.descryption + "; " + plant02.water + "l. wody na dzień");
        System.out.println(plant03.name + "; " + plant03.descryption + "; " + plant03.water + "l. wody na dzień");
        System.out.println("\n"+"Wszystkie kwiatki potrzebują w " + weeklyWaterConsumption + "l. a w roku " + yearWaterConsumpyion + "l.");

    }
}
