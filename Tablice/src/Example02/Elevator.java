package Example02;

class Elevator {
    private Person[] people = new Person[4];
    private int peopleNumber = 0;
    private final int maxWeight = 400;

    void add(Person person) {
        if (peopleNumber < 4) {
            people[peopleNumber] = person;
            peopleNumber++;
        } else {
            System.out.println("W windzie nie ma już miejsca, proszę poczekać");
        }
    }

    void start() {
        if (weightIsCorrect()) {
            System.out.println("Winda wystartowała");
        } else {
            int overload = getTotalWeight() - maxWeight;
            System.out.println("Winda jest przeciążona o " + overload + "kg");
        }
    }

    private boolean weightIsCorrect() {
        return getTotalWeight() <= maxWeight;
    }

    private int getTotalWeight() {
        int totalWeight = 0;
        if (people[0] != null)
            totalWeight += people[0].getWeight();
        if (people[1] != null)
            totalWeight += people[1].getWeight();
        if (people[2] != null)
            totalWeight += people[2].getWeight();
        if (people[3] != null)
            totalWeight += people[3].getWeight();
        return totalWeight;
    }

    void clear() {
        people[0] = null;
        people[1] = null;
        people[2] = null;
        people[3] = null;
        peopleNumber = 0;
        System.out.println("Winda jest pusta");
    }
}