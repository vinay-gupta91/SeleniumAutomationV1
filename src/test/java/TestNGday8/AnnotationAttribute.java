package TestNGday8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AnnotationAttribute {

    WebDriver driver;
    @Test(priority = 0, description = "Browser is launched")
    public void launchBrowser(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));     // Timeout is applicable to all scripts/ methods once given
        driver.manage().window().maximize();
    }
    @Test(priority = 1, description = "testing description")
    public void openURL(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }
    @Test(priority = 2, description = " credentials added & login")
    public void login(){
        WebElement Username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        Username.sendKeys("Admin");

        WebElement Password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        Password.sendKeys("admin123");

        WebElement Submit = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        Submit.click();

    }
    @AfterMethod(description = "Wait to execute")
    public void waiting() throws InterruptedException {
        Thread.sleep(2000);
    }
    @Test(priority = 4, description = "Title to be verified")
    public void titleVerify(){
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "OrangeHRM";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        System.out.println(ActualTitle);
    }


}
