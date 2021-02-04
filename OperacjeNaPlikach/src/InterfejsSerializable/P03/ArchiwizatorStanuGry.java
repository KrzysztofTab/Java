package InterfejsSerializable.P03;

import java.io.*;

public class ArchiwizatorStanuGry {
    public static void main(String[] args) {

        Bohater postac1 = new Bohater(50, "Elf", new String[]{"łuk", ", miecz", ", pył"});
        Bohater postac2 = new Bohater(200, "Trol", new String[]{"pięci", ", wielki topór"});
        Bohater postac3 = new Bohater(120, "Magik", new String[]{"czary", ", niewidzialność"});
// 		tu wykonujemy jakieś operacje, które mogą zmieniać stan postaci,
// 		a następnie zapisujemy te obiekty
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Gra.ser"));
            os.writeObject(postac1);
            os.writeObject(postac2);
            os.writeObject(postac3);
            os.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
//		Przypisujemy tym zmiennym wartości null, żeby uniemożliwić odwołanie się od obiektów na stercie.
        postac1 = null;
        postac2 = null;
        postac3 = null;

//   	Odcytrujemy bohaterów pliku
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Gra.ser"));
            Bohater p1N = (Bohater) is.readObject();
            Bohater p2N = (Bohater) is.readObject();
            Bohater p3N = (Bohater) is.readObject();
            System.out.println("Typ postaci 1.: " + p1N.getTyp() + ", moc: " + p1N.getMoc());
            System.out.println("Typ postaci 2.: " + p2N.getTyp() + ", broń: "+ p2N.getBronie());
            System.out.println("Typ postaci 3.: " + p3N.getTyp() + ", moc: " + p3N.getMoc() +
                    ", broń: "+ p3N.getBronie()  );
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
