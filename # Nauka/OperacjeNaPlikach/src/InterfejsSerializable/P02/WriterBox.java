package InterfejsSerializable.P02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriterBox {
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.setHeight(20);
        myBox.setWidth(50);

        try (
//            Nawiązujemy połączenie z plikiem „pudelko.ser”,jeśli taki istnieje
//            Jeśli plik o podanej nazwie nie istnieje, to zostanie utworzony.
                var fileOutpu = new FileOutputStream("box.ser");
//            Tworzymy strumień ObjectOutputStream połączone ze strumieniem FileOutputStream.Następnie nakazujemy
//            zapisać obiekt w strumieniu.
                var objectOutput = new ObjectOutputStream(fileOutpu)
        ) {
            objectOutput.writeObject(myBox);
            System.out.println("Plik został zapisany !");
//            Operacje wejścia-wyjścia mogą zgłaszać wyjątki
        } catch (IOException exception) {
            System.out.println("Nie można storzyc pliku \"box.ser\"");
            exception.printStackTrace();
        }
    }
}
