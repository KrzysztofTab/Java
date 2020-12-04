class Conversions {
    public static void main(String[] args) {
        double number1 = 10.987;
        int number2 = 5;

        // konwersja zawężająca (eng. narrowing)
        int narrowing = (int) number1;

        // konwersja rozszerzająca (eng. widening)
        double widening = (double) number2;

        System.out.println("Narrowing: " + narrowing);
        System.out.println("Widening: " + widening);
    }
}
