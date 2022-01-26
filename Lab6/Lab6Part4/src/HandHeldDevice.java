public abstract class HandHeldDevice extends ElectronicDevice {
    private double weight;

    public HandHeldDevice() {
        //Empty constructor
    }

    public HandHeldDevice(String manufacturer, double weight) {
        super(manufacturer);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

}
