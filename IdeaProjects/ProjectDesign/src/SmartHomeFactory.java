public interface SmartHomeFactory {
    Light createLight(String name);
    Thermostat createThermostat(String name, double temp);
    Camera createCamera(String name);
}