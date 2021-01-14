package WłasneWyjatki;

public class School {
    private Student[] students;
    private int studentsNumber;

    public School(int studentsNumber) {
        students = new Student[studentsNumber];
    }
//    'NoMoreSpaceException' wygeneruje wyjatek w przypadku, gdy już zabraknie miejsca w tablicy
    public void add(Student s) throws NoMoreSpaceException {
        if (studentsNumber >= students.length)
            throw new NoMoreSpaceException("Brak miejsca w szkole, szkoła przyjmuje: " + students.length + " os.");
        students[studentsNumber] = s;
        studentsNumber++;
    }

    public Student find(String firstName, String lastName) throws NoElementFoundException {
        for (int i = 0; i < studentsNumber; i++) {
            if (students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)) {
                return students[i];
            }
        }
        throw new NoElementFoundException("Nie znaleziono osoby " + firstName + " " + lastName);
    }
}
