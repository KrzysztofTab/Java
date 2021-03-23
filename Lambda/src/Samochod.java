public class Samochod {
    private String marka;
    private String model;
    private String numerRejestracyjny;

    public Samochod(String marka, String model, String numerRejestracyjny) {
        this.marka = marka;
        this.model = model;
        this.numerRejestracyjny = numerRejestracyjny;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumerRejestracyjny() {
        return numerRejestracyjny;
    }

    public void setNumerRejestracyjny(String numerRejestracyjny) {
        this.numerRejestracyjny = numerRejestracyjny;
    }

    @Override
    public String toString() {
        return "Samochod{" + "marka='" + marka + ", model='" + model + ", numerRejestracyjny='" + numerRejestracyjny + '}';
    }
}
