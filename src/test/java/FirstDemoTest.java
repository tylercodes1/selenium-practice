import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemoTest {
    WebDriver webDriver;
    String url = "http://google.com";

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver",System.getenv("SYSTEM_PATH"));
        webDriver = new ChromeDriver();
        webDriver.get(url);
    }

    @Test
    public void test() throws InterruptedException {
        System.out.println(webDriver.getTitle());
    }

    @Test
    public void testLocators() {
        System.out.println("webDriver.findElement(By.id()) is impossible on most large webapps.");
        System.out.println("webDriver.findElement(By.name()) is also hard to find on large webapps.");
        System.out.println("webDriver.findElement(By.className()) is hard to find on webapps bc of hashing.");
        System.out.println("webDriver.findElement(By.linkText(\"Google Search\")).click(): tbh unsuccessful");
        webDriver.findElement(By.linkText("Google Search")).click();
        System.out.println("webDriver.findElement(By.partialLinkText(\"Google Search\")).click(): tbh unsuccessful");
        webDriver.findElement(By.partialLinkText("Google")).click();
        // CSS SELECTORS:
        // tag and id: "tag#ID":"input#searchbar"
        System.out.println("cannot find tag with id");
        // tag and class: "tag.class":"input.inputbar"
        webDriver.findElement(By.cssSelector("input.gLFyf gsfi")).sendKeys("FINALLY???");
        // tag and attribute: "tag[attribute=value]" : "input[label="Search"]"
        System.out.println(webDriver.findElement(By.cssSelector("input[label=Search]")).getLocation());
        // tag and class and attribute: "tag.class[attribute=value]":"input.text[label=Search]"
        System.out.println("Absolute xpath");
        webDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Xpath sender");
        System.out.println("Relative xpath");
        webDriver.findElement(By.xpath("//*[@title=`Search`]")).sendKeys("relative xpath");
        System.out.println();
    }

    @After
    public void tearDown() {
//        webDriver.close();
    }
}
