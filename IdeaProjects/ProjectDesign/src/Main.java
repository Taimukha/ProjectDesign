public class Main {
    public static void main(String[] args) {

        SmartHomeFactory factory = new BasicSmartHomeFactory();

        SmartHomeController controller = new SmartHomeController();


        Room livingRoom = new Room("Living Room");


        Light livingRoomLight = factory.createLight("Living Room");
        Thermostat homeThermostat = factory.createThermostat("Home", 22.5);
        Camera securityCamera = factory.createCamera("Security");


        LegacyLockSystem oldLock = new LegacyLockSystem();
        SmartDevice smartLock = new LockAdapter(oldLock);


        SmartDevice loggedLight = new LoggingDecorator(livingRoomLight);
        SmartDevice loggedThermostat = new LoggingDecorator(homeThermostat);
        SmartDevice loggedCamera = new LoggingDecorator(securityCamera);
        SmartDevice loggedLock = new LoggingDecorator(smartLock);


        livingRoom.addDevice(loggedLight);
        livingRoom.addDevice(loggedThermostat);
        livingRoom.addDevice(loggedCamera);
        livingRoom.addDevice(loggedLock);


        controller.addDevice(livingRoom);


        controller.turnAllOn();


        controller.getSystemStatus();


        controller.turnAllOff();
    }
}