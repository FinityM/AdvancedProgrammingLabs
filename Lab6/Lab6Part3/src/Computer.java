/***
 * Abstract class of the Computer class, not literally using the keyword abstract
 * @author mcledera
 */
public class Computer {
    private double processorSpeed;
    private double memory;
    private double screenSize;

    public Computer(){
        // For defaults
    }

    public Computer(double processorSpeed, double memory, double screenSize) {
        this.processorSpeed = processorSpeed;
        this.memory = memory;
        this.screenSize = screenSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public void setProcessorSpeed(double processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processorSpeed = " + processorSpeed +
                ", memory = " + memory +
                ", screenSize = " + screenSize +
                '}';
    }
}
