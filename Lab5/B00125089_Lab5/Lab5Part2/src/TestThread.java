public class TestThread {
    public static void main(String[] args) {

        ThreadWithRunnable testThread = new ThreadWithRunnable();

        for (int loop = 0; loop <= 10; loop++){
            new Thread(testThread).start();
        }

    }
}
