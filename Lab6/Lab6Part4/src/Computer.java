/**
 * @author mcledera
 * Abstract class of computer, not literally using the abstract keyword
 * Has get methods
 */
public class Computer extends ElectronicDevice {
    public double processorSpeed;
    public double memory;
    public double screenSize;

    // Empty constructor
    public Computer() {

    }

    public Computer(String manufacturer, double processorSpeed, double memory, double screenSize) {
        super(manufacturer);
        this.manufacturer = manufacturer;
        this.processorSpeed = processorSpeed;
        this.memory = memory;
        this.screenSize = screenSize;
    }

    public double getProcessorSpeed() {
        return processorSpeed;
    }

    public double getMemory() {
        return memory;
    }

    public double getScreenSize() {
        return screenSize;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "processorSpeed= " + processorSpeed +
                ", memory= " + memory +
                ", screenSize= " + screenSize +
                ", manufacturer= " + manufacturer + '\'' +
                '}';
    }
}
