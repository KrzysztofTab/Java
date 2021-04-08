package Ex01;

public class Container {
    private Object[] array;

    public Object[] getArray() {
        return array;
    }

    public void setArray(Object[] array) {
        this.array = array;
    }

    public void printArray() {
        for (Object o : array) {
            System.out.println(o);;
        }
    }
}
