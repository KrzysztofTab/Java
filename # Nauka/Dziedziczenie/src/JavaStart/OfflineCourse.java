package JavaStart;

public class OfflineCourse extends Course {
    private final String city;
    private final int numberOfLessons;

    public OfflineCourse(String id, String title, String description, double price, String city, int numberOfLessons) {
        super(id, title, description, price);
        this.city = city;
        this.numberOfLessons = numberOfLessons;
    }

    void printInfoOfflineCourse() {
        System.out.println(getId() + "- " + getTitle() + "\n" + getDescription() + "\n" + city + "; ilość lekcji\n" +
                getPrice() + "zł");
    }

    public int getNumberOfLessons() {
        return numberOfLessons;
    }
}
