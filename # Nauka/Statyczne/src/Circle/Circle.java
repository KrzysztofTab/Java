package Circle;

public class Circle {
    //    statyczna - nzawa dużą literą
    static final double PI = 3.141592;

    //    jak metody oznaczymy jako stayczne możemy się do niej odwoływać poprzez nazwę klasy
    static double circleAra(double r) {
        return PI * r * r;
    }

    //    jak metody oznaczymy jako stayczne możemy się do niej odwoływać poprzez nazwę klasy
    static double circlePerimeyer(double r) {
        return 2 * PI * r;
    }
}