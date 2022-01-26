public class TestThread {

    public static void main(String[] args) {

        for (int loop = 0; loop <= 10; loop++) {
            new ThreadWithExtends().start();

        }
    }
}
