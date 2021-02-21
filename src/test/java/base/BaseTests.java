package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();
        WebElement inputsLinks = driver.findElement(By.linkText("Inputs"));
        inputsLinks.click();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());


    }
    public static void main(String args[])
    {
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
