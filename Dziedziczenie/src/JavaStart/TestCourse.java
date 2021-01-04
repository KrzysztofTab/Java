package JavaStart;

public class TestCourse {
    public static void main(String[] args) {
//        OnlineCourse course = new OnlineCourse("02", "JAVA-ONLINE-123", "kurs javy do samodzielnej nauki"
//                , 1230, 120, 90);
//        course.printInfoOnlineCourse();
        BootcampOnline bottcamp = new BootcampOnline("02", "JAVA-ONLINE-123", "kurs javy do samodzielnej nauki"
                , 1230, 30, 90, "Tomasz Kozłowski", 60);
        bottcamp.printInfoOnlineCourse();
        OfflineCourse offlineCourse = new OfflineCourse("\n05","JAVA OFFLINE",
                "Kursy java prowadzone z instruktorem",1500,"Wrocław",125);
        offlineCourse.printInfoOfflineCourse();
    }
}
