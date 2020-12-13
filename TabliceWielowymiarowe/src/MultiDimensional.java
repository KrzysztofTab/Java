public class MultiDimensional {
    public static void main(String[] args) {
//        tworzymy dwie osobne tablice jednowymiarowe
        String[] firstNames = {"Marian", "Anna","Krystyna", "Tadeusz","Jan"};
        String[] lastNames = {"Kowalski","Janeczek","Lechowska","Nowacki"};
//        tworzymy tablicę wielowymiarową składajaca sie z dwóch tablic jednowymiarowych
        String[][] firstLast = {firstNames, lastNames};

        System.out.print("Pierwsza osoba to: ");
        System.out.println(firstLast[0][0] + " " + firstLast[1][0]);
        System.out.print("Druga osoba to: ");
        System.out.println(firstLast[0][1] + " " + firstLast[1][1]);
        System.out.print("Trzecia osoba to: ");
        System.out.println(firstLast[0][2] + " " + firstLast[1][2]);
//        sprawdzamy długosć tablicy
        System.out.println("\n"+"Wielowymiarowa tablica skłąda się z: "+firstLast.length + " tablic.");
        System.out.println("Tabilca jednowymiarowa Imion skałda się z: "+firstNames.length + " elementów.");
        System.out.println("Tabilca jednowymiarowa Nzawisk skałda się z: "+lastNames.length +" elementów.");
    }
}
