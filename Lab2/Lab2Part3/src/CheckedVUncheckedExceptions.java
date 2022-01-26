import java.io.File;
import java.io.IOException;

/**
 * 
 */

/**
 * @author mcyru
 *
 */
public class CheckedVUncheckedExceptions {

	public static String capitalizeString(String theString) throws NullPointerException {

		// Attempt to convert to all caps
		theString.toUpperCase();

		// Throw the NullPointer
		throw new NullPointerException(theString);

	}

	public static String openFile(String fileName) throws IOException {
		File file = new File(fileName);
		System.out.println("Does it exist?: ");
		file.exists();
		throw new IOException();
		

	}

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** Small notes: Throw and throws don't need try and catch the exception does
		 *  IOException is a checked exception so it needs a try and catch this is because it is prone to errors
		 * 
		 * */
		
		// Method commented out to test other method, it does work 
		//String tryString = "tafdadsfd";
		//capitalizeString(tryString);
		
		try {
			String fileVoid = "fileVoid.txt";
			openFile(fileVoid);

		} catch (IOException e) {
			// TODO: handle exception for the method with a throw exception
			System.out.println("This method needs a catch, details of error is shown below as well: ");
			e.printStackTrace();
		}

	}

}
