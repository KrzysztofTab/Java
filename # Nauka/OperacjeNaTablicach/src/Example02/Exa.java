package Example02;
import java.util.Arrays;
public class Exa {

    public static void main(String[] args) {


        String[] array = {"A", "B", "C", "D"};
//    po usuneciu 'B' - w tablicy bedzie A, C, D, null
        System.arraycopy(array, 2, array, 1, 2);
        array[3] = null;
        System.out.println(Arrays.toString(array));
    }
}
