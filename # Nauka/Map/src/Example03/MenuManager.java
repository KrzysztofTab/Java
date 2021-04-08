package Example03;

import Example03.execption.DataExportException;
import Example03.execption.NoSuchOptionException;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.TreeSet;

public class MenuManager {
    public static String FILE_NAME = "ArticlesRTV.csv";
    private final ProductReader dataReader = new ProductReader();
    Map<String, TreeSet<Product>> productsMap = new HashMap<>();

    public void mapControl() {
        try {
            productsMap = ProductImporter.readFile(FILE_NAME);
            System.out.println("\nZaimportowane dane z pliku " + FILE_NAME);
        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku " + FILE_NAME);
        }
    }

    public void controlLoop() {
        Option option;
        do {
            printOptions();
            option = getOption();
            switch (option) {
                case WCZYTANIE_DANYCH -> printProduct();
                case WPROWADZANIE_DANYCH -> addProduct();
                case EXIT -> exit();
                default -> System.out.println("Nie ma takiej opcji, wprowadź ponownie: ");
            }
        } while (option != Option.EXIT);
    }

    private void printProduct() {
        ProductManager.printAllCategory(productsMap);
        String category = dataReader.readCategoryFromUser();
        ProductManager.printCategoryStats(productsMap, category);
    }

    private void addProduct() {

    }

    private void exit() {
        try {
//            fileManager.exportData(library);
            System.out.println("Export danych do pliku zakończony powodzeniem");
        } catch (DataExportException e) {
            System.out.println(e.getMessage());
        }
        dataReader.close();
        System.out.println("\nKoniec programu!");

    }

    private Option getOption() {
        boolean optionOk = false;
        Option option = null;
        while (!optionOk) {
            try {
                option = Option.createFromInt(dataReader.getInt());
                optionOk = true;
            } catch (NoSuchOptionException e) {
                System.out.println(e.getMessage() + ", podaj ponownie:");
            } catch (InputMismatchException ignored) {
                System.out.println("Wprowadzono wartość, która nie jest liczbą, podaj ponownie:");
            }
        }
        return option;
    }

    private void printOptions() {
        System.out.println("\nWybierz opcję: ");
        for (Option option : Option.values()) {
            System.out.println(option.toString());
        }
    }
}
