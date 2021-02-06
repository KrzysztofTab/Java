package InterfejsSerializable.P05;

import java.io.Serializable;

public class Employee extends Person implements Serializable {
    private  double pay;


    public Employee(String firstName, String lastName, double pay) {
        super(firstName, lastName);
        this.pay = pay;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return super.toString()+", wypłata: " + pay +"zł";
    }
}
