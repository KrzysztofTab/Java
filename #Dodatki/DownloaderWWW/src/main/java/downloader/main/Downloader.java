package downloader.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class Downloader {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://www.wykop.pl");
                //   Metoda openStream() otwiera strumień, z którego możemy odczytywać informacje bajt po bajcie.
        InputStream inputStream = url.openStream();
        InputStreamReader inReader = new InputStreamReader(inputStream);
                // BufferedReader pozwoli nam odczytywać kod HTML wiersz po wierszu.
        BufferedReader bufferedReader= new BufferedReader(inReader);

        String line = null;
        while ((line = bufferedReader.readLine()) !=null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
