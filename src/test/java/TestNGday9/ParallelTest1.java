package TestNGday9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParallelTest1 {

    @Test
    public void verifyLogo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement Logo = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]"));
        Assert.assertTrue(Logo.isDisplayed(), "Logo is not displayed");
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void Login() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement Username = driver.findElement(By.name("password"));
        Username.sendKeys("Admin");
        WebElement Password = driver.findElement(By.name("username"));
        Password.sendKeys("admin123");
        Thread.sleep(2000);
        WebElement Submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        Submit.click();
        driver.close();
    }


}
