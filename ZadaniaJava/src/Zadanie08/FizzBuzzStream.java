package Zadanie08;

import java.util.stream.IntStream;

public class FizzBuzzStream {
    public static void main(String[] args) {
        //#1
        IntStream.iterate(1, i -> i+1)
                .limit(100)
                .forEach(FizzBuzzStream::fizzBuzz);
        //#2
        IntStream.rangeClosed(1, 100)
                .forEach(number -> {
                    if(number%15 == 0)
                        System.out.println(number + " FizzBuzz");
                    else if(number%3 == 0)
                        System.out.println(number + " Fizz");
                    else if(number%5 == 0)
                        System.out.println(number + " Buzz");
                });
    }

    private static void fizzBuzz(int number) {
        if(number%15 == 0)
            System.out.println(number + " FizzBuzz");
        else if(number%3 == 0)
            System.out.println(number + " Fizz");
        else if(number%5 == 0)
            System.out.println(number + " Buzz");
    }
}