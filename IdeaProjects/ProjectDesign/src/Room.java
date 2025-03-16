import java.util.ArrayList;
import java.util.List;

public class Room implements SmartDevice {
    private String name;
    private List<SmartDevice> devices = new ArrayList<>();

    public Room(String name) {
        this.name = name;
    }

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    @Override
    public void turnOn() {
        System.out.println("Turning ON all devices in " + name);
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    @Override
    public void turnOff() {
        System.out.println("Turning OFF all devices in " + name);
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }

    @Override
    public String getStatus() {
        StringBuilder status = new StringBuilder(name + " room devices:\n");
        for (SmartDevice device : devices) {
            status.append("  - ").append(device.getStatus()).append("\n");
        }
        return status.toString();
    }
}