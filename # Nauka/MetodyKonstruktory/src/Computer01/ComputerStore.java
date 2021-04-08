package Computer01;

public class ComputerStore {
    public static void main(String[] args) {
        Computer comp01 = new Computer();
        comp01.processor = "Intel i5";
        comp01.memory = 8195;

        Computer comp02 = new Computer();
        comp02.processor = "AMD 1700";
        comp02.memory= 16384;

//           przy duzej ilosci danych do wyswietlenia nie praktyczne
//       System.out.println(comp01.processor + " " + comp01.memory);
//       System.out.println(comp02.processor + " " + comp02.memory);

//             I -  wywołanie mtody wyswietlania
//             I -  dane te pobierane są z obiektów, na których wywołujemy tę metodę - comp1 lub comp2.
//       comp01.printInfo();
//       comp02.printInfo();

//              II - najpierw przypisując wynik metody getInfo() do zmiennej,
//                   a następnie przekazując tę zmienną do metody println()
        String comp1Info = comp01.getInfo();
        System.out.println(comp1Info); //"Intel i5 8192"
//              II - prostu przekazując wynik metody bezpośrednio do metody println()
        System.out.println(comp02.getInfo()); //"AMD Ryzen 1700 16384"

    }
}
