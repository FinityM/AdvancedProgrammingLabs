public class MobilePhone extends HandHeldDevice {
    public String networkName;

    public MobilePhone(String manufacturer, double weight, String networkName) {
        super(manufacturer, weight);
        this.networkName = networkName;
    }

    public String getNetworkName() {
        return networkName;
    }

    @Override
    public String toString() {
        return "MobilePhone{" +
                "manufacturer= " + manufacturer + '\'' +
                ", networkName= " + networkName + '\'' +
                '}';
    }
}
