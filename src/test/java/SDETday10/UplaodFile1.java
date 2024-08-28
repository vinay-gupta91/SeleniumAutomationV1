package SDETday10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UplaodFile1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//        driver.get("https://practice.expandtesting.com/upload");
        driver.get("https://demoqa.com/upload-download");
        driver.manage().window().maximize();


        Thread.sleep(2000);
        driver.findElement(By.id("uploadFile")).sendKeys("F:\\Practice Folder\\Sample File UP.pdf");

    }
}
