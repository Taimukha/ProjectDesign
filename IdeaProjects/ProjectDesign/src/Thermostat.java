public class Thermostat implements SmartDevice {
    private String name;
    private double temperature;

    public Thermostat(String name, double initialTemp) {
        this.name = name;
        this.temperature = initialTemp;
    }

    @Override
    public void turnOn() {
        System.out.println(name + " thermostat is now ACTIVE.");
    }

    @Override
    public void turnOff() {
        System.out.println(name + " thermostat is now OFF.");
    }

    public void setTemperature(double temp) {
        this.temperature = temp;
        System.out.println(name + " thermostat set to " + temp + "°C.");
    }

    @Override
    public String getStatus() {
        return name + " thermostat is at " + temperature + "°C.";
    }
}
