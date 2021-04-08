package Ex02;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Gameplay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n>>>>>");
        System.out.println(" MIĘDZYNARODOWE MECZE tOWARZYSKIE ");
        Stream<MatchResult> result = createStream();

        System.out.println(" \n>>>>>");
        result = createStream();
        System.out.println("Liczba drużyn biorących udział w rozgrywkach: " + countTeams(result));
        result = createStream();
        nameTeams(result);

        System.out.println(" \n>>>>>");
        // System.out.println("Polska, Irlandia, Brazylia, Francja, Argentyna, Anglia, Niemcy, Portugalia, Włochy");
        System.out.println("Rozegrane mecze drużyny (wpisz drużynę):");
        String contry = sc.nextLine();
        result = createStream();
        getResultWith(result, contry).forEach(System.out::println);
        sc.close();

        System.out.println(" \n>>>>>");
        result = createStream();
        System.out.println("Lączna liczba goli: " + numberOFGoals(result));

        System.out.println(" \n>>>>>");
        result = createStream();
        System.out.println("Wszystkie mecze");
        printAllResults(result);
    }


    private static void nameTeams(Stream<MatchResult> result) {
        result
                .map(MatchResult::getTeamNames)
                .flatMap(Arrays::stream)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }

    private static int numberOFGoals(Stream<MatchResult> result) {
        return result
                .mapToInt(MatchResult::getGolsSum)  // IntStrea
                .sum();
    }

    private static long countTeams(Stream<MatchResult> result) {
        //1 Polska - Irlandaia (2:0) -> Irlandia - Francja (0:3)
        //2 [Polska , Irlandaia] -> [Irlandia - Francja]
        //3 Polska -> Irlandaia -> Irlandia -> Francja
        //4 Polska -> Irlandaia -> Francja
        return result   // 1
                .map(MatchResult::getTeamNames)     // 2
                .flatMap(Arrays::stream)        // 3
                .distinct()                     // 4
                .count();                       //zwraca liczbę obiektów
    }

    private static List<MatchResult> getResultWith(Stream<MatchResult> result, String contry) {
        return result
                .filter(matchResult -> matchResult.containsTeam(contry.toLowerCase(Locale.ROOT)))
                .collect(Collectors.toList());
    }

    private static void printAllResults(Stream<MatchResult> result) {
//        result.sorted((result1, result2) -> Integer.compare(result2.getGoalDifference(), result1.getGoalDifference()))
//        to samo co wyzej + "reversed" - odwraca działenie
        result.sorted(Comparator.comparing(MatchResult::getGoalDifference).reversed())
                .forEach(System.out::println);
    }

    private static Stream<MatchResult> createStream() {
        return Stream.of(
                new MatchResult("Polska", "Irlandia", 2, 0),
                new MatchResult("Brazylia", "Francja", 0, 3),
                new MatchResult("Włochy", "Polska", 2, 1),
                new MatchResult("Brazylia", "Argentyna", 2, 2),
                new MatchResult("Anglia", "Niemcy", 1, 2),
                new MatchResult("Anglia", "Francja", 3, 0),
                new MatchResult("Polska", "Portugalia", 1, 0),
                new MatchResult("Brazylia", "Niemcy", 3, 3)
        );
    }
}