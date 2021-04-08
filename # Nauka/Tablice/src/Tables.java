public class Tables {
    public static void main(String[] args) {
        String[] names = {"Jan", "Kasia", "Basia"};
        int[] numbers = {3, 4, 5};
        System.out.println("\n"+numbers[1] + "= "+names[2]);

        int []tablica01 = {5,10,15};
        int []tablica02 = {23, 27, 39};
        ArrayUtils arrayUtils = new ArrayUtils();
        int sum = arrayUtils.sumArrays(tablica01,tablica02);
        System.out.println("Suma liczb w tablicah: "+sum);

//        int suma01 = tablica01[0]+tablica01[1]+tablica01[2];
//        int suma02 = tablica02[0]+tablica02[1]+tablica02[2];
//        System.out.println ("\n"+"Suma liczb z pierwszej tablicy: "+suma01);
//        System.out.println ("Suma liczb z drugiej tablicy: "+suma02);
//        System.out.println("Suma licz dwóch tablic: " + (suma01+ suma02));
    }
}
