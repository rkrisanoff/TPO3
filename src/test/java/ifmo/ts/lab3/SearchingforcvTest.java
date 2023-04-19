package ifmo.ts.lab3;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;
import java.util.*;

public class SearchingforcvTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void searchingforcv() {
    driver.get("https://spb.hh.ru/");
    {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
      wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id=\'a11y-search-input\']")));
    }
    driver.findElement(By.id("a11y-search-input")).sendKeys("java developer");
    {
      WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
      wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/li")));
    }
    driver.findElement(By.xpath("//div/li")).click();
    {
      WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
      wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[3]/fieldset")));
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div[7]/fieldset"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div[15]/fieldset"));
      assert(elements.size() > 0);
    }
    {
      WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
      wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[2]/div/div[2]/div[2]")));
    }
    driver.findElement(By.xpath("//div[2]/div/div[2]/div[2]")).click();
    {
      WebDriverWait wait = new WebDriverWait(driver,  Duration.ofSeconds(10));
      wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div/div/div[2]/div/div[2]/div/div")));
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//fieldset[2]"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//div[4]/fieldset/div[2]/ul"));
      assert(elements.size() > 0);
    }
    {
      List<WebElement> elements = driver.findElements(By.xpath("//fieldset[6]"));
      assert(elements.size() > 0);
    }
  }
}
