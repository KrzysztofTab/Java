package Kalkulator;

class Calkulator {

//		dodawanie	
	void addPrint(int a, int b) {
        int result = a + b;
        System.out.println("Wynik dodawania: "+result);
    }
//		odejmowanie
	void subtractPrint(int a, int b) {
		int result = a - b;
        System.out.println("Wynik odejmowania: "+result);
	}
//		mnożenie	
	void multiplyPrint(int a, int b) {
		int result = a * b;
        System.out.println("Wynik mnożenia: "+result);
	}
//		dzielenie
	void dividePrint(double a, double b) {
		double result = a / b;
        System.out.println("Wynik dzielenia: "+result);
	}
}