package odev.base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {

    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void before() throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.hepsiburada.com/");
        Thread.sleep(5000);
    }

    @After
    public void after(){
        driver.quit();
    }

}
