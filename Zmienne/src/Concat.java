class Concat {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = " World!";
        String s3 = s1 + s2;

        System.out.println(s3);

        // konkatenacji możemy używać bezpośrednio w print()
        System.out.println("Uczę się Javy od " + 2 + " dni");
        // można też łączyć inne typy
        System.out.println("Kasia is beautiful. It is " + true);
    }
}