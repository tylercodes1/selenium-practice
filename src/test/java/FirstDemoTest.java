import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemoTest {
    static WebDriver webDriver;

    @Test
    public void test() {
        // grab webdriver location
        System.setProperty("webdriver.chrome.driver", System.getenv("SYSTEM_PATH"));
        Assert.assertTrue(true);

        // instantiate webdriver and go to google.com
        webDriver = new ChromeDriver();
        webDriver.get("http://google.com");

        // Maximize the window
        webDriver.manage().window().maximize();

    }
}
