package CompMetody;

//      tworzymy klasę która nie zwraca nic
//      metoda bedzie zawierała dwa parametry, Pierwszy to komputer,
//      któremu chcemy zwiększyć ilość pamięci, a drugi to liczba
//      określająca ile tej pamięci ma zostać dodane

public class ComputerUpgrade {
    void addMemory(Computer computer, int additionalMemory){
//        nowy wartosć pamieci = star wartosć pamieci + wartość podana przez nas
        computer.memory = computer.memory + additionalMemory;
    }
}
