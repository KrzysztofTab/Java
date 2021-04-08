package MetodyGeneryczne;

public class GenericMethods {
    public static void main(String[] args) {
        print5Times(2);
        print5Times("Krzysio");
    }

//    metoda generyczna
    private static <T> void print5Times(T arg) {
        for (int i = 0; i <2; i ++){
            System.out.println(arg);
        }
    }
}
