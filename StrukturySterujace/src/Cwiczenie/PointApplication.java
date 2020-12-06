package Cwiczenie;

import java.util.Scanner;

public class PointApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj współrzędne punktu:");
        System.out.print("x:");
        int d1= scanner.nextInt();
        System.out.print("y:");
        int d2 = scanner.nextInt();
        Point p1 = new Point(d1, d2);
        PointController pc = new PointController();
        final int addX = 1;
        final int addY = 2;
        final int minusX = 3;
        final int minusY = 4;
        System.out.println("\n" + "'1' - X+1" + "\n" + "'2' - Y+1" + "\n" +
                "'3' - X-1" + "\n" + "'4' - Y-1" + "\n" + "Wybierz:");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                pc.addX(p1);
                break;
            case 2:
                pc.addY(p1);
                break;
            case 3:
                pc.minusX(p1);
                break;
            case 4:
                pc.minusY(p1);
                break;
            default:
                System.out.println("Podano błedna wartość");
        }
        System.out.println("\n"+"Punkt po zmianie: (" + p1.getX() + ";" + p1.getY() + ")");
    }
}