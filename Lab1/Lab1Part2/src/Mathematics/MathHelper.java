/**
 * 
 */
package Mathematics;

/**
 * @author mcledera
 *
 */
public class MathHelper {

	/**
	 * This method calculates the factorial of a number
	 * @param value to factor the number 
	 * @return int for the value 
	 * 
	 * */
	public static int recursiveFactorial(int value) {
		if (value == 1) {
			return 1;
			
		} else {
			return value * recursiveFactorial(value - 1);
		}
	}

}
