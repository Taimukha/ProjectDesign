public class LoggingDecorator implements SmartDevice {
    private final SmartDevice device;

    public LoggingDecorator(SmartDevice device) {
        this.device = device;
    }

    @Override
    public void turnOn() {
        System.out.println("Logging: Turning ON " + device.getStatus());
        device.turnOn();
    }

    @Override
    public void turnOff() {
        System.out.println("Logging: Turning OFF " + device.getStatus());
        device.turnOff();
    }

    @Override
    public String getStatus() {
        return device.getStatus();
    }
}