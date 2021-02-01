package PlikiTextowe;
//Scanner - można go wykorzystać do odczytu plików podobnie jak do odczytu danych z konsoli.
//posiada jedną wadę - średnią wydajność
//W przypadku małych plików nie jest to duży problem, jednak w przypadku dużych plików problem narasta.
// Scanner ma z góry narzucony bufor wielkości 1024 bajtów

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerReader {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "testFile.txt";
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);

        int lines = 0;
//        dopóki z pliku jest jeszcze kolejny wiersz tekstu scan.hasNextLine()
//        to go wczytaj i wyświetl oraz zwiększ zmienną lines o 1
        while ( scanner.hasNextLine()){
            String name = scanner.nextLine();
            System.out.println(name);
            lines++;
        }
        System.out.println("Ilość wierszy w pliku: " + lines);
        scanner.close();
    }
}
