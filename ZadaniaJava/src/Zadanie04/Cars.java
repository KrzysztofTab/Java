package Zadanie04;

public class Cars {
    private String model;
    private String brand;
    private boolean moving;
    private boolean roofOpen;

    public Cars(String brand, String model) {
        this.model = model;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        if(moving){
            System.out.println("Nie możesz otwierać lub zamykać dachu w czasie jazdy");
        }else {
            System.out.println("Możesz zamknąć lub otworzyć dach.");
        }
        this.moving = moving;
    }

    public boolean isRoofOpen() {
        return roofOpen;
    }

    public void setRoofOpen(boolean roofOpen) {
        if (roofOpen){
            System.out.println();
        }else {
            System.out.println("\n"+"Przykro mi masz tanszą wersję!");
        }
        this.roofOpen = roofOpen;
    }

}