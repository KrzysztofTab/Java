package Zadanie14;

public class Playlist {
    private static final int SECONDS_IN_HOURS = 3600;
    private static final int SECONDS_IN_MINUTE = 60;

    public static int playList(Song... songs) {  //  W metodzie sumujemy czasy wszystkich piosenek i je zwracamy.
        int totalTime = 0;
        for (Song song : songs) {
            totalTime += song.getTime();
        }
        return totalTime;
    }

    public static String getFormattedTime(int seconds) {
        int hours = seconds / SECONDS_IN_HOURS;
        seconds %= SECONDS_IN_HOURS;
        int minutes = seconds / SECONDS_IN_MINUTE;
        seconds %= SECONDS_IN_MINUTE;
        String hoursPart = timeToString(hours);
        String minutesPart = timeToString(minutes);
        String secondsPart = timeToString(seconds);
        return hoursPart + ":" + minutesPart + ":" + secondsPart;
    }

    private static String timeToString(int hours) {
        String time;
        if(hours == 0)
            time = "00";
        else if (hours <10)
            time = "0"+hours;
        else
            time = Integer.toString(hours);
        return time;
    }
}
