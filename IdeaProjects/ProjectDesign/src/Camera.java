public class Camera implements SmartDevice {
    private String name;
    private boolean isRecording;

    public Camera(String name) {
        this.name = name;
        this.isRecording = false;
    }

    @Override
    public void turnOn() {
        isRecording = true;
        System.out.println(name + " camera is now RECORDING.");
    }

    @Override
    public void turnOff() {
        isRecording = false;
        System.out.println(name + " camera is now OFF.");
    }

    @Override
    public String getStatus() {
        return name + " camera is " + (isRecording ? "RECORDING" : "OFF");
    }
}

