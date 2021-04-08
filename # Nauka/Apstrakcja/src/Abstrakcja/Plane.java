package Abstrakcja;

public class Plane extends Vehicle {
    @Override
    public void speedUp() {
        setSpeed(getSpeed()+500);
    }
    @Override
    public String toString() {
        return "Samolot leci z prętkością: ";
    }
}
