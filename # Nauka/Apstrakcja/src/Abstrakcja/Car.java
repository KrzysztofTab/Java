package Abstrakcja;

public class Car extends Vehicle{

    @Override
    public void speedUp() {
        setSpeed(getSpeed()+50);
    }

    @Override
    public String toString() {
        return "Samochód jedzie z prętkością: ";
    }
}
