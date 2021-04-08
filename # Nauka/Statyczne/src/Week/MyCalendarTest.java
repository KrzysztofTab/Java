package Week;

public class MyCalendarTest {
    public static void main(String[] args) {

//        do wykorzystania składowych statycznych nie potrzebujesz instancji klasy
//        możesz się do tych pól odwoływać bezpośrednio przez konstrukcję
        System.out.println("Tydzień ma " + MyCalendar.WEEK_DATS);
        System.out.println("Rok ma " + MyCalendar.YEAR_DAYS);
    }
}