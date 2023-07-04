package spring_introduction;

public class ProfilingController implements ProfilingControllerMBean {
    private boolean isActive;

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        this.isActive = active;
    }

    @Override
    public void switchState(boolean active) {
        this.isActive = active;
    }
}
