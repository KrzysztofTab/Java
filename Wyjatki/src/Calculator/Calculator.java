package Calculator;

public class Calculator {
    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MULTIPLY = "*";
    private static final String DIVIDE = "/";

    static double calculate(double a, double b, String operator) {
        double result;

        switch (operator) {
            case PLUS -> result = a + b;
            case MINUS -> result = a - b;
            case MULTIPLY -> result = a * b;
            case DIVIDE -> {
                if (b == 0)
                    throw new ArithmeticException("Nie można dzielić przez 0");
                result = a / b;
            }
            default -> throw new UnknownOperatorException("Podany operator nie istnieje!");
        }
        return result;
    }
}