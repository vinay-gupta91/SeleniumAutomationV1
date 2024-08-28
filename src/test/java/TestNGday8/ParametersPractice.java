package TestNGday8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParametersPractice {

    WebDriver driver;
    @Test
    @Parameters("searched")
    public void searchBox(String keyword) throws InterruptedException {
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement SearchBox = driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
        SearchBox.sendKeys(keyword);
        Thread.sleep(1000);
        String ExpectedKeyword = SearchBox.getAttribute("value");
        Assert.assertEquals(keyword, ExpectedKeyword);
        Thread.sleep(2000);
        System.out.println(ExpectedKeyword);
        driver.close();

    }
}
