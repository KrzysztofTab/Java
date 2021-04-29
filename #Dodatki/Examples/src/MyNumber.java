public class MyNumber {
    private final double number;

    public MyNumber(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    private boolean isOdd() {
        return getNumber() % 2 != 0;
    }

    private boolean isEvent() {
        return getNumber() % 2 == 0;
    }

    private double sqrt() {
        return Math.sqrt(getNumber());
    }

    //  MyNumber pow(MyNumber x) – atrybut podniesiony do potęgi x
    public MyNumber pow(MyNumber pow) {
        return new MyNumber(Math.pow(getNumber(), pow.getNumber()));
    }
    //  MyNumber add(MyNumber x) – zwraca sumę atrybutu i x opakowaną w klasę MyNumber
    public MyNumber add(MyNumber otherValue) {
        return new MyNumber(number + otherValue.number);
    }
    //  MyNumber subtract(MyNumber x) – zwraca różnicę atrybutu i x opakowaną w klasę MyNumber.
    public MyNumber subract(MyNumber otherValue) {
        return new MyNumber(number - otherValue.number);
    }

    @Override
    public String toString() {
        return String.valueOf(number);
    }

    private static void printInfo(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(6);
        printInfo("" + myNumber.isOdd());
        printInfo("" + myNumber.isEvent());
        System.out.printf("%.2f", myNumber.sqrt());
    }
}
