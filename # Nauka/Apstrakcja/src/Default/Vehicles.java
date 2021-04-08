package Default;

public interface Vehicles {
    default public int speedUps(int speed) {
        return speed++;
    }

    int speedUps();
}
