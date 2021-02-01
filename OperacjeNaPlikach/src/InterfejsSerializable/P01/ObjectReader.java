package InterfejsSerializable.P01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReader {
    public static void main(String[] args) {
        String fileName = "person.obj";
        Person p1 = null;

        try (
            var fileInput = new FileInputStream(fileName);
            var objectInput = new ObjectInputStream(fileInput)
        ){
            p1=(Person) objectInput.readObject();
        }
        catch (IOException | ClassNotFoundException exception) {
            System.err.println("Nie udało się odczytać pliku");
            exception.printStackTrace();
        }
        if (p1 !=null){
            System.out.println("Wczytane dane:");
            System.out.println(p1.getFirstName()+" "+p1.getLastName());
        }
    }
}
