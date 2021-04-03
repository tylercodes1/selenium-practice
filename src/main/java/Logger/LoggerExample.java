package Logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoggerExample {
    static Logger logger = Logger.getLogger("LoggerExample.class");

    public static void main(String[] args) {
        WebDriver webDriver;
        BasicConfigurator.configure();
        System.setProperty("webdriver.chrome.driver",System.getenv("PATH"));
        webDriver = new ChromeDriver();
        webDriver.get("http://google.com");
        logger.info("Website Title: " + webDriver.getTitle());
    }
}
