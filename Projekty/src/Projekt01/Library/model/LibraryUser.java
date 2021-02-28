package Projekt01.Library.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LibraryUser extends User {
    private List<Publication> publicationHistory = new ArrayList<>();
    private List<Publication> borrowedPublications = new ArrayList<>();

    public List<Publication> getPublicationHistory() {
        return publicationHistory;
    }

    public List<Publication> getBorrowedPublications() {
        return borrowedPublications;
    }

    public LibraryUser(String firstName, String lastName, String pesel) {
        super(firstName, lastName, pesel);
    }

    private void addPublicationToHistory(Publication pub) {
        publicationHistory.add(pub);
    }

    private void borrowPublication(Publication pub) {
        borrowedPublications.add(pub);
    }

    //    sprawdzamy dla bezpieczeństwa, czy dany użytkownik na pewno aktualnie posiada taką książkę na swoim koncie
//    (metoda remove kolekcji zwraca true, jeśli element zostanie pomyślnie usunięty).
    public boolean returnPublication(Publication pub) {
        boolean result = false;
        if (borrowedPublications.remove(pub)) {
            result = true;
            addPublicationToHistory(pub);
        }
        return result;
    }
    @Override
    public String toCsv() {
        return getFirstName() + ";" + getLastName() + ";" + getPesel();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibraryUser)) return false;
        if (!super.equals(o)) return false;
        LibraryUser that = (LibraryUser) o;
        return Objects.equals(getPublicationHistory(), that.getPublicationHistory()) &&
                Objects.equals(getBorrowedPublications(), that.getBorrowedPublications());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPublicationHistory(), getBorrowedPublications());
    }
}
