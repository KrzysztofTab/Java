package Hospital;

public class Doctor extends Person {
    private final double bonus;

    public Doctor(String firstName, String lastName, double pay, double bonus) {
        super(firstName, lastName, pay);
        this.bonus = bonus;
    }

    @Override
    String getInfo() {
        return super.getInfo() + ", Premia: " + bonus + "zł";
    }
}
