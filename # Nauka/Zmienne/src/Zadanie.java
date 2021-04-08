import java.util.Random;

public class Zadanie {

    public static void main(String[] args) {

        Random rand = new Random();
        int X = rand.nextInt(100); // losowa liczba z przedziału [0, 99],
        int Y = new Random().nextInt(100); 
        System.out.println("x= "+ X +" ,y= "+ Y);
        System.out.println("\n");

        System.out.println("x > y :  "+ (X > Y));
        System.out.println("(x*2) > y :  " + ((X*2 ) > Y));
        System.out.println("(y < x+3) && (y > x-2) :  " + ((Y < ( X+3 )) && (Y > ( X-2 ))));
        System.out.println("Czy iloczyn liczb x i y jest parzysty:  "+ ((X * Y) % 2 == 0));
    }
}
