package Abstrakcja;

public class Boat extends Vehicle{
    @Override
    public void speedUp() {
        setSpeed(getSpeed()+80);
    }
    @Override
    public String toString() {
        return "Łódź płynie z prętkością: ";
    }
}
