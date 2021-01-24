package SortowanieBabelkowe;

public class Sorting {
    public static void main(String[] args) {
        int[] tab = {5, 10, 8, 23, 1009, 2938, 153, 24};
        Sortable sorter = new Sortable() {
            @Override
            public void sort(int[] array) {
                if (array == null)
                    throw new NullPointerException("Argument cannot be null");
                if (array.length == 0)
                    throw new IllegalArgumentException("Array has to have a last 1 value");

                for (int i = 0; i < array.length; i++) {
                    for (int j = 1; j < array.length - i; j++) {
//                        tablica = 9 , 7
//                        porównaj miejsce '0' = 9 > do miejsca '1'= 7
                        if (array[j - 1] > array[j]) {
//                            do 'temp'  przypisz miejsce '1'=7
                            int temp = array[j];
//                            a do pustego miejsca '1' przypisz wartosci z miejsca '0' =9 jeżeli jest wieksze
                            array[j] = array[j - 1];
//                            w puste teraz miejsce '0' wpisz wartoś przypisaną do 'temp' = 7
//                            tablica = 7, 9
                            array[j - 1] = temp;
                        }
                    }
                }
            }
        };
        printArray(tab);
        sorter.sort(tab);
        printArray(tab);
    }
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private interface Sortable {
        void sort(int[] array);
    }
}
