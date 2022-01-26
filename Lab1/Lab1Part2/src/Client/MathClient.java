/**
 * 
 */
package Client;
import Mathematics.MathHelper;

/**
 * @author mcledera
 *
 */
public class MathClient extends MathHelper {

	/**
	 * @params args for executing methods
	 * 
	 */
	
	public static void main(String[] args) {
		
		System.out.println(MathHelper.recursiveFactorial(5));
		System.out.println(MathHelper.recursiveFactorial(6));
		System.out.println(MathHelper.recursiveFactorial(7));

	}

}
