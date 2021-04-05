package Misc;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
    String saTest = "test";

    @Test
    public void SoftAssertion() {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals("tests", saTest);
        System.out.println("After Assert Equals");

        softAssert.assertTrue(saTest.equals("tests"));
        System.out.println("After Assert True");
    }
}
