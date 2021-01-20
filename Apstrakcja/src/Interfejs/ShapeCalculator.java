package Interfejs;

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(5,10);

        System.out.println("Pole koła: " + circle.calculateArea());
        System.out.println("Obwód prostokąta: " + rectangle.calculatePerimeter());
    }
}
