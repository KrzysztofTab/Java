package Ex02;

import java.util.Locale;

public class MatchResult {
    private final String homeTeam;
    private final String awayTeam;
    private final int resultHomeTeam;
    private final int resultAwayTeam;

    public MatchResult(String homeTeam, String awayTeam, int resultHomeTeam, int resultAwayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.resultHomeTeam = resultHomeTeam;
        this.resultAwayTeam = resultAwayTeam;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public int getResultHomeTeam() {
        return resultHomeTeam;
    }

    public int getResultAwayTeam() {
        return resultAwayTeam;
    }

    // dodana metoda
    int getGoalDifference() {
        return resultHomeTeam - resultAwayTeam;
    }

    // dodana metoda
    boolean containsTeam(String contry) {
        return homeTeam.toLowerCase(Locale.ROOT).equals(contry) || awayTeam.toLowerCase(Locale.ROOT).equals(contry);
    }

    // dodana metoda
    String[] getTeamNames() {
        return new String[]{homeTeam, awayTeam};
    }

    // dodana metoda
    int getGolsSum(){
        return resultHomeTeam + resultAwayTeam;
    }
    @Override
    public String toString() {
        return "'" + homeTeam + " - " + awayTeam + " ( " + resultHomeTeam + " : " + resultAwayTeam + " )'";
    }
}
