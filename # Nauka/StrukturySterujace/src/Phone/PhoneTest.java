package Phone;

public class PhoneTest {
    public static void main(String[] args) {
        Telephone telephone1 = new Telephone("Samsung", "Galaxy S10", 3400, 75);
        telephone1.printInfo();
        Charger charger = new Charger();
        charger.charger(telephone1);
        charger.charger(telephone1);
        charger.charger(telephone1);
        charger.charger(telephone1);
        charger.charger(telephone1);
        telephone1.printInfo();


    }
}