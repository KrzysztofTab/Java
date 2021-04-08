package Circle;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        double r = 10;

//        metody mamay oznaczone jako statyczne wiec możemy sieodwoływać nazwą_klasy.nazwą_metody
//        np: "Circle.circleAra(r))"
        System.out.println("Pole koła: " + Circle.circleAra(r));
        System.out.println("Obwód koła: " + Circle.circlePerimeyer(r));
    }
}