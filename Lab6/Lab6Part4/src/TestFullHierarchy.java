import java.util.Vector;

// Class that contains Vector
public class TestFullHierarchy {
    public static void main(String[] args) {
        // Vector for ElectronicDevice
        Vector<ElectronicDevice> devices = new Vector<>();

        // Some high spec PC
        ElectronicDevice computer = new Computer("ULTRA PC", 4.0, 128, 3840);

        // Another high spec laptop
        ElectronicDevice laptop = new LaptopComputer("XMG Fusion 15", 2.6, 32, 1080, 2.5);

        // A phone
        ElectronicDevice phone = new MobilePhone("Samsung", 0.5, "GoMo");

        // A walkie talkie
        ElectronicDevice walkieTalkie = new WalkieTalkie("Midland 50", 0.3, 57);

        devices.add(computer);
        devices.add(laptop);
        devices.add(phone);
        devices.add(walkieTalkie);

        for (int objects = 0; objects < devices.size(); objects++){
            System.out.println(devices.elementAt(objects).toString());
        }
    }
}
