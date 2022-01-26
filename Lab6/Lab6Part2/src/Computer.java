/**
 * @author mcledera
 * Abstraction class of computer, not literally using the abstract keyword
 * Set methods are redundant because the toString and the constructor can set the
 * variables for the Computer
 */
public class Computer {
    double processorSpeed;
    double memory;
    double screenSize;

    public Computer(){
        // For defaults
    }

    public Computer(double processorSpeed, double memory, double screenSize) {
        this.processorSpeed = processorSpeed;
        this.memory = memory;
        this.screenSize = screenSize;
    }

    // Get and Set Methods useless.
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
