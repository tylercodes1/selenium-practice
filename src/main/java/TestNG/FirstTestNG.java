package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class FirstTestNG {

    static WebDriver webDriver;

    @BeforeSuite
    @Parameters({"browserName","url"})
    public void setup(@Optional("Chrome")String browserName, String url) {
        System.setProperty("webdriver.chrome.driver", System.getenv("SYSTEM_PATH"));
        ChromeOptions co = new ChromeOptions();
        co.setAcceptInsecureCerts(true);
        webDriver = new ChromeDriver(co);
        webDriver.get(url);
    }

    @Test(dataProvider="getData")
    public void dataProviderTest
            (String username, String password) {
        System.out.println(username);
        System.out.println(password);
        webDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys(username + " " + password + " ");
    }

    @Test
    public void predicatesTest() throws InterruptedException {
        System.out.println(webDriver.findElement(By.xpath("//div//following::center")).getTagName());
        System.out.println(webDriver.findElements(By.xpath("//div//following::center//ancestor::div")).size());
        System.out.println(webDriver.findElement(By.xpath("//div//following::center//ancestor::div[2]")).getLocation());
        System.out.println(webDriver.findElements(By.xpath("//div//following::center//child::input")).size());
        System.out.println(webDriver.findElements(By.xpath("//input[@title='Search']//parent::div")).size());
        webDriver.findElement(By.xpath("//input[@title='Search']//self::input")).sendKeys("self::input");
        Thread.sleep(2000);
        System.out.println(webDriver.findElements(By.xpath("//form[@method='GET']//descendant::div")).size());
        // self::node() does not work m8
        //        System.out.println(webDriver.findElements(By.xpath("//form[@method='GET']//self::node()")).size());
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
