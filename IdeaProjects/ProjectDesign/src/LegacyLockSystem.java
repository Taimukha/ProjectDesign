public class LegacyLockSystem {
    private boolean locked = true;

    public void unlockDoor() {
        locked = false;
        System.out.println("Legacy Lock: Door is unlocked.");
    }

    public void lockDoor() {
        locked = true;
        System.out.println("Legacy Lock: Door is locked.");
    }

    public boolean isLocked() {
        return locked;
    }
}