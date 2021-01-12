package PomieszaneKomunikaty;

public class PomKom {
    public static void main(String[] args) {
        LetterA lA = new LetterA();
        LetterB lB = new LetterB();
        LetterC lC = new LetterC();
        LetterA lA2 =new LetterC();
        lB.m1();
        lC.m2();
        lA.m3();
        System.out.println();

        lC.m1();
        lC.m2();
        lC.m3();
        System.out.println();

        lA.m1();
        lB.m2();
        lC.m3();
        System.out.println();

        lA2.m1();
        lA2.m2();
        lA2.m3();
    }
}
