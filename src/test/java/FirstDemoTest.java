import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Time;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FirstDemoTest {
    WebDriver webDriver;
    String url = "http://google.com";

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver",System.getenv("SYSTEM_PATH"));
        webDriver = new ChromeDriver();
        webDriver.get(url);
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
//
//    @Test
//    public void test() {
//        System.out.println(webDriver.getTitle());
//    }

//    @Test
//    public void testLocators() {
//        System.out.println("webDriver.findElement(By.id()) is impossible on most large webapps.");
//        System.out.println("webDriver.findElement(By.name()) is also hard to find on large webapps.");
//        System.out.println("webDriver.findElement(By.className()) is hard to find on webapps bc of hashing.");
//        System.out.println("webDriver.findElement(By.linkText(\"Google Search\")).click(): tbh unsuccessful");
////        webDriver.findElement(By.linkText("Google Search")).click();
//        System.out.println("webDriver.findElement(By.partialLinkText(\"Google Search\")).click(): tbh unsuccessful");
////        webDriver.findElement(By.partialLinkText("Google")).click();
//        // CSS SELECTORS:
//        // tag and id: "tag#ID":"input#searchbar"
//        System.out.println("cannot find tag with id");
//        // tag and class: "tag.class":"input.inputbar"
////        webDriver.findElement(By.cssSelector("input.gLFyf gsfi")).sendKeys("FINALLY???");
//        // tag and attribute: "tag[attribute=value]" : "input[label="Search"]"
////        System.out.println(webDriver.findElement(By.cssSelector("input[label=Search]")).getLocation());
//        // tag and class and attribute: "tag.class[attribute=value]":"input.text[label=Search]"
//        System.out.println("Absolute xpath");
//        webDriver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Xpath sender");
//        System.out.println("Relative xpath");
//        webDriver.findElement(By.xpath("//*[@title='Search']")).sendKeys("relative xpath");
//
//        // new easy website
//        webDriver.navigate().to("http://www.practiceselenium.com/check-out.html");
//        System.out.println(webDriver.getTitle());
//        webDriver.findElement(By.linkText("Welcome")).click();
//        webDriver.navigate().back();
//        webDriver.findElement(By.partialLinkText("Te")).click();
//        webDriver.navigate().back();
//        webDriver.findElement(By.cssSelector("input#email")).sendKeys("tag#id");
//        webDriver.findElement(By.cssSelector("input.span6")).sendKeys("tag.class");
//        webDriver.findElement(By.cssSelector("input[id=name]")).sendKeys("tag[attribute=value]");
//        webDriver.findElement(By.cssSelector("textarea.span6[id=address]")).sendKeys("tag.class[attribute=value]");
//        new Select(webDriver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/form/fieldset[2]/div[1]/div/select"))).selectByVisibleText("Mastercard");
//        webDriver.findElement(By.xpath("//*[@id='card_number']")).sendKeys("8008135");
//        webDriver.findElement(By.xpath("//input[contains(@id, 'cardholder_name')]")).sendKeys("Conatins()");
//        // AND, OR, starts-with not seeming to work
////        webDriver.findElement(By.xpath("//*input[@type='textarea' OR @id='verification_code']")).sendKeys("OR ");
////        webDriver.findElement(By.xpath("//*input[@type='text' AND @id='verification_code' AND @class='span1']")).sendKeys("AND");
////        webDriver.findElement(By.xpath("//input[starts-with(@id, 'verification-code')]")).sendKeys("starts-with");
//        System.out.println(webDriver.findElements(By.tagName("a")).size());
//        WebElement webElement = webDriver.findElement(By.xpath("/html/body/div/div/div[1]/div/div[1]/div/div/form/div/button"));
//        System.out.println(webElement.isDisplayed());
//        System.out.println(webElement.isEnabled());
//        System.out.println(webElement.isSelected());
//        System.out.println(webElement.getText());
//        System.out.println(webElement.getTagName());
//        System.out.println(webElement.getCssValue("background-color"));
//        System.out.println(webElement.getSize());
//        System.out.println(webElement.getLocation());
//        Assert.assertTrue(true);
//    }

//    @Test
//    public void firstTest() throws InterruptedException {
//        String title = webDriver.getTitle();
//        Assert.assertEquals(title, "Google");
//    }
//
//    @Test
//    public void threadSleepTest() throws InterruptedException {
//        webDriver.navigate().to("https://www.amazon.com/");
//        webDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("candles");
//        Thread.sleep(2000);
//        webDriver.findElement(By.id("nav-search-submit-button")).click();
//    }

//    @Test
//    public void forCheckboxTest() throws InterruptedException {
//        webDriver.navigate().to("http://www.practiceselenium.com/check-out.html");
//        Select cardType = new Select(webDriver.findElement(By.id("card_type")));
//        System.out.println(cardType.getAllSelectedOptions());
//        List<WebElement> options = cardType.getOptions();
//        for (WebElement e : options) {
//            System.out.println(e.getText());
//            cardType.selectByVisibleText(e.getText());
//            Thread.sleep(1000);
//        }
//    }

    @After
    public void tearDown() {

//        webDriver.close();
//        webDriver.quit();
    }
}
