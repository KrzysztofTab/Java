import java.util.Arrays;

public class ArrayS {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(alphabet()));
        System.out.println(Arrays.toString(revertArray(new int[]{1, 2, 3})));
    }

    private static String[] alphabet() {
        return new String[]{"a", "b", "c", "d", "e"};
    }

    private static int[] revertArray(int[] array) {
        return new int[]{array[2], array[1], array[0]};
    }
}

