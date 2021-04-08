package if_else;

public class NumberComparison {

    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        int c = 50;

        if (a>b){
            System.out.println("\n"+"Większa jest liczba A: " + a);
        } else {
            System.out.println("\n"+"Większa jest liczba B: " + b);
        }

        System.out.println("\n");
        if (a > b) {
            if (a > c)
                System.out.println("A jest większe od B oraz od C!");
            else
                System.out.println("A jest większe od B, ale mniejsze od C");
        } else {
            System.out.println("A jest mniejsze od B");
        }
    }
}