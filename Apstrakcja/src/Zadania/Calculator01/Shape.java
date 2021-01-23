package Zadania.Calculator01;

public interface Shape {
    int RECTANGLE = 1;
    int CIRCLE = 2;
    int TRIANGLE = 3;

    double PI = 3.14;

    // metody są domyślnie publiczne i abstrakcyjne
    public double calculateArea();

    public double calculatePerimeter();
}
