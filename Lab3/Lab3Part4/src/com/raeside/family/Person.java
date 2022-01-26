/**
 * A Person class to represent a human
 * Only contains basic information like first name and last name
 *
 * @author LukeRaeside
 */
package com.raeside.family;

public class Person {

    private String firstName;
    private String familyName;

    Person(String firstName, String familyName) {
        this.firstName = firstName;
        this.familyName = familyName;

    }

    /**
     * Returns the first name of the Person
     *
     * @return String The first name of the person
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Returns the second name of the person
     *
     * @return String the family name of the person
     */
    public String getFamilyName() {
        return familyName;
    }

}
