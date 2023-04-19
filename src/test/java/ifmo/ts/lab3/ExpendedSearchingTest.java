package ifmo.ts.lab3;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class ExpendedSearchingTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
//        driver.get("http://localhost:4444/wd/hub");

        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void expendedSearching() {
        driver.get("https://spb.hh.ru/");
        driver.manage().window().setSize(new Dimension(1920, 1036));
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form/div/div[3]/a")));
        }
        driver.findElement(By.xpath("//form/div/div[3]/a")).click();
        driver.findElement(By.xpath("//div[2]/div/fieldset/input")).click();
        {
            WebElement element = driver.findElement(By.xpath("//form/div/div[2]/div/div/button"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.xpath("//form/div/div[2]/div/div/button")).click();
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.xpath("//label/span")).click();
        driver.findElement(By.xpath("//div[3]/div[2]/div/fieldset/input")).click();
        js.executeScript("window.scrollTo(0,264)");
        driver.findElement(By.xpath("//div[3]/div[2]/div/fieldset/input")).sendKeys("java developer");
        driver.findElement(By.xpath("//div[5]/div[2]/div/div/button")).click();
        {
            WebElement element = driver.findElement(By.xpath("//div[5]/div[2]/div/div/button"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.xpath("//div[3]/div/div/label/span")).click();
        driver.findElement(By.xpath("//div[4]/div/div[2]/button/span")).click();
        {
            WebElement element = driver.findElement(By.xpath("//div[4]/div/div[2]/button/span"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        driver.findElement(By.xpath("//div[7]/div[2]/div/div/button")).click();
        driver.findElement(By.xpath("//div[6]/div/div/label/span")).click();
        driver.findElement(By.xpath("//div[7]/div/div/label/span")).click();
        driver.findElement(By.xpath("//div[4]/div/div[2]/button/span")).click();
        {
            WebElement element = driver.findElement(By.xpath("//div[4]/div/div[2]/button/span"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        driver.findElement(By.xpath("//div[12]/div[2]/div/div/fieldset/input")).click();
        driver.findElement(By.xpath("//div[12]/div[2]/div/div/fieldset/input")).sendKeys("12 000");
        driver.findElement(By.xpath("//div[14]/div[2]/div[2]/label/span")).click();
        driver.findElement(By.xpath("//div[16]/div[2]/div[3]")).click();
        driver.findElement(By.xpath("//div[16]/div[2]/div[3]/label/span")).click();
        driver.findElement(By.xpath("//div[22]/div[2]/div[5]/label/span")).click();
        driver.findElement(By.xpath("//div[22]/div[2]/div[3]")).click();
        driver.findElement(By.xpath("//div[22]/div[2]/div[2]")).click();
        driver.findElement(By.xpath("//div[22]/div[2]/div[3]/label/span")).click();
        driver.findElement(By.xpath("//div[22]/div[2]/div[4]/label/span")).click();
        driver.findElement(By.xpath("//div[28]/div[2]/div[2]")).click();
        driver.findElement(By.xpath("//div[28]/div[2]/div[2]/label/span")).click();
        driver.findElement(By.xpath("//div[30]/div[2]/div/label/span")).click();
        driver.findElement(By.xpath("//div[26]/div[2]/div[2]/label/span")).click();
        driver.findElement(By.xpath("//div[24]/div[2]/div[4]/label/span")).click();
        driver.findElement(By.xpath("//div[32]/div[2]/button")).click();
    }
}
