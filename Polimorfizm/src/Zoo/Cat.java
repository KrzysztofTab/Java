package Zoo;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void givSound() {
        System.out.println("Jestem kotem i nazywam się: " + getName());
    }

    public void meow() {
        System.out.println("Miaaaau");
    }
}
