package Zadanie06;

//    klasa z logiką aplikacji umożliwiająca dopisanie pacjenta do kolejki
//    oraz wyświetlenie wszystkich zapisanych pacjentów
//    Do szpitala może zapisać się co najwyżej 10 pacjentów,
//    przy próbie zapisania kolejnego wyświetlana jest informacja o tym, że limit został już wyczerpany


public class Hospital {
    private final int maxPatientsNumber = 10; //maxymalna liczba pacjentów
    private Patient[] patients = new Patient[maxPatientsNumber]; //tablica na pacjentów
    private int regPatiens = 0; //aktualna liczba pacjentów


    public void addPatient(Patient patient) {
//        dodawanie pacjenta do tablicy
        if (regPatiens < maxPatientsNumber) {
            patients[regPatiens] = patient;
            regPatiens++;
        } else {
            System.out.println("Zapisano maksymalną ilosć pacjentów!");
        }
    }

    public void printPatients() {
//        wyświetlanie pacjentów
        for (int i = 0; i < regPatiens; i++) {
            System.out.println(patients[i].getFirstName() + " "
                    + patients[i].getLastName() + " "
                    + patients[i].getPesel()+"\n");
        }
    }
}
