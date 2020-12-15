package For;

public class ForLop {
    public static void main(String[] args) {
        int[] numers = new int[10];
//        uzupełniamy tablicę
//        numers.length - odwołuje się do wielkosci tablicy w tym przypadku[10]
        for (int i = 0; i < numers.length; i++) {
            numers[i] = i + 1;
        }
//        wyświetlamy tablice
        for (int i=0; i< numers.length; i++){
            System.out.println("Liczba: "+numers[i]);
        }
    }
}
