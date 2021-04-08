package Cwiczenie;

public class BuildingTest {
    public static void main(String[] args) {
        Door door1 = new Door(true, 80, 220);
        Window window1 = new Window(false, 120, 120);

        Door door2 = new Door(true, 80, 220);
        Window window2 = new Window(false, 180, 120);

        Room room1 = new Room(door1, window1);
        Room room2 = new Room(door2, window2);

        Building building = new Building(room1, room2);

        Controller controller = new Controller();
        controller.openWindows(building);
        controller.closeDoors(building);
    }
}
