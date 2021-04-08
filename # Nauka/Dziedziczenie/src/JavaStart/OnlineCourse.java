package JavaStart;

public class OnlineCourse extends Course{
    private final int videoLength;
    private final int timeToFinish;

    public OnlineCourse(String id, String title, String description, double price, int videoLength, int timeToFinish) {
        super(id, title, description, price);
        this.videoLength = videoLength;
        this.timeToFinish = timeToFinish;
    }
    void printInfoOnlineCourse() {
        System.out.println(getId()+"- "+getTitle()+"\n"+getDescription()+"\n"+videoLength+"min\n"+
                timeToFinish+"min\n"+getPrice()+"zł");
    }
}
