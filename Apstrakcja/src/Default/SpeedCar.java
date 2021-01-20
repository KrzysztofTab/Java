package Default;

public class SpeedCar extends Vehicle implements Vehicles {
    @Override
    public String toString() {
        return "Samochód jedzie z prętkością: ";
    }

    @Override
    public void speedUp() {
        setSpeed(getSpeed() + 20);

    }

    @Override
    public int speedUps(int speed) {
        return 0;
    }

    @Override
    public int speedUps() {
        return 0;
    }
}
