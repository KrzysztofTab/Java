package Numbers;

public class Numbers {
    public static final int EXIT = 0;

    public static void printNumbers(int star, int end) {
        for (int i = star; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}