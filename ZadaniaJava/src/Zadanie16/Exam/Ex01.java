package Zadanie16.Exam;

public class Ex01 {
    public static void main(String[] args) {
        char[] charArray = {'u', 'r', 'o', 'd', 'z', 'i', 'n', 'y'};
        String s = new String("witaj");

        // Użycie konstruktorów klasy String
        String s1 = "";
        String s2 = s;
        String s3 = new String(charArray);
        String s4 = new String(charArray, 5, 3);

        System.out.printf(
                "s1 = %s s2 = %s s3 = %s s4 = %s ", s1, s2, s3, s4);
    }
}
