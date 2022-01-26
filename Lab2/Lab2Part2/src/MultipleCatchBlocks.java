/**
 * 
 */

/**
 * @author mcyru
 *
 */
public class MultipleCatchBlocks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// For the Array out of bounds
			/*
			int[] theArray = { 1, 2, 3, 4 };
			System.out.println(theArray[4]);
			*/

			// For arithmetic exception
			int wrongMaths = 1 / 0;
			System.out.println(wrongMaths);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("You are attempting to reach out of bounds for the array");
			System.out.println("Some details about the error:");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("Your maths is wrong why are you even trying?");
			System.out.println("Some details about the error:");
			e.printStackTrace();

		} catch (Exception e){
			e.printStackTrace();
		}finally {
			// TODO: handle finally clause
		}

	}

}
