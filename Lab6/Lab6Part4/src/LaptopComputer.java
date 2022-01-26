public class LaptopComputer extends Computer {
    public double batteryLife;

    public LaptopComputer(String manufacturer, double processorSpeed, double memory, double screenSize, double batteryLife) {
        super(manufacturer, processorSpeed, memory, screenSize);
        this.batteryLife = batteryLife;
    }


    @Override
    public String toString() {
        return "LaptopComputer{" +
                "processorSpeed= " + processorSpeed +
                ", memory= " + memory +
                ", screenSize= " + screenSize +
                ", manufacturer= '" + manufacturer + '\'' +
                ", batteryLife= " + batteryLife +
                '}';
    }
}
