package InterfejsSerializable.P05;

import java.io.Serializable;

public class Company implements Serializable {
    public static final int MAX_EMPOLYEES = 3;
    private Employee[] employees = new Employee[MAX_EMPOLYEES];
    private int index = 0;

//    Metoda add() przyjmuje pracownika i dodaje go na kolejne wolne miejsce w tablicy
    public void add(Employee employee){
        employees[index] = employee;
        index++;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Employee employee: employees){
            builder.append(employee.toString());
            builder.append("\n");
        }
        return builder.toString();
    }
}
