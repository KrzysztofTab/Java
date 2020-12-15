package For;

public class NumPrinter {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Pierwsza pętla: " + i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Druga pętla " + i);
        }
    }
}
