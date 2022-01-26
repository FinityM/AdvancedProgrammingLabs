public class ThreadWithRunnable implements Runnable{
    public static int[] numbers = {1,2,3};

    public void run() {
        for (int theNumbers : numbers){
            System.out.println(theNumbers);
        }
    }
}
