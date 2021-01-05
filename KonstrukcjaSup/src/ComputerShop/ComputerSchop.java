package ComputerShop;

public class ComputerSchop {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(40, 1024, 10000);
        System.out.println(notebook.getRamMemory() + "\n" + notebook.getCpuTemperature() +
                "\n" + notebook.getBatteryCapacity());
    }
}

