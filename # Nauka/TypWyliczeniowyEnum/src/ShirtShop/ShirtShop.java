package ShirtShop;

import java.util.Scanner;

public class ShirtShop {
    public static void main(String[] args) {
        Tshirt tshirt = new Tshirt();
        //        (metoda) values() - zwraca tablicę wszystkich wartości zdefiniowanych w danym enumie, np.:
        System.out.println("Dostępne rozmiary:");
        Size[] values = Size.values();
        for (Size value : values) {
            System.out.println(value.toString());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("\nWybierz rozmiar: ");
        String sizeDesc = sc.nextLine(); // np. "Mały"
        Size size = Size.fromDescription(sizeDesc);
        tshirt.setSize(size);
        System.out.println("Wybrałeś tshirt w rozmiarze: " + tshirt.getSize().getDescription());

        System.out.println(tshirt.toString());
        System.out.println("metoda: valueOf(String name)");
//          (metoda) valueOf(String name) - przyjmuje nazwę typu i zwraca wartość typu Enum ( wszystkie wrtości ).
//          Nazwa musi być zgodna z nazwą wartości z uwzględnieniem wielkości liter np.:
        String siz = "SMALL";
        Size shirtSize = Size.valueOf(siz);
        tshirt.setSize(shirtSize);
        System.out.println(tshirt.getSize());
        System.out.println("Rozmiar ShirtShop.Tshirt: " + tshirt.getSize().getDescription());

        System.out.println(tshirt.toString());
        System.out.println("metoda: name()");
//        (metoda) name() - zwraca nazwę wartości, np."MEDIUM"
        System.out.println(Size.MEDIUM.getDescription() + " " + Size.MEDIUM.name());

        System.out.println(tshirt.toString());
        System.out.println("metoda: ordinal()");
//        (metoda) ordinal() - zwraca numer wartości poczynając od 0. Np.:LARGE (która jest kolejność danej wartości)
        System.out.println(Size.LARGE.getDescription() + " " + Size.LARGE.name() + " " + Size.LARGE.ordinal());

        System.out.println(tshirt.toString());
        System.out.println("metoda: values()");

    }
}