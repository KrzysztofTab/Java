package Cwiczenie;

public class Controller {
    void openWindows(Building building) {
        building.firstRoom.window.open = true;
        building.secondRoom.window.open = true;
    }

    void closeWindows(Building building) {
        building.firstRoom.window.open = false;
        building.secondRoom.window.open = false;
    }

    void openDoors(Building building) {
        building.firstRoom.door.open = true;
        building.secondRoom.door.open = true;
    }

    void closeDoors(Building building) {
        building.firstRoom.door.open = false;
        building.secondRoom.door.open = false;
    }
}
