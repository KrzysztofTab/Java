public class Zmienne {
    public static void main(String[] args) {
        String firstName = "Jan";
            //var przypisuje typ zmiennej w zależnoci co żeśmu przypisali do zmiennej int, string
        var lastName = "Kowalski";
        int age = 25;
        double height = 180;
           // final -  nie zmienisz przypisanego typu np: string na int
        final String pesel = "123789456";

        System.out.println( firstName +" "+lastName+ " ma "+ age+ " lat.");
        System.out.println("Pan "+ firstName+" ma pesel"+pesel+".");
        System.out.println(firstName + " ma zwrost "+ height +" cm.");
        System.out.println("Jeżeli "+firstName+" urosnie o 5 cm, to bedzie miał "+(height+5)+ " cm.");

        firstName = "Leon";
        System.out.println("Jan zmienił imię na "+ firstName+".");


        String marka = "Voldzwagen";
        String model = "Golf";
        int year = 2015;
        double price = 450505.50;
        System.out.println();
        System.out.println(marka+", "+model+", "+year+", "+price+" zł.");
    }
}
