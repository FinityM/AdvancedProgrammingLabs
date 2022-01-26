/**
 * LaptopComputer class inheriting from Computer class
 */
public class LaptopComputer extends Computer {
    private double batteryLife;

    public LaptopComputer(double processorSpeed, double memory, double screenSize, double batteryLife){
        super(processorSpeed, memory, screenSize);
        this.batteryLife = batteryLife;
    }

    // String for the laptop using Computer super class
    public String toString() {
        return "Laptop Specs: \n" +
                "Memory: " + super.getMemory() + "\n" +
                "Processor Speed: "+ super.getProcessorSpeed() + "\n" +
                "Screen Size: " + super.getScreenSize()  + "\n" +
                "Battery Life: " + batteryLife + " hours average";
    }
}
