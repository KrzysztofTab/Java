package Example02;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapTest {
    static Scanner sc = new Scanner(System.in);

    public void printNotebook(Map<Integer, Notebook> notebooks) {
        System.out.println();
        Set<Map.Entry<Integer, Notebook>> entries = notebooks.entrySet();
        for (Map.Entry<Integer, Notebook> entry : entries){
            System.out.println(entry.getKey()+ " : "+ entry.getValue());
        }
    }

    public void addNotebook(Map<Integer, Notebook> notebooks) {
        System.out.println("Podaj numer :");
        int numer = sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj nazwę: ");
        String name = sc.nextLine();
        System.out.println("Podaj cenę: ");
        double price = sc.nextDouble();
        notebooks.put(numer,new Notebook(numer, name, price ));
    }
}
