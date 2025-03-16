public class BasicSmartHomeFactory implements SmartHomeFactory {
    @Override
    public Light createLight(String name) {
        return new Light(name);
    }

    @Override
    public Thermostat createThermostat(String name, double temp) {
        return new Thermostat(name, temp);
    }

    @Override
    public Camera createCamera(String name) {
        return new Camera(name);
    }
}