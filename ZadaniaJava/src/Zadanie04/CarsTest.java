package Zadanie04;

import java.util.Scanner;

public class CarsTest {
    public static void main(String[] args) {

        Cars cars01 = new Cars("BMW","Cabrio");
        System.out.println("marka: "+cars01.getBrand()+", model:  "+cars01.getModel());
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n"+"Czy samochód ma otwierany dach (T/F): ");
        boolean open = scanner.nextBoolean();
        cars01.setRoofOpen(open);
        if (open){
            System.out.println("Czy smochód porusza się (T/F): ");
            boolean moving = scanner.nextBoolean();
            cars01.setMoving(moving);
        }else {
            scanner.close();
        }
    }
}
