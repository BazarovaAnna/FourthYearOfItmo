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
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ShareOnTwitterAndFacebookTest {
    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    public String waitForWindow(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Set<String> whNow = driver.getWindowHandles();
        Set<String> whThen = (Set<String>) vars.get("window_handles");
        if (whNow.size() > whThen.size()) {
            whNow.removeAll(whThen);
        }
        return whNow.iterator().next();
    }
    @Test
    public void shareOnTwitterAndFacebook() {
        driver.get("https://dfiles.eu/");
        driver.manage().window().setSize(new Dimension(1920, 1053));
        driver.findElement(By.xpath("//div[@id=\'main\']/div/div/a/span")).click();
        driver.findElement(By.xpath("//input[@name=\'login\']")).click();
        driver.findElement(By.xpath("//input[@name=\'login\']")).sendKeys("1");
        driver.findElement(By.xpath("//form[@id=\'login_frm\']/table/tbody/tr[2]/td")).click();
        driver.findElement(By.xpath("//input[@name=\'login\']")).click();
        driver.findElement(By.xpath("//input[@name=\'login\']")).sendKeys("gardemarrina");
        driver.findElement(By.xpath("//form[@id=\'login_frm\']/table/tbody/tr[2]/td")).click();
        driver.findElement(By.xpath("//input[@name=\'password\']")).click();
        driver.findElement(By.xpath("//input[@name=\'password\']")).sendKeys("1");
        driver.findElement(By.xpath("//form[@id=\'login_frm\']/table/tbody/tr[8]/td")).click();
        driver.findElement(By.xpath("//input[@name=\'password\']")).click();
        driver.findElement(By.xpath("//input[@name=\'password\']")).sendKeys("123456");
        driver.findElement(By.xpath("//form[@id=\'login_frm\']/table/tbody/tr[7]/td")).click();
        driver.findElement(By.xpath("//input[@id=\'login_btn\']")).click();
        driver.findElement(By.xpath("//div[@id=\'main\']/div/ul/li[2]/a")).click();
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.xpath("//span[@onclick=\"DF.Popup.init({ url: \'http://www.facebook.com/sharer/sharer.php?u=http%3A%2F%2Ffb.depositfiles.com%2Ffiles%2Fa7aelkek7\', width: 600, height: 400 });  DF.Popup.open(); return false\"]")).click();
        vars.put("win6430", waitForWindow(2000));
        vars.put("root", driver.getWindowHandle());
        driver.switchTo().window(vars.get("win6430").toString());
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".\\_3lu0"));
            assert(elements.size() > 0);
        }
        driver.close();
        driver.switchTo().window(vars.get("root").toString());
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.xpath("//span[@onclick=\"DF.Popup.init({ url: \'http://twitter.com/timeline/home?status=lab3.side%20http%3A%2F%2Ffb.depositfiles.com%2Ffiles%2Fa7aelkek7\', width: 600, height: 400 });  DF.Popup.open(); return false\"]")).click();
        vars.put("win1081", waitForWindow(2000));
        driver.switchTo().window(vars.get("win1081").toString());
        {
            List<WebElement> elements = driver.findElements(By.cssSelector(".r-13gxpu9 path"));
            assert(elements.size() > 0);
        }
        driver.close();
        driver.switchTo().window(vars.get("root").toString());
        driver.findElement(By.xpath("//div[@id=\'main\']/div/div[2]/a[2]/strong")).click();
        driver.findElement(By.linkText("Выход")).click();
    }
}