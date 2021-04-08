package Computer;

public class NotebookShop {
    public static void main(String[] args) {
        DataStore dataStore = new DataStore();
        dataStore.add(new Computer("IBM", 7896));
        dataStore.add(new Computer("Dell", 8753));
        dataStore.add(new Computer("Lenovo", 7896));
        dataStore.add(new Computer("HP", 5412));
        dataStore.add(new Computer("IBM", 7896));
        dataStore.add(new Computer("Lenovo", 7896));

        Computer compToFind = new Computer("Lenovo", 7896);
        int compFound = dataStore.checkAvailability(compToFind);
        System.out.println("Liczba komputerów takich samych: " + compToFind + ": " + compFound + " szt.");

        System.out.println("Wszystkie dostępne komputery: ");
        for (Computer c : dataStore.getDesktop()) {
            System.out.println(c);
        }


    }
}
