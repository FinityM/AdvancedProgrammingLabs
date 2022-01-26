public class ThreadWithExtends extends Thread {

    public static String[] arrayLetters = {"X", "Y", "Z"};

    public void run() {
        for (String theLetters : arrayLetters) {
            System.out.println(theLetters);
        }
    }
}

