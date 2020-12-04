package Kalkulator;

import java.util.Random;

class Calculate {
    public static void main(String[] args) {

//        losowe wybieranie dwóch liczb
        int a = new Random().nextInt(100);
        int b = new Random().nextInt(10);
		System.out.println("Liczby: "+ "a= "+a+", b= "+b+"\n");
		
		Calkulator calk = new Calkulator();
        calk.addPrint(a, b);
		calk.subtractPrint(a, b);
		calk.multiplyPrint(a, b);
		calk.dividePrint(a, b);
        
    }
}
