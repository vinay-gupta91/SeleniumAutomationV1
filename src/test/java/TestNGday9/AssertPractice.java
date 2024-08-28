package TestNGday9;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class AssertPractice {
    WebDriver driver;
    @Test
    public void launchBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
//    @Test(priority = 1)
//    public void logoTest() throws InterruptedException {
//        WebElement Logo = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]"));
//        Assert.assertTrue(Logo.isDisplayed(),"logo is not displayed");
//    }

    @Test(priority = 2)
    public void titleTest(){
        String ActualTitle = driver.getTitle();
        Assert.assertEquals(ActualTitle, "OrangeHRM", "Title not matched");
    }
    @AfterClass
    public void close() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();
    }


}
