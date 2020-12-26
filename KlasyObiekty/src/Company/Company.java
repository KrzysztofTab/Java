package Company;

class Company {
    public static void main(String[] args) {
        Employee emplo01 = new Employee();
        emplo01.firstName = "Jan";
        emplo01.lastName = "Kowalski";
        emplo01.birthday = 1980;
        emplo01.seniority = 5;
        String emplo01Info = emplo01.firstName + " " + emplo01.lastName
                + ", Rok urodzenia: " + emplo01.birthday + ", Staż pracy: " + emplo01.seniority +" lat";

        Employee emplo02= new Employee();
        emplo02.firstName = "Magda";
        emplo02.lastName = "Żylańska";
        emplo02.birthday = 1988;
        emplo02.seniority = 2;
        String emplo02Info = emplo02.firstName + " " + emplo02.lastName
                + ", Rok urodzenia: " + emplo02.birthday + ", Staż pracy: " + emplo02.seniority +" lata";

        Employee emplo03 = new Employee();
        emplo03.firstName = "Teresa";
        emplo03.lastName = "Tadla";
        emplo03.birthday = 1977;
        emplo03.seniority = 7;
            String emplo03Info = emplo03.firstName + " " + emplo03.lastName
                + ", Rok urodzenia: " + emplo03.birthday + ", Staż pracy: " + emplo03.seniority +" lat";

        System.out.println("Pracownik: " + emplo01Info);
        System.out.println("Pracownik: " + emplo02Info);
        System.out.println("Pracownik: " + emplo03Info);
        }
}
