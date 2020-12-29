package Training01;
import java.util.Scanner;

public class MyPointApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj współrzedne punktu!");
        System.out.print("x:");
        int x = scanner.nextInt();
        System.out.print("y:");
        int y = scanner.nextInt();
        System.out.println("Punkt: (" + x + "," + y + ")" + "\n");
        final int przesuniecieLewo = 1;
        final int przesunieciePrawo = 2;
        final int przesuniecieGora = 3;
        final int przesuniecieDol = 4;

        System.out.println("Przesuniecie punktu" + "\n" + "1 -w lewo" + "\n" + "2 -w prawo" + "\n" +
                "3 -w górę" + "\n" + "4 -w dół" + "\n" + "Wybierz:");
        int liczba = scanner.nextInt();

        switch (liczba) {
            case przesuniecieLewo:
                System.out.println("Nowy punkt: (" + (x - 1) + "," + y + ")");
                break;
            case przesunieciePrawo:
                System.out.println("Nowy punkt: (" + (x + 1) + "," + y + ")");
                break;
            case przesuniecieGora:
                System.out.println("Nowy punkt: (" + x + "," + (y + 1) + ")");
                break;
            case przesuniecieDol:
                System.out.println("Nowy punkt: (" + x + "," + (y - 1) + ")");
                break;
            default:
                System.out.println("Nietypowy wybór!");
        }

    }

}

