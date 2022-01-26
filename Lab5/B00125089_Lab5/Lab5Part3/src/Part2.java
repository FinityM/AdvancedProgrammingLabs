/***
 * Class that implements Runnable to loop numbers with threading
 */
public class Part2 implements Runnable {

    public static int[] numbers = {1, 2, 3};

    @Override
    public void run() {
        synchronized (this) {
            for (int theNumbers : numbers) {
                System.out.println(theNumbers);
            }

        }

    }
}
