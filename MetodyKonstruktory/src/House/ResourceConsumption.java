package House;

public class ResourceConsumption {
    public static void main(String[] args) {
        House house01 = new House(10000.00,1000.00);
        System.out.println("Woda: "+house01.getWater()+"Paliwo: "+house01.getFuel());
        Resources resources01 =new Resources(house01,4);
        resources01.takeShower();
        resources01.boilWater();
        resources01.watchTv();
        resources01.makeDinner();
        resources01.watchTv();
        resources01.takeShower();
    }
}