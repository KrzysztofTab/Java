import java.util.Arrays;

public class DataStore {
    private static final int MAX_COMPUTERA = 10;
    private Computer[] desktop = new Computer[MAX_COMPUTERA];
    private int desktopNumber = 0;

    //    tworzenie kopi tablicy z komputerami bez posiadanych null
    public Computer[] getDesktop() {
        Computer[] comps = new Computer[desktopNumber];
        if (desktopNumber >= 0) System.arraycopy(desktop, 0, comps, 0, desktopNumber);
        return comps;
    }

    void add(Computer computer) {
        if (desktopNumber < MAX_COMPUTERA && computer != null) {
            desktop[desktopNumber] = computer;
            desktopNumber++;
        } else
            System.out.println("Niemożna dodać wiecej computerów");
    }

    int checkAvailability(Computer find) {
        if (find == null)
            return 0;
        int count = 0;
        for (int i = 0; i < desktopNumber; i++) {
            if (find.equals(desktop[i]))
                count++;
        }
        return count;
    }
}

