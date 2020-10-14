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
public class RegistrationViaSocialNetvorksTest {
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
    public void registrationViaSocialNetvorks() {
        driver.get("https://dfiles.eu/");
        driver.manage().window().setSize(new Dimension(960, 1053));
        driver.findElement(By.linkText("Зарегистрируйтесь сейчас!")).click();
        driver.findElement(By.id("i_undertake_conditions")).click();
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.cssSelector("#signup_frm #facebook")).click();
        vars.put("win2634", waitForWindow(2000));
        vars.put("root", driver.getWindowHandle());
        driver.switchTo().window(vars.get("win2634").toString());
        assertThat(driver.findElement(By.cssSelector(".\\_9axz")).getText(), is("Вход на Facebook"));
        driver.close();
        driver.switchTo().window(vars.get("root").toString());
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.cssSelector("#signup_frm #twitter")).click();
        vars.put("win7299", waitForWindow(2000));
        driver.switchTo().window(vars.get("win7299").toString());
        {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.textToBe(By.cssSelector("h2"), "Разрешить приложению Depositfiles доступ к вашей учетной записи?"));
        }
        driver.close();
        driver.switchTo().window(vars.get("root").toString());
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.cssSelector("#signup_frm #google")).click();
        vars.put("win6174", waitForWindow(2000));
        driver.switchTo().window(vars.get("win6174").toString());
        assertThat(driver.getTitle(), is("Вход – Google Аккаунты"));
        driver.close();
        driver.switchTo().window(vars.get("root").toString());
        vars.put("window_handles", driver.getWindowHandles());
        driver.findElement(By.cssSelector("#signup_frm #vkontakte")).click();
        vars.put("win5067", waitForWindow(2000));
        driver.switchTo().window(vars.get("win5067").toString());
        assertThat(driver.findElement(By.cssSelector(".oauth_form_access")).getText(), is("Приложение Depositfiles запрашивает доступ к Вашему аккаунту.\nДоступ к общей информации\nПриложению будут доступны Ваши личные данные\nДоступ к электронному адресу\nma***@gmail.com (Запретить)"));
        driver.switchTo().window(vars.get("root").toString());
    }
}