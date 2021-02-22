//package Example01;
//
//public class ReadWrite {
//    import java.io.*;
//import java.util.Scanner;
//
//    class CompanyApp {
//
//        private static final String FILE_NAME = "employees.info";
//        private static final int READ_FROM_USER = 1;
//        private static final int READ_FROM_FILE = 2;
//
//        private static Scanner scanner = new Scanner(System.in);
//
//        public static void main(String[] args) {
//            System.out.println("Wprowadzanie danych pracowników - " + READ_FROM_USER);
//            System.out.println("Wczytaj i wyświetl dane z pliku - " + READ_FROM_FILE);
//
//            int option = scanner.nextInt();
//            scanner.nextLine();
//            if (option == READ_FROM_USER) {
//                Company company = createCompany();
//                writeFile(company);
//            } else if (option == READ_FROM_FILE) {
//                try {
//                    Company company = readFile();
//                    System.out.println(company);
//                } catch (IOException | ClassNotFoundException e) {
//                    System.err.println("Błąd odczytu danych");
//                }
//            }
//            scanner.close();
//        }
//
//        private static Company readFile() throws IOException, ClassNotFoundException {
//            try(
//                    var fis = new FileInputStream(FILE_NAME);
//                    var ois = new ObjectInputStream(fis);
//            ) {
//                return (Company) ois.readObject();
//            }
//        }
//
//        private static void writeFile(Company company) {
//            try(
//                    var fis = new FileOutputStream(FILE_NAME);
//                    var oos = new ObjectOutputStream(fis);
//            ) {
//                oos.writeObject(company);
//                System.out.println("Zapisano dane do pliku");
//            } catch (IOException e) {
//                System.err.println("Błąd zapisu pliku");
//            }
//
//        }
//
//        private static Company createCompany() {
//            Company company = new Company();
//            for (int i = 0; i < Company.MAX_EMPLOYEES; i++) {
//                System.out.println("Wprowadź imię:");
//                String firstName = scanner.nextLine();
//                System.out.println("Wprowadź nazwisko:");
//                String lastName = scanner.nextLine();
//                System.out.println("Wprowadź wypłatę:");
//                double salary = scanner.nextDouble();
//                scanner.nextLine();
//                company.add(new Employee(firstName, lastName, salary));
//            }
//            return company;
//        }
//
//    }
//}
