/***
 * @author mcledera
 * @use to calculate the ascii sum or product of a string
 */
package com.Cledera.utilfolder;

public class StringUtility {

    /***
     * This method finds the ascii sum of the string you put in
     * @param string the string you want to find the ascii sum of
     * @return the ascii sum of the string you put in
     */
    public static int getSumOfAsciiValues(String string)
    {
        int sum = 0;
        for (int theString = 0; theString < string.length(); theString++) {
            sum += string.charAt(theString);
        }
        return sum;
    }

    /***
     * This method finds the ascii product of the string you put in
     * @param string the string you want to find the ascii product of
     * @return the ascii product of the string you put in
     */
    public static int getProductOfAsciiValues(String string){
        int product = 1;
        for (int theString = 0; theString < string.length(); theString++){
            product *= string.charAt(theString);
        }
        return product;
    }
}
