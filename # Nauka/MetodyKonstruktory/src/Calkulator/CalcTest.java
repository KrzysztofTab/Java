package Calkulator;

public class CalcTest {

    public static void main(String[] args) {

        Calc calc = new Calc();
        double addResult = calc.add(2.5, 7.5);
        System.out.println(addResult);

//        wiswietli metode  "void addAndPrint" po podaniu argumentów w nawiasach
        calc.addAndPrint(6,8);
    }
}
