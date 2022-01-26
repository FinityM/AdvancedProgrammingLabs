/**
 * The family class allows members to be kept and added
 * Also provides checking methods
 * Depends on Person class
 *
 * @author LukeRaeside
 */
package com.raeside.family;


import com.raeside.family.exceptions.FirstNameExistsException;
import com.raeside.family.exceptions.SurnameMismatchException;

import java.util.Vector;

public class Family {

    private Vector familyMembers = new Vector();
    private String familyName;

    /**
     * Family must have a family name
     *
     * @param familyName The name of the family
     *
     */
    public Family(String familyName) {
        this.familyName = familyName;
    }

    /**
     * This allows a family member add to the current family
     *
     * @param member The type Person to be added to the family, requires Person type
     * @throws FirstNameExistsException If the first name repeats an exception is thrown
     * @throws SurnameMismatchException If the surname is not the same an exception is thrown
     */
    public void addFamilyMember(Person member) throws FirstNameExistsException, SurnameMismatchException {

        if (correctFamilyName(member.getFamilyName()) == false) {
            // Figure out how to stop adding the name with a wrong surname (Update: it was just the sequencing....)
            throw new SurnameMismatchException("You must have surname Robinson to join this family");
        }

        if (newFirstName(member.getFirstName())) {
            familyMembers.addElement(member);
        } else {
            throw new FirstNameExistsException("This family already has a " + member.getFirstName());
        }

    }

    /**
     * Return the full list of family members in an array
     *
     * @return The string array with the list of family members
     *
     */
    public String[] getFamilyMembers() {

        String[] names = new String[familyMembers.size()];

        for (int i = 0; i < familyMembers.size(); i++) {
            names[i] = ((Person) familyMembers.elementAt(i)).getFirstName() + " " + ((Person) familyMembers.elementAt(i)).getFamilyName();
        }
        return names;
    }

    /**
     * This method checks if the first name being added is new
     *
     * @param firstName The first name being added to the family
     * @return Returns true if the name is a unique new name, false if not new
     *
     */
    public boolean newFirstName(String firstName) {

        for (int i = 0; i < familyMembers.size(); i++) {
            if (((Person) familyMembers.elementAt(i)).getFirstName().equals(firstName)) {
                return false; //name is not new to the family
            }
        }
        return true; //the name was not found
    }

    /**
     * this method checks that the surname passed matches the family
     * @param familyName The family name being passed is checked against the family name
     * @return Returns true f the family name passed matches this family
     *
     */
    public boolean correctFamilyName(String familyName) {

        if (familyName.equals(this.familyName)) {
            return true; //family name is correct
        }
        return false; //person's family name doesnot match

    }
}
