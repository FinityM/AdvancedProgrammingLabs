/**
 * This class tests the Family hierarchy and Custom Exceptions
 *
 * @author LukeRaeside
 */
package com.raeside.family;

import com.raeside.family.exceptions.FirstNameExistsException;
import com.raeside.family.exceptions.SurnameMismatchException;

public class MakeFamilyRobinson {

    public static void main(String[] args) {

        //Create family members
        //*Test surname exception by creating wrong surnames*
        Person member1 = new Person("John", "Robinson");
        Person member2 = new Person("Paul", "Robinson");
        Person member3 = new Person("Peter", "Robinson");
        Person member4 = new Person("Missy", "Robinson");
        Person member5 = new Person("John", "Robinson");
        Person member6 = new Person("Laura", "Robinson");
        Person member7 = new Person("Dwayne", "Johnson");


        Family robinsons = new Family("Robinson");

        //Try to add to family, catch for exiting firstname
        //*Add surname catch here*
        try {
            robinsons.addFamilyMember(member1);
            robinsons.addFamilyMember(member2);
            robinsons.addFamilyMember(member3);
            robinsons.addFamilyMember(member4);

            // Remove comment to test if it works
            robinsons.addFamilyMember(member5);
             //robinsons.addFamilyMember(member6);
             //robinsons.addFamilyMember(member7);

        } catch (FirstNameExistsException ex) {
            ex.printStackTrace();
        } catch (SurnameMismatchException e) {
            e.printStackTrace();
        }

        String[] familyList = robinsons.getFamilyMembers();

        for (int i = 0; i < familyList.length; i++) {
            System.out.println(familyList[i]);
        }

    }

}
