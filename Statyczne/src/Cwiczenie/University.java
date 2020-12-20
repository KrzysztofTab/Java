package Cwiczenie;

public class University {
    public static void main(String[] args) {
        System.out.println("Liczba studentów przed zapisami: "+Student.getStudentNr());
        Student st01 = new Student("Karol", "Kowalski", 001);
        Student st02 = new Student("Ewa", "Kowalska", 002);
        System.out.println("Ilość studentów po zapisach: "+Student.getStudentNr());
    }
}