/*Napisz program, w którym użytkownik podaje liczbę całkowitą, a następnie w konsoli rysowany jest romb,
 którego boki składają się z tylu gwiazdek co liczba zadana w programie.
 */
package Zadanie11;

import java.util.Scanner;

public class ShapeDrawer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int size = sc.nextInt();
        draw(size);
    }

    private static void draw(int size) {
        for (int i = 0; i < size; i++) {
            drawSpaces(size-i-1);
            drawStars(size);
            System.out.println();
        }
    }

    private static void drawSpaces(int spaces) {
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
    }
    private static void  drawStars(int stars){
        for (int i=0; i<stars; i++){
            System.out.print("*");
        }
    }

}