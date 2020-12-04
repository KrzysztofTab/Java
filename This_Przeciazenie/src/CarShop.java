public class  CarShop {

    public static void main(String[] args) {
	Car audiA5 = new Car(2014, "Audi", "A5", "Czarne");
	Car audiA4 = new Car(2015, "Audi","A4");
	audiA4.color="Czerwony";
        System.out.println(audiA4.brand + " " + audiA4.model + " " + audiA4.year + " " + audiA4.color);
        System.out.println(audiA5.brand + " " + audiA5.model + " " + audiA5.year + " " + audiA5.color);

    }
}
