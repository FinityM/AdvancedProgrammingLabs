/**
 * Class to test the abstract computer class
 * @author mcledera
 *
 */
public class ComputerTest {
    public static void main(String[] args) {
        Computer com1 = new Computer(32,3.6,1080);
        Computer com2 = new Computer(8,2.4,720);
        Computer com3 = new Computer(64,4,3840);

        /**
        // Setting com1
        com1.setMemory(32);
        com1.setProcessorSpeed(3.6);
        com1.setScreenSize(1080);

        // Setting com2
        com2.setMemory(8);
        com2.setProcessorSpeed(2.4);
        com2.setScreenSize(720);

        // Setting com3
        com3.setMemory(64);
        com3.setProcessorSpeed(4);
        com3.setScreenSize(3840);
        */
        // Print Statements for set computers

        System.out.println(com1);
        System.out.println(com2.toString());
        System.out.println(com3.toString());


    }
}
