package ProertiesExampleday12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

public class PropertiesFileExamp {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        ReadConfigFile rf = new ReadConfigFile();
        driver.get(rf.getURL());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement UserName = driver.findElement(By.name("username"));
        UserName.sendKeys(rf.getUserName());

        WebElement Password = driver.findElement(By.name("password"));
        Password.sendKeys(rf.getPassWord());

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();


    }
}
