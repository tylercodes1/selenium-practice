import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemoTest {
    static WebDriver webDriver;

    @Test
    public void test() {
        System.setProperty("webdriver.chrome.driver", System.getenv("SYSTEM_PATH"));
        Assert.assertTrue(true);

        webDriver = new ChromeDriver();
        webDriver.get("http://google.com");

    }
}
