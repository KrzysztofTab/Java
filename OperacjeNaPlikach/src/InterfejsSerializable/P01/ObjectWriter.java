package InterfejsSerializable.P01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriter {
    public static void main(String[] args) {
        String fileName = "person.obj";
        Person p1 = new Person("Jan", "Kowalski");

        try (
                var fs = new FileOutputStream(fileName);
                var os = new ObjectOutputStream(fs)
        ) {
            os.writeObject(p1);
            System.out.println("Zapisano obiekt do pliku");
        } catch (IOException exception) {
            System.out.println("Bład zapisu pliku " + fileName);
            exception.printStackTrace();
        }
    }
}
