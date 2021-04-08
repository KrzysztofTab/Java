import java.util.ArrayList;
import java.util.List;

public class Lambda {
    private static void przetworzListeSamochodow(List<Samochod> lista, doSome d) {
        for (Samochod sam : lista) {
            d.doThat(sam);
        }
    }

    public static void main(String[] args) {
        List<Samochod> lista = new ArrayList<>();
        lista.add(new Samochod("Audi", "A4", "WA 12345"));
        lista.add(new Samochod("Porsche", "Panamera", "EL 56564"));
        lista.add(new Samochod("Skoda", "Octavia", "LLU 12345"));

//        III - wersja
        przetworzListeSamochodow(lista, System.out::println);


//        II - wersja
//        przetworzListeSamochodow(lista, samochod -> System.out.println(samochod));


//        I - wersja
//        przetworzListeSamochodow(lista, new doSome() {
//            @Override
//            public void doThat(Samochod samochod) {
//                System.out.println(samochod);
//            }
//        });
    }
    //    tworzę interfejs posiadający metodę przyjmującą przez parametr pojedynczy obiekt klasy Samochod:
    public interface doSome {
        void doThat(Samochod samochod);
    }
}
