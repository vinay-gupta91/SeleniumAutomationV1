package TestNGday8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class SecondExample {

    WebDriver driver;
    @Test
    public void loginTest() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        driver = new ChromeDriver(options);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));
        WebElement username = driver.findElement(By.name("username"));
        Assert.assertTrue(username.isDisplayed());                               // Hard Assertion
        WebElement password = driver.findElement(By.name("passwords"));
        username.sendKeys("Admin");
        password.sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        boolean logo = driver.findElement(By.xpath("//img[@alt=\"client brand banner\"]")).isDisplayed();
        Assert.assertTrue(logo);                                                   // Hard Assertion
        String actualTitle = driver.getTitle();
        Thread.sleep(1000);
        System.out.println(actualTitle);
        String expectedTitle = "OrangeHRM";
        Assert.assertEquals(actualTitle, expectedTitle);                            // Hard Assertion
    }
}
