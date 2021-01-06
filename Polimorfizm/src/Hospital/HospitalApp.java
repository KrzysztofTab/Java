package Hospital;

public class HospitalApp {
    public static void main(String[] args) {
       Hospital hospital = new Hospital();
       hospital.add(new Doctor("Jan","Kowal",7500,1500));
       hospital.add(new Nurse("Ania","Danielska",2500,5));
       hospital.add(new Nurse("Małgorzata","Figlarska",2900,8));

        System.out.println("Pracownicy Szpitala: ");
        System.out.println(hospital.getInfo());
   }
}
