package ReferencjaDoMetody;

import java.util.List;
import java.util.function.Consumer;

public class ComputerMethods {
    public static void main(String[] args) {
        List<Computer> computer = List.of(
                new Computer("Lenovo", 3000, 45),
                new Computer("HP", 3200, 66),
                new Computer("Apple", 3400, 78),
                new Computer("Asus", 2800, 42)
        );
        //  przekazanie referencji do metody -  Klasa::metodaStatyczna - przekazanie metody statycznej klasy,
        consume(computer, ComputerMethods::computerPrinterWithTemperature); // com -> computerPrinterWithTemperature(com);
    }

    private static void computerPrinterWithTemperature(Computer computer) {
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