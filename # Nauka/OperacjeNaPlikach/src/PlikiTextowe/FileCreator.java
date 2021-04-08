package PlikiTextowe;
//File - podstawowa klasa, która pozwala przechowywać informacje o pliku, a także o katalogach,
// ale nie służy bezpośrednio do operacji na nich,

import java.io.File;
import java.io.IOException;

public class FileCreator {
    public static void main(String[] args) {
//        tworzymy plik 'testFile'
        String fileName = "testFile.txt";
        File file = new File(fileName);

//        exists(), która zwraca true lub false w zależności od tego, czy plik lub folder istnieje, czy nie
        boolean fileExists = file.exists();
        if(!fileExists){
            try {
//                Jeśli plik nie istnieje, to tworzymy go za pomocą metody createNewFile()
                fileExists = file.createNewFile();
            } catch (IOException e) {
                System.out.println("Nie udało się uteorzyć pliku");
            }
        }
        if(fileExists)
            System.out.println("Plki "+ fileName + " istnieje lub został utworzony");
    }
}
