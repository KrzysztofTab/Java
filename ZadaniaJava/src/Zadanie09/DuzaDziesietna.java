package Zadanie09;

import java.math.BigDecimal;


public class DuzaDziesietna {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("9.5");
        BigDecimal b = new BigDecimal("4");
        BigDecimal c = new BigDecimal("0.33");

        System.out.println(a.divide(b).multiply(c));
    }
}