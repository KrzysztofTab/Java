public class Rectangle {
    private final double length;
    private final double height;

    public Rectangle(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getArea(){
        return getHeight()*getLength();
    }
    public double getCircumference(){
        return 2*getHeight()+2*getLength();
    }

    public double getDiagonal(){
        return  Math.sqrt((getHeight()*getHeight())+(getLength()*getLength()));

    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,4);
        System.out.println("\nProstokąta o wymiarach:");
        System.out.println("Dłudość = " + rectangle.getLength() + " cm.");
        System.out.println("Wysokość = " + rectangle.getHeight() + " cm.");
        System.out.println("Pole prostokąta = " + rectangle.getArea() + " cm2.");
        System.out.println("Obwód prostokąta = " + rectangle.getCircumference() + " cm.");
        System.out.printf("Przekątna prostokata = %.2f" , rectangle.getDiagonal());
        System.out.print(" cm.\n");

    }
}
