package Ex01;

public class TesterGen {
    public static void main(String[] args) {
        ContainerGen<Integer> containerGen = new ContainerGen<>();
        containerGen.setArray(new Integer[]{5, 10, 20});
        containerGen.printArray();
        Integer[] array = containerGen.getArray();
        System.out.println("Dodawanie zawartości tablicy = "+(array[0] + array[1] + array[2]));

        ContainerGen<String> containerGen1 = new ContainerGen<>();
        containerGen1.setArray(new String[]{"\n5", "dziesieć", "dwa 0"});
        containerGen1.printArray();
    }
}
