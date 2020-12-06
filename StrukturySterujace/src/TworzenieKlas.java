public class TworzenieKlas {
//    atrubity klasy
    private String firstName;
    private String lastName;

//      konstruktor klasy
    public TworzenieKlas(String imie, String nazwisko) {
        this.firstName = imie;
        this.lastName = nazwisko;
    }
//      get = służa do wyswietelenia atrybutów przy atrybutach prywatnych
    public String getFirstName() {
        return firstName;
    }
//     set = służa do zmiany atrybutów przy atrybutach prywatnych
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
