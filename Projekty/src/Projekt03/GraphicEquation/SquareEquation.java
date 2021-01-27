package Projekt03.GraphicEquation;

public class SquareEquation {
    private int danaA;
    private int danaB;
    private int danaC;

    public SquareEquation(int danaA, int danaB, int danaC) {
        this.danaA = danaA;
        this.danaB = danaB;
        this.danaC = danaC;
    }

    public String solution() {
        String rozwiązanie = "";
        double delta;
        delta = (danaB * danaB - 4 * danaA * danaC);
        if (delta > 0) {
            delta = Math.sqrt(delta);
            double x1 = (-danaB - delta) / (2 * danaA);
            double x2 = (-danaB + delta) / (2 * danaA);
            rozwiązanie = "Równanie posiada dwa pierwiastki rzeczywiste:"+"\n" + x1 + " oraz " + x2;
        } else if (delta == 0) {
            delta = Math.sqrt(delta);
            double x0 = (-danaB / (2 * danaA));
            rozwiązanie = "Równanie posiada jeden pierwiastek rzeczywisty" + x0;
        } else {
            rozwiązanie = "Brak pierwisatków rzeczywistych";
        }
        return rozwiązanie;
    }

    @Override
    public String toString() {
        return "Równanie kwadratowe: " + danaA + " x^2+ " + danaB + " x+" + danaC;
    }

    public void setDanaA(int danaA) {
        this.danaA = danaA;
    }

    public void setDanaB(int danaB) {
        this.danaB = danaB;
    }

    public void setDanaC(int danaC) {
        this.danaC = danaC;
    }
}
