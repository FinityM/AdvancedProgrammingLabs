package com.Cledera.testUtil;
import com.Cledera.utilfolder.StringUtility;

public class TestStringUtility {
    public static void main(String[] args) {
        StringUtility test = new StringUtility();
        System.out.println(test.getSumOfAsciiValues("Mark"));
        System.out.println(test.getProductOfAsciiValues("Mark"));

    }
}
