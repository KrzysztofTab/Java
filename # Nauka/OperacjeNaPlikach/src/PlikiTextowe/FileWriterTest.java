package PlikiTextowe;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        String fileName = "testFile.txt";

//        Ponieważ korzystamy z konstrukcji try-with-resources 'try() {} cach{}'
        try (
//                FileWriter pozwala zapisywać do pliku dane znak po znaku, a BufferedWriter wiersz po wierszu.
//                aby nadpiswyać dane zawarte wpliku to wystarczy fodać flagę 'true' w konstrutorze
                var fileWriter = new FileWriter(fileName, true);
                var writer = new BufferedWriter(fileWriter);
        ) {
//            Istotne jest to, żeby do zapisywania znaku nowej linii używać dedykowanej metody newLine()
            writer.newLine();
//            Do zapisu danych w pliku wykorzystujemy metodę write(), która jako argument przyjmuje dowolny String
            writer.write("Bolek");
            writer.newLine();
            writer.write("Lolek");
            writer.newLine();
            writer.write("Karolek");
        } catch (IOException e) {
            System.err.println("Nie udało się zapisać pliku " + fileName);
        }
    }
}