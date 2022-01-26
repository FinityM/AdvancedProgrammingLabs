/**
 * 
 */

/**
 * @author mcledera
 *
 */
public class ExceptionsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Try to print the name converted to a character
		try {
			// Declare a name and purposefully convert to out of bounds of charAt() method
			String s = "Mark";
			char c = s.charAt(5);
			System.out.printf("Name converted to a character: %c", c);

		} catch (StringIndexOutOfBoundsException e) {
			// Catch the exception
			System.out.println("Error has been caught full details bellow: ");
			e.printStackTrace();

		} finally {
			System.out.println("Finally block has been executed, charAt method has more than it can hold for the name \"Mark\"");

		}

	}

}
