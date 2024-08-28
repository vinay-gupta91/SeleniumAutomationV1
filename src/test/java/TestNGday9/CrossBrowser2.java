package TestNGday9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser2 {

    WebDriver driver;
    @BeforeMethod
    @Parameters({"browsers"})
    public void launchBrowser(String browser){

        if (browser.toLowerCase().contains("edge"))
        {
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            System.out.println("edge launch");
        } else if (browser.toLowerCase().contains("chrome")) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            System.out.println("chrome launch");
        }
    }
    @Test
    public void verifyTitle() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "OrangeHRM";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        Thread.sleep(2000);
    }
    @AfterMethod
    public void quit(){
        driver.quit();
    }
}
