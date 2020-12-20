package Cwiczenie;

public class Student {

    //    tworzymy statyczny identyfikator
    private static int studentNr = 0;
    private String firstName;
    private String lastName;
    private int numberIndex;

    //    Najważniejszym fragmentem kodu w całym zadaniu jest inkrementowanie zmiennej statycznej w konstruktorze klasy
//    (inkrementacja będzie zachodziła wraz z tworzeniem każdego nowego obiektu Student)
    public Student(String firstName, String lastName, int numberIndex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberIndex = numberIndex;
//        przy każdym wywołaniu konstruktora zwiększamy liczbę studentów
        studentNr++;
    }

//    Pole studentNr oznaczyliśmy jako prywatne i dodaliśmy do niego tylko getter.
    public static int getStudentNr() {
        return studentNr;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberIndex() {
        return numberIndex;
    }

    public void setNumberIndex(int numberIndex) {
        this.numberIndex = numberIndex;
    }
}
