package CompMetody;

public class ComputerFactory {

//    Deklarujemy, że metoda create( parametry )
    Computer create(String proc, int memo){
//        deklarujemy nowy obiekt computer
        Computer computer = new Computer();
//        ustawiamy jego pola które wypełniamy parametrami zadeklarowanymi w metodzie
        computer.processor = proc;
        computer.memory = memo;
//        zwracamy dane (obiekt)
        return computer;
    }
}
