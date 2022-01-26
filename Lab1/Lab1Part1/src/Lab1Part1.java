/**
 * 
 */

/**
 * @author mcledera
 *
 */
public class Lab1Part1 {

	/**
	 * @param args to execute main method
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(recursiveSummation(10));

	}
	
	/**
	 * This method calculates the summation
	 * @param value to summate the value
	 * @return int for the answer 
	 * 
	 * */
	
	public static int recursiveSummation(int value) {
		if (value == 1) {
			return 1;
		} else {
			return value + recursiveSummation(value - 1);
		}
	}

}
