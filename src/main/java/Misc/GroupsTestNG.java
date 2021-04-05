package Misc;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GroupsTestNG {
    @BeforeSuite
    public void setup() {
        System.out.println("b4");
    }

    @Test(groups = {"Light"})
    public void color1() {
        System.out.println("White");
    }

    @Test(groups = {"Dark"})
    public void color2() {
        System.out.println("Red");
    }

    @Test(groups = {"Medium"})
    public void color3() {
        System.out.println("Orange");
    }

    @AfterSuite
    public void teardown() {
        System.out.println("teardown");
    }
}
