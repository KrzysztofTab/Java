public class MultiDimensionalDual {
    public static void main(String[] args) {
//        3 tablice typu całkowitoliczbowego
        int[] longTab = new int[1000];
        longTab[99] = 100;
        int[] midTab = new int[100];
        int[] smallTab = new int[10];

//        deklarujemy i inicjalizujemy tablicę dwuwymiarową
        int[][] hugeTab = new int[3][];
        hugeTab[0] = longTab;
        hugeTab[1] = midTab;
        hugeTab[2] = smallTab;

        System.out.println("Długości tablic: ");
        System.out.println("longTab: "+hugeTab[0].length + " elementów;\n " +"midTab: "+ hugeTab[1].length +
                " elementów;\n " +"smallTab: "+ hugeTab[2].length+" elementów;");
        System.out.println("Setny element pierwszej tablicy: " + hugeTab[0][99]);
    }
}

