package TestNGday9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

public class CrossBrowserTest {
    WebDriver driver;
    @BeforeMethod
    @Parameters({"browsers"})
    public void launchBrowser(String browser){
        switch (browser.toLowerCase()){
            case ("edge"):
                EdgeOptions options = new EdgeOptions();
                options.addArguments("--headless");
                driver = new EdgeDriver(options);
                driver.manage().window().maximize();
                System.out.println("edge launch");
                break;

            case ("chrome"):
                ChromeOptions options2 = new ChromeOptions();
                options2.addArguments("--headless");
                driver = new ChromeDriver(options2);
                driver.manage().window().maximize();
                System.out.println("chrome launch");
                break;
            default: driver = null; break;
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
        driver.close();
    }

}
