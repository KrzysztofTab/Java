package JavaStart;

public class BootcampOnline extends OnlineCourse {
    private final String teacher;
    private final int consultationHours;

    public BootcampOnline(String id, String title, String description, double price, int videoLength,
                          int timeToFinish, String teacher, int consultationHours) {
        super(id, title, description, price, videoLength, timeToFinish);
        this.teacher = teacher;
        this.consultationHours = consultationHours;
    }

    @Override
    void printInfoOnlineCourse() {
        super.printInfoOnlineCourse();
        System.out.println(teacher + " trener; " + consultationHours + " godzin konsultacji");
    }
}
