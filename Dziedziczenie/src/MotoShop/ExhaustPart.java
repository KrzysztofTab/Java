package MotoShop;

public class ExhaustPart extends Part {
    private boolean europeanStandard;

    public ExhaustPart(int serialNumber, String producer, String model, String series, boolean europeanStandard) {
        this.europeanStandard = europeanStandard;
        setSerialNumber(serialNumber);
        setProducer(producer);
        setModel(model);
        setSeries(series);
    }

    public boolean isEuropeanStandard() {
        return europeanStandard;
    }

    public void setEuropeanStandard(boolean europeanStandard) {
        this.europeanStandard = europeanStandard;
    }

    void printInfo() {
        System.out.println(getSerialNumber() + ", " + getProducer() + ", " + getModel() + ", " + getSeries()
                + ", " + europeanStandard);
    }
}
