package Ex02;

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

    @Override
    public String toString() {
        return "'" +homeTeam  + " - " + awayTeam + " ( " + resultHomeTeam + " : " + resultAwayTeam + " )'";
    }
}
