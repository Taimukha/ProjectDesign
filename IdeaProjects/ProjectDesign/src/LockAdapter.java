public class LockAdapter implements SmartDevice {
    private LegacyLockSystem legacyLock;
    private boolean isLocked;

    public LockAdapter(LegacyLockSystem legacyLock) {
        this.legacyLock = legacyLock;
        this.isLocked = legacyLock.isLocked();
    }

    @Override
    public void turnOn() {
        legacyLock.unlockDoor();
        isLocked = false;
    }

    @Override
    public void turnOff() {
        legacyLock.lockDoor();
        isLocked = true;
    }

    @Override
    public String getStatus() {
        return "Smart Lock is " + (isLocked ? "LOCKED" : "UNLOCKED");
    }
}