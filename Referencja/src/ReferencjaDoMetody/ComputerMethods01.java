package ReferencjaDoMetody;

import java.util.List;
import java.util.function.Consumer;

public class ComputerMethods01 {
    public static void main(String[] args) {
        List<Computer> computer = List.of(
                new Computer("Lenovo", 3000, 45),
                new Computer("HP", 3200, 66),
                new Computer("Apple", 3400, 78),
                new Computer("Asus", 2800, 42)
        );
        //  Referencja do metody instancji
        //  obiekt::metodaInstancji - przekazanie metody niestatycznej - niezbędne jest wcześniejsze utworzenie obiektu,
        ComputerMethods01 computerMethods01 = new ComputerMethods01(); //   dodatkowy obiekt
        //  Referencję do takiej metody przekazujemy jednak poprzez instancję
        consume(computer, computerMethods01::computerPrinterWithTemperature);
                                                      // com -> computerMethods01.computerPrinterWithTemperature(com);
    }

    private void computerPrinterWithTemperature(Computer computer) {            //   usunięty static
        String textToPrint = computer.getName() + " " + computer.getCpu();
        if (computer.getTemperature() < 50)
            textToPrint += " / cold";
        else
            textToPrint += " / hot";
        System.out.println(textToPrint);
    }

    private static void consume(List<Computer> computers, Consumer<Computer> consumer) {
        for (Computer computer : computers) {
            consumer.accept(computer);
        }
    }
}
