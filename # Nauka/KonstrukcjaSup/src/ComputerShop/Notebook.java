package ComputerShop;

public class Notebook extends Computer {
    private int batteryCapacity;

    public Notebook(double cpuTemperature, int ramMemory, int batteryCapacity) {
        super(cpuTemperature, ramMemory);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void coolDown() {
        super.coolDown();
        turboCoo();
    }

    private void turboCoo() {
        setCpuTemperature(getCpuTemperature() - 2);
    }
}
