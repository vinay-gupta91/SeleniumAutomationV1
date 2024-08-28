package DataDrivenday11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class DataReadMultiple2 {

    WebDriver driver;
    @BeforeMethod
    public void openBrowser(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @Test(dataProvider = "searchDataProvider", dataProviderClass = DataReadMultiple1.class)
    public void searchGoogle(String searchData) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(2000);
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(searchData);
        Thread.sleep(2000);
        searchBox.sendKeys(Keys.ENTER);
    }
}
