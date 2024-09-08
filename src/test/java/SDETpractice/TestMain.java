package SDETpractice;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.*;

public class TestMain {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(2000);

        String WinID = driver.getWindowHandle();
        System.out.println(WinID);

        driver.findElement(By.xpath("//a[text()= \"OrangeHRM, Inc\"]")).click();

        Set<String> WinIDS = driver.getWindowHandles();
        List<String> Ids = new ArrayList(WinIDS);

        System.out.println(Ids.get(0));
        System.out.println(Ids.get(1));

        System.out.println("-----------------");

        for (String a : WinIDS){
            driver.switchTo().window(a).getCurrentUrl();
            System.out.println(driver.getCurrentUrl());
            System.out.println("+++++");

        }

        Thread.sleep(7000);
        driver.close();
        driver.quit();


    }
}
