package Zoo;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void givSound() {
        System.out.println("jestem psem i nazywam sie: " + getName());
    }

    public void bark() {
        System.out.println("Hau hau!");
    }
}
