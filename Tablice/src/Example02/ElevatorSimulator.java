package Example02;

public class ElevatorSimulator {
    public static void main(String[] args) {
//        osoby
        Person person01 = new Person(1,160);
        Person person02 = new Person(2,45);
        Person person03 = new Person(3, 150);
        Person person04 = new Person(4, 120);
        Person person05 = new Person(5, 70);

//        5 osób próbuje wsiąść
        Elevator elevator = new Elevator();
//        elevator.add(person01);
////        elevator.add(person02);
////        elevator.add(person03);
//        elevator.add(person04);
//        elevator.add(person05);

//        wszyscy wysiadają
//        elevator.clear();
//
//        //wsiadają 3 ciężkie osoby
        elevator.add(person01);
        elevator.add(person03);
        elevator.add(person04);
//        elevator.start(); //winda przeciążona
////        wszyscy wysiadają
        elevator.clear();
//
////        wsiadają dwie osoby, waga w normie
        elevator.add(person01);
        elevator.add(person03);
////        winda może wystartować
        elevator.start();
    }
}
