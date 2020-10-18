// Generated by Selenium IDE

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class CreateDownloadLinkTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        String driverType = System.getenv("DRIVER");
        if(driverType.equals("CHROME")) {
            driver = new ChromeDriver();
        }else if(driverType.equals("FIREFOX")){
            driver = new FirefoxDriver();
        }
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void createDownloadLink() {
        driver.get("https://dfiles.eu/");
        driver.manage().window().setSize(new Dimension(1920, 1053));
        driver.findElement(By.xpath("//div[@id=\'main\']/div/div/a/strong")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name=\'login\']")));
        }
        driver.findElement(By.xpath("//input[@name=\'login\']")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@id=\'login_frm\']/table/tbody/tr[4]/td")));
        }
        driver.findElement(By.xpath("//form[@id=\'login_frm\']/table/tbody/tr[4]/td")).click();
        driver.findElement(By.xpath("//input[@name=\'login\']")).click();
        driver.findElement(By.xpath("//input[@name=\'login\']")).sendKeys("gardemarrina");
        driver.findElement(By.xpath("//form[@id=\'login_frm\']/table/tbody/tr[4]/td")).click();
        driver.findElement(By.xpath("//input[@name=\'password\']")).click();
        driver.findElement(By.xpath("//form[@id=\'login_frm\']/table/tbody/tr[5]/td")).click();
        driver.findElement(By.xpath("//input[@name=\'password\']")).click();
        driver.findElement(By.xpath("//input[@name=\'password\']")).sendKeys("123456");
        driver.findElement(By.xpath("//form[@id=\'login_frm\']/table/tbody/tr[7]/td")).click();
        driver.findElement(By.xpath("//input[@id=\'login_btn\']")).click();
        // На случай ввода капчи
        {
            WebDriverWait wait = new WebDriverWait(driver, 300);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, \'/gold/files_list.php\')]")));
        }
        driver.findElement(By.xpath("//a[contains(@href, \'/gold/files_list.php\')]")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, 300);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=\'df_share\']/div/ul/li[2]/ul/li/a")));
        }
        {
            WebElement element = driver.findElement(By.xpath("//div[@id=\'df_share\']/div/ul/li[2]/ul/li/a"));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].click()", element);
        }
        {
            WebElement element = driver.findElement(By.xpath("//div[@id=\'df_share\']/div/ul/li[2]/ul/li/a"));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].click()", element);
        }
        {
            WebElement element = driver.findElement(By.xpath("//div[@id=\'df_share\']/div/div/a[2]/span"));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].click()", element);
        }
        {
            List<WebElement> elements = driver.findElements(By.xpath("//div[@id=\'depositbox\']/div/div[2]/div/textarea"));
            assert (elements.size() > 0);
        }

        {
            WebElement element = driver.findElement(By.xpath("//div[@id=\'depositbox\']/div/div[2]/div/div"));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].click()", element);
        }
        {
            WebElement element = driver.findElement(By.xpath("//a[contains(text(),\'Расширенный список\')]"));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].click()", element);
        }
        {
            List<WebElement> elements = driver.findElements(By.xpath("//div[@id=\'depositbox\']/div/div[2]/div/textarea"));
            assert (elements.size() > 0);
        }

        {
            WebElement element = driver.findElement(By.xpath("//a[contains(text(),\'Файлы в папке\')]"));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].click()", element);
        }
        {
            List<WebElement> elements = driver.findElements(By.xpath("//div[@id=\'depositbox\']/div/div[2]/div/textarea"));
            assert (elements.size() > 0);
        }

        {
            WebElement element = driver.findElement(By.xpath("//a[contains(text(),\'Файлы в папке (расширенный список)\')]"));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].click()", element);
        }
        {
            List<WebElement> elements = driver.findElements(By.xpath("//div[@id=\'depositbox\']/div/div[2]/div/textarea"));
            assert (elements.size() > 0);
        }

        {
            WebElement element = driver.findElement(By.xpath("//div[@id=\'depositbox\']/div/div/a"));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].click()", element);
        }
        {
            WebElement element = driver.findElement(By.xpath("//div[@id=\'main\']/div/div[2]/a[2]"));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].click()", element);
        }
        {
            WebElement element = driver.findElement(By.xpath("//a[contains(text(),\'Выход\')]"));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].click()", element);
        }
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id=\'main\']/div/div/a/strong")));
        }
        driver.close();
    }
}