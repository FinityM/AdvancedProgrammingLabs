public class WalkieTalkie extends HandHeldDevice {
    public double rangeInKm;

    public WalkieTalkie(String manufacturer, double weight, double rangeInKm) {
        super(manufacturer, weight);
        this.rangeInKm = rangeInKm;
    }

    public double getRangeInKm() {
        return rangeInKm;
    }

    @Override
    public String toString() {
        return "WalkieTalkie{" +
                "manufacturer= " + manufacturer + '\'' +
                ", rangeInKm= " + rangeInKm +
                '}';
    }
}
