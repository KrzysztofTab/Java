package Przyklad.CarShop;

import Przyklad.Car.Car;

public class CarShop {
    public static void main(String[] args) {
        Car audiA5 = new Car(2014, "Audi", "A5", "Czarne");
        System.out.println("Rocznik: " + audiA5.getYear()); //2014
        //zmieniamy rocznik
        audiA5.setYear(2015);
        System.out.println("Rocznik: " + audiA5.getYear()); //2015
        //próbujemy znowu przestawić
        audiA5.setYear(-500); //komunikat w konsoli
        System.out.println("Rocznik: " + audiA5.getYear()); //2015
    }
}