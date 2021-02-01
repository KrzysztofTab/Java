package PlikiTextowe;//BufferedReader o domyślnym buforze 8192 bajtów, który dodatkowo możemy zmienić (np. jeszcze bardziej powiększyć).
// Dzięki większemu buforowi, do pamięci komputera jednorazowo będzie wczytany większy fragment pliku,
// aplikacja będzie się dzięki temu rzadziej komunikowała z dyskiem twardym, a tym samym będzie szybciej działała.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {
    public static void main(String[] args) {
        String fileName = "testFile.txt";
//        Różnica pomiędzy FileReader, a BufferedReader jest taka,
//        że ta pierwsza pozwala nam czytać plik znak po znaku, natomiast ta druga wiersz po wierszu

        try (
                var fileReader = new FileReader(fileName);
                var bufferedReader = new BufferedReader(fileReader);
        ) {
//            Jeśli readLine() zwróci wartość null, oznacza to, że doszliśmy do końca pliku i należy wyjść z pętli.
            String nextLine = null;
            int lines = 0;
            while ((nextLine = bufferedReader.readLine()) != null) {
                System.out.println(nextLine);
                lines++;
            }
            System.out.println("Ilość wierszy w pliku: " + lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}