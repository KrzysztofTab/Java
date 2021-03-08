package Example;

import Example.tools.CsvConvertible;

import java.io.Serializable;

public class Task implements Comparable<Task>, CsvConvertible, Serializable {
    private String name;
    private String discription;
    private Priority priority;   // wewnętrznego typu enum o nazwie Priority

    public Task(String name, String discription, Priority priority) {
        this.name = name;
        this.discription = discription;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return name + " - " + discription;
    }
    @Override
    public String toCsv() {
        return (name+ ";"+discription+";"+priority);
    }

    @Override
    public int compareTo(Task t) {
        return priority.compareTo(t.priority);
    }

//    HIGH, MODERATE i LOW - zwróć uwagę na kolejność, w której są wymienione, ponieważ jest to
//    jednocześnie kolejność, która stanowi naturalny porządek sortowania.
    public enum Priority {
        HIGH, MEDIUM, LOW;
    }
}