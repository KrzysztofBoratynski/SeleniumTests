import Tasks.Task01;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class Main {
//dodac do sciezki systemowej
    public static void main(String args[]) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Samael\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = WebDriverCreate.create();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        new ThreadRunner();

        EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
        EventHandler handler = new EventHandler();
        eventDriver.register(handler);
        driver.get("https://www.zara.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"form-worldwide\"]/form/input")));
        driver.findElement(By.xpath("//*[@id=\"form-worldwide\"]/form/input")).click();

        driver.quit();


    }


}

