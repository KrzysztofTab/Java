class LogicalOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;
        boolean logic = true;

            // && - operator koniunkcji. Zwraca true tylko i wyłącznie wtedy kiedy zachodzi true && true,
        System.out.print("x<10 && y<11? ");
        System.out.println(x < 10 && y < 11);

        System.out.print("x<10 && y<10? ");
        System.out.println(x < 10 && y < 10);

            // || - operator alternatywy. Zwraca true, gdy co najmniej jeden z warunków jest spełniony,
            // czyli true || false lub false || true lub true || true.
        System.out.print("x<10 || y<10? ");
        System.out.println(x < 10 || y < 10);
            // ! - operator negacji, zwraca przeciwieństwo wartości logicznej będącej parametrem,
            // czyli np. !true daje w wyniku false
        System.out.print(logic);
        System.out.print(" , !logic = ");
        System.out.println(!logic);

        System.out.print("Warunek złożony !(x<10 && y<10) ");
        System.out.println(!(x < 10 && y < 10));
    }
}
