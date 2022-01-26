/***
 * Class that extends Thread and runs the letters
 */
public class Part1 extends Thread {
    public static String[] arrayLetters = {"X", "Y", "Z"};

    public void run() {
        synchronized (this) {
            for (String theLetters : arrayLetters) {
                System.out.println(theLetters);
            }
        }

    }
}
