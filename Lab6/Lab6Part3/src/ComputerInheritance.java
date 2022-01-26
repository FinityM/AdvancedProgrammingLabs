/***
 * Class to test Computer and LaptopComputer classes
 */
public class ComputerInheritance {
    public static void main(String[] args) {
        Computer comp1 = new Computer(2.4, 16, 1080);
        Computer comp2 = new Computer(2.13,4,720);
        Computer comp3 = new Computer(4,128,3840);

        Computer lapt1 = new LaptopComputer(2.6,32,1080,3);
        Computer lapt2 = new LaptopComputer(2.3, 64,1080,2);
        Computer lapt3 = new LaptopComputer(3,24,2560,2);

        System.out.println("Random Computer... " + comp1.toString() + "\n");
        System.out.println("Random computer... " + comp2.toString() + "\n");
        System.out.println("Random computer... " + comp3.toString() + "\n");

        System.out.println("XMG Fusion 15 " + lapt1.toString()+ "\n");
        System.out.println("Razer Blade Pro 17 " + lapt2.toString() + "\n");
        System.out.println("Asus ROG Zephyrus G14 " + lapt3.toString() + "\n");
    }
}
