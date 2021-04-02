package TestNG;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SecondTestNG {
    @BeforeSuite
    public void setup() {
        System.out.println("Test Suite with different parameters");
    }

    @Test
    @Parameters({"browserName", "url"})
    public void parameterTest(@Optional("Chrome")String browserName, String url) {
        System.out.println(browserName);
        System.out.println(url);
    }
}
