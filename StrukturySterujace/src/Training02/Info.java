package Training02;

public class Info {
    public void comparisonInfo(int number, int reference) {
        if (number < reference) {
            System.out.println(number + " jest mniejsza od " + reference);
        } else if (number == reference) {
            System.out.println(number + " jest równa od " + reference);
        } else {
            System.out.println(number + " jest wieksza od " + reference);
        }
    }

    public void evenInfo(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " jest liczą parzystą");
        } else {
            System.out.println(number + " jest liczbą nie parzystą");
        }
    }

    //    ta metoda ma zwracać wynik, a nie wyświetlać liczbę.
    int getVerificationNumber(int number) {
        if (number == 0) {
            return 0;
        } else if (number / 1000 != 0) {
            return number;
        } else if (number / 100 != 0) {
//            podnosimy od dwa 0
            return number * 10;
        } else if (number / 10 != 0) {
//            podnosimy o trzy 0
            return number * 100;
        } else {
            return number * 1000;
        }
    }
}