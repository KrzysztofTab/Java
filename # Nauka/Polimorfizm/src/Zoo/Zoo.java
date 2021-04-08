package Zoo;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Animal animal = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kot = 1 ; Pies = 2");
        int options = sc.nextInt();
        if (options == 1) {
            animal = new Cat("Mruczek");
        } else if (options == 2) animal = new Dog("Burek");
        if (animal instanceof Dog)
            ((Dog)animal).bark();
        else
            ((Cat)animal).meow();
    }
}
