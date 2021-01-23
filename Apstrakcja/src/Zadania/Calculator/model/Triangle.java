package Zadania.Calculator.model;

import Interfejs.Shape;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double b, double a, double c) {
        this.b = b;
        this.a = a;
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double p = (a + b + c) / 2;
        double P = (p * (p - a) * (p - b) * (p - c));
        return Math.sqrt(P);
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c;
    }
}
