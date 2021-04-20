package Zadanie16.Exam;

public class Ex03 {
     public static void main(String[] args) {
        String s1 = new String("witaj"); // s1 to kopia "witaj"
        String s2 = "do widzenia";
        String s3 = "Wszystkiego Najlepszego";
        String s4 = "wszystkiego najlepszego";

        System.out.printf("s1 = %s \ns2 = %s \ns3 = %s \ns4 = %s ", s1, s2, s3, s4);

            // Test równości
        if (s1.equals("witaj")) {   // Prawda
            System.out.println("\ns1 jest równe 'witaj'");
        } else {
            System.out.println("s1 nie jest równe 'witaj'");
        }

            // Test równości za pomocą ==
        if (s1.equals("witaj")) {           // Fałsz; to nie jest ten sam obiekt
            System.out.println("s1 to ten sam obiekt co 'witaj'");
        } else {
            System.out.println("\ns1 to nie ten sam obiekt co 'witaj'");
        }

                // Test równości (ignorowanie wielkości liter)
         if (s3.equalsIgnoreCase(s4)) {  // Prawda
             System.out.printf("%s jest równe %s po zignorowaniu wielkości liter ", s3, s4);
         } else {
             System.out.println("s3 nie jest równe s4");
         }
            // Test compareTo
        System.out.printf("\ns1.compareTo(s2) jest %d", s1.compareTo(s2));
        System.out.printf("\ns2.compareTo(s1) jest %d", s2.compareTo(s1));
        System.out.printf("\ns1.compareTo(s1) jest %d", s1.compareTo(s1));
        System.out.printf("\ns3.compareTo(s4) jest %d", s3.compareTo(s4));
        System.out.printf("\ns4.compareTo(s3) jest %d", s4.compareTo(s3));

            // Test regionMatches (uwzględnianie wielkość liter)
        if (s3.regionMatches(0, s4, 0, 5)) {
            System.out.println("Pierwsze 5 znaków s3 i s4 jest sobie równe");
        } else {
            System.out.println("\nPierwsze 5 znaków s3 i s4 nie jest sobie równe");
        }
            // Test regionMatches (ignorowanie wielkości liter)
        if (s3.regionMatches(true, 0, s4, 0, 5)) {
            System.out.println("Pierwsze 5 znaków s3 i s4 jest sobie równe po zignorowaniu wielkości liter");
        } else {
            System.out.println("Pierwsze 5 znaków s3 i s4 nie jest sobie równe po zignorowaniu wielkości liter");
        }
    }
}
