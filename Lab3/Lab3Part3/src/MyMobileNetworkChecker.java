public class MyMobileNetworkChecker {
    /**
     * This method throws a custom exception if the string is not the same as your network
     *
     * @param inputNetwork input string with the network name
     **/
    public static void checkMyMobileNetwork(String inputNetwork) throws NotMyNetworkClassException {
        if (inputNetwork.equals("Eir")) {
            System.out.println("That is indeed my network");

        } else {
            throw new NotMyNetworkClassException("That is not my network or you typed something else");
        }

    }

    public static void main(String[] args) {
        try {
            String theNetwork = "Eir";
            String notMyNetwork = "AT&T";

            checkMyMobileNetwork(theNetwork);
            checkMyMobileNetwork(notMyNetwork);

        } catch (NotMyNetworkClassException e) {
            e.printStackTrace();
        }
    }
}
