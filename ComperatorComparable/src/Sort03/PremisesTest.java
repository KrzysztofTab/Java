package Sort03;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class PremisesTest {
    public static void main(String[] args) {
        final String fileName = "premises.csv";
        try {
            Premises[] premises = PremisesExplorer.readFile(fileName);
            Arrays.sort(premises);
            System.out.println();
            for (Premises p : premises)
                System.out.println(p);
        } catch (FileNotFoundException e) {
            System.out.println("Brak pliku o nazwie " + fileName);
        }
    }
}
