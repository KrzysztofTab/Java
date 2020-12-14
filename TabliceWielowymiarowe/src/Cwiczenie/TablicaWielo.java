package Cwiczenie;

public class TablicaWielo {
    public static void main(String[] args) {
        double[][] tab = new double[3][];
        double[] lin01 = {1.0, 1.5, 2.0};
        double[] lin02 = {1.5, 2.0, 2.5};
        double[] lin03 = {2.0, 2.5, 3.0};

        tab[0] = lin01;
        tab[1] = lin02;
        tab[2] = lin03;

//        Sumę iloczynów przekątnych tablicy,
//        iloczyn sum środkowego wiersza i środkowej kolumny tablicy,
//        sumę wszystkich elementów znajdujących się przy krawędzi tablicy.
        double result01 = ((tab[0][0]*tab[1][1]*tab[2][2])+(tab[0][2]*tab[1][1]*tab[2][0]));
        System.out.println("Suma iloczynów przekątnych tablicy wynosi: "+result01+"\n");

        double result02 = ((tab[1][0]+tab[1][1]+tab[1][2])*(tab[0][1]+tab[1][1]+tab[2][1]));
        System.out.println("Iloczyn sum środkowego wiersza i środkowej kolumny tablicy wynosi: "+result02+"\n");

        double result03 = (tab[0][0]+tab[1][0]+tab[2][0])+(tab[2][1]+tab[2][2]+tab[1][2]+tab[0][2]+tab[0][1]);
        System.out.println("Suma  wszystkich elementów znajdujących się przy krawędzi tablicy wynosi: "+result03);
    }
}
