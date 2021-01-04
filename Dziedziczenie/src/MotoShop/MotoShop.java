package MotoShop;

public class MotoShop {
    public static void main(String[] args) {
        Tire tire = new Tire(96978, "SuperTire", "ProContact",
                "Winter pro", 17, 225);
        tire.printInfo();

        ExhaustPart exhaustPart = new ExhaustPart(634986, "Noisy Parts", "Turbo Brum",
                "Noisy Exhaust", true);
        exhaustPart.printInfo();
    }
}
