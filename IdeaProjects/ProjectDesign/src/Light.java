public class Light implements SmartDevice {
    private String name;
    private boolean isOn;

    public Light(String name) {
        this.name = name;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(name + " light is ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(name + " light is OFF.");
    }

    @Override
    public String getStatus() {
        return name + " light is " + (isOn ? "ON" : "OFF");
    }
}