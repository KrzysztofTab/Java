package WyjatkiTryCatch;

public class Wyjatek05 {
    public static void main(String[] args) {
        String test = "nie";
        try {
            System.out.println("Poczatek bloku try");
            zaryzykuj(test);
            System.out.println("Koniec bloku try");
        }catch(Exception sw){
            System.out.println("Straszny wyjatek");
        }finally {
            System.out.println("Blok finally");
        }
        System.out.println("Koniec metody main");
    }
    static void zaryzykuj(String test) throws Exception {
        System.out.println("Poczatek ryzykownej metody");
        if ("tak".equals(test)) {
            throw new Exception();
        }
        System.out.println("Koniec ryzykownej metody");
        return;
    }
}
