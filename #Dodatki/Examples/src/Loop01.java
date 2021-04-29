public class Loop01 {
    public static void main(String[] args) {
        printPerLine(12345);

    }

    private static void printPerLine(int number){
        while ( number > 0) {
            int remider = number % 10;
            number /= 10;
            System.out.println(remider);
        }
    }
}

