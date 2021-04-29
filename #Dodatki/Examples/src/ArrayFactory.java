import java.util.Arrays;

public class ArrayFactory {

    private final int x;

    public ArrayFactory(int X) {
        this.x = X;
    }

    public int[] oneDimension() {
        return new int[x];
    }

       public int[][] buildTwoDimensions() {
        int[][] array = new int[x][];
        for (int i = 0; i < x; i++) {
            array[i] = new int[x];
        }
        return array;
    }

    public int[][] buildTwoDimensionsInOneLine() {
        return new int[x][x];
    }

    public int[][] identityMatrix() {
        int[][] matrix = buildTwoDimensions();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == j) {
                    matrix[i][j] = 1;
                }
                else {
                    // that line is superfluous, arrays are initialized with default value, 0 in case of int type
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        ArrayFactory arrayFactory = new ArrayFactory(5);
        System.out.println(Arrays.toString(arrayFactory.oneDimension()));
        System.out.println(Arrays.deepToString(arrayFactory.buildTwoDimensionsInOneLine()));
        System.out.println(Arrays.deepToString(arrayFactory.identityMatrix()));
    }
}
