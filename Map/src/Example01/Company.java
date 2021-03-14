package Example01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Company {
    public Map<String, Employee> employees = new HashMap<>();


    void addEmployee(Employee employee) {
        String key = employee.getFirstName() + " " + employee.getLastName();
        if (employees.containsKey(key)) {
            return;
        }
        employees.put(key, employee);
    }

    Employee getEmployee(String firstName, String lastName) {
        String key = firstName + " " + lastName;
        return employees.get(key);
    }

}
