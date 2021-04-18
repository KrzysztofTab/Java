package Zadanie14.ExDuration;

import Zadanie14.Song;

import java.time.Duration;

public class Playlist00 {

    public static int playList(Song... songs) {  //  W metodzie sumujemy czasy wszystkich piosenek i je zwracamy.
        int totalTime = 0;
        for (Song song : songs) {
            totalTime += song.getTime();
        }
        return totalTime;
    }

    public static String getFormattedTime(int seconds) {
            // Metody toHoursPart, toMinutesPart i toSecondsPart zostały dodane do klasy Duration w Javie 9
            // i zwracają liczbę godzin, minut lub sekund w danym fragmencie czasu - pod spodem wykorzystują
            // operator modulo ( % ), który wcześniej zapisywaliśmy ręcznie.
        Duration duration = Duration.ofSeconds(seconds);
        int hours = duration.toHoursPart();
        int minutes = duration.toMinutesPart();
        seconds = duration.toSecondsPart();
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
