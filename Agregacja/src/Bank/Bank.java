package Bank;

public class Bank {

    public static void main(String[] args) {

        Person person01 = new Person();
        person01.firstName = "Wojtek";
        person01.lastName = "Kokotek";
        person01.pesel = "98654732145";
//        torzenie refernci  w wreferencji
//        zawsze musimy utworzyć nową referencję
        person01.registeredAddress = new Address();
        person01.registeredAddress.city = "Wrocław";
        person01.registeredAddress.street = "Polna";
        person01.registeredAddress.home = "10a";
        person01.registeredAddress.zipCode = "55-120";

        BankAccount account01 = new BankAccount();
        account01.owner = person01;
        account01.balance = 10_000;

        Credit credit01 = new Credit();
        credit01.borrower = person01;
        credit01.cashBorrowed = 2000;
        credit01.interestRate = 0.05;
        credit01.termMonths = 12;

//        tworzenie nową referencję dla adresu
        Address address02 = new Address();
        address02.city ="Warszawa";
        address02.street = "Zielna";
        address02.home = "9";
        address02.flat = 7;
        address02.zipCode = "59-120";

        Person person02 = new Person();
        person02.firstName = "Marta";
        person02.lastName = "Kowalska";
        person02.pesel = "98654735351";
        person02.registeredAddress = address02;
        person02.livingAddress = person01.registeredAddress;

        BankAccount account02 = new BankAccount();
        account02.owner = person02;
        account02.balance = 25_000;

        Credit credit02 = new Credit();
        credit02.borrower = person02;
        credit02.cashBorrowed = 5000;
        credit02.interestRate = 0.07;
        credit02.termMonths = 24;

        System.out.println("Osoba 1:");
        System.out.println(person01.firstName + " " + person01.lastName + ", " + " pesel:"+ person01.pesel);
        System.out.println("posiada konto bankowe z kwotą: " + account01.balance);
        System.out.println("oraz kredyt na kwotę: " + credit01.cashBorrowed);
        System.out.println("Zamieszkała: " + person01.registeredAddress.city+ " ulica: " + person01.registeredAddress.street);
        System.out.println("\n");
        System.out.println("Osoba 2:");
        System.out.println(person02.firstName + " " + person02.lastName + ", " + " pesel:"+ person02.pesel);
        System.out.println("posiada konto bankowe z kwotą: " + account02.balance);
        System.out.println("oraz kredyt na kwotę: " + credit02.cashBorrowed);
        System.out.println("Zamieszkała: " + person02.livingAddress.city + " ulica: " + person02.livingAddress.street);
        System.out.println("Zameldowana: "+ person02.registeredAddress.city + " ulica: " + person02.registeredAddress.street);
    }
}
