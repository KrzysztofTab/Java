package Ex01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class Example01 {
    public static void main(String[] args) {
        final String fileName = "Numbers.txt";
        try (
                var fr = new FileReader(fileName);
                var br = new BufferedReader(fr);
        ) {
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int c = Integer.parseInt(br.readLine());
            BigInteger big01 = new BigInteger(br.readLine());
            BigInteger big02 = new BigInteger(br.readLine());
            System.out.println("a + b + c =" + (a + b + c));
            System.out.println("Big1 + Big2 =" + big01.add(big02));
        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku");
        } catch (IOException e) {
            System.err.println("Błąd odczytu danych");
        }
    }
}
