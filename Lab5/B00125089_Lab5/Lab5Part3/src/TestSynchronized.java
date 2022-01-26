/***
 * Class to test the synchronized classes in the Part1 class and Part2 class
 *
 */
public class TestSynchronized {

    /***
     * Main method to test the Synchronized Threads
     * @param args takes in arguments
     */
    public static void main(String[] args) {

        Part2 threadSync = new Part2();

        for (int loop = 0; loop <= 10; loop++) {
            new Part1().start();

        }
        for (int loop2 = 0; loop2 <= 10; loop2++){
            new Thread(threadSync).start();
        }

    }
}
