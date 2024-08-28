package SDETday10;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class PasswordPrac2 {

    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement UserName = driver.findElement(By.name("username"));
        UserName.sendKeys("Admin");

        WebElement Password = driver.findElement(By.name("password"));
        Password.sendKeys(PasswordPrac1.encryptedPass());

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();



    }
}
