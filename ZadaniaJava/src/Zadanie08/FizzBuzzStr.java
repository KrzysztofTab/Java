package Zadanie08;

import java.util.Random;


public class FizzBuzzStr {
    public static void main(String[] args) {

        int numbers = new Random().nextInt(100);

        if (numbers % 15 == 0) {
            System.out.println(numbers + " FizzBuzz");
        } else if (numbers % 3 == 0) {
            System.out.println(numbers + " Fizz");
        } else if (numbers % 5 == 0) {
            System.out.println(numbers + " Buzz");
        }
    }
}