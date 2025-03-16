import java.util.ArrayList;
import java.util.List;

public class SmartHomeController {
    private List<SmartDevice> devices = new ArrayList<>();

    public void addDevice(SmartDevice device) {
        devices.add(device);
    }

    public void turnAllOn() {
        System.out.println("Turning on all smart home devices...");
        for (SmartDevice device : devices) {
            device.turnOn();
        }
    }

    public void turnAllOff() {
        System.out.println("Turning off all smart home devices...");
        for (SmartDevice device : devices) {
            device.turnOff();
        }
    }

    public void getSystemStatus() {
        System.out.println("Smart Home System Status:");
        for (SmartDevice device : devices) {
            System.out.println(device.getStatus());
        }
    }
}
