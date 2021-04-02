package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class FirstTestNG {

    static WebDriver webDriver;

    @BeforeSuite
    @Parameters({"browserName","url"})
    public void setup(@Optional("Chrome")String browserName, String url) {
        System.setProperty("webdriver.chrome.driver", System.getenv("SYSTEM_PATH"));
        webDriver = new ChromeDriver();
        webDriver.get(url);
    }

    @Test(dataProvider="getData")
    public void dataProviderTest
            (String username, String password) {
        System.out.println(username);
        System.out.println(password);
        webDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(username + " " + password + " ");
    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[3][2];
        data[0][0] = "donhere";
        data[0][1] = "don@123";

        data[1][0] = "donhere1";
        data[1][1] = "don@123";

        data[2][0] = "donhere2";
        data[2][1] = "don@123";

        return data;
    }

    @AfterSuite
    public void tearDown() {
        webDriver.quit();
    }
}
