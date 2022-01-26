public abstract class ElectronicDevice {
    public String manufacturer;

    // Blank constructor
    public ElectronicDevice() {

    }

    public ElectronicDevice(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }


}
