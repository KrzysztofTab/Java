package InterfejsSerializable.P02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReaderBox {
    public static void main(String[] args) {
        String fileName = "box.ser";
        Box myBox = null;

        try (
                var fileInput = new FileInputStream(fileName);
                var objectInput = new ObjectInputStream(fileInput)
        ) {
            myBox = (Box) objectInput.readObject();
        } catch (IOException | ClassNotFoundException exception) {
            System.err.println("Nie udało się odczytać pliku");
            exception.printStackTrace();
        }
        if (myBox != null) {
            System.out.println("Wczytane dane:");
            System.out.println("Wysokość: " + myBox.getHeight() + "\nDługość: " + myBox.getWidth());
        }
    }
}
