package Calkulator;

class Calc {

//    metoda ta musi zwracać wynik (nie wyswietlać - zwracać)
    double add(double a, double b){
        double result = a+b;
        return result;
//      return a+b;
    }

//    void mówiąc o tym, że metoda nic nie zwróci
//    Zamiast tego obliczymy wynik dodawania i wyświetlimy go na ekranie.
    void addAndPrint(int a, int b){
        int result = a+b;
        System.out.println(result);
    }

}
