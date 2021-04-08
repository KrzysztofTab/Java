package InterfejsSerializable.P02;

//Interfejs Serializable wchodzi w skład pakietu java.io,zatem musisz go zaimportować.

import java.io.Serial;
import java.io.Serializable;

public class Box implements Serializable {
    @Serial
    private static final long serialVersionUID =125;
//    Te dwie wartości  będą zapisywane.
    private int width;
    private int height;
//    transient To słowo kluczowe oznacza „nie zapisuj tej składowej podczas serializacji, po prostu ją pomiń”.
    transient String bigFat;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
