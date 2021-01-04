public class TestNotebook {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(40, 1024, 1000);
        notebook.coolDown();
        System.out.println(notebook.getRamMemory() + "\n" + notebook.getCpuTemperature() +
                "\n" + notebook.getBatteryCapacity());
    }
}
