package Hospital;

public class Nurse extends Person {
    private final int overtime;

    public Nurse(String firstName, String lastName, double pay, int overtime) {
        super(firstName, lastName, pay);
        this.overtime = overtime;
    }

    @Override
    String getInfo() {
        return super.getInfo() + ", Nadgodziny: " + overtime + "h";
    }
}
