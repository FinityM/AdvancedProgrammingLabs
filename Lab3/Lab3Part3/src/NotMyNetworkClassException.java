/**
 * An custom exception that checks if my mobile network is correct
 *
 * @author mcyru
 */
public class NotMyNetworkClassException extends Exception {
    public NotMyNetworkClassException(String notMyNetwork) {
        super(notMyNetwork);
    }
}
