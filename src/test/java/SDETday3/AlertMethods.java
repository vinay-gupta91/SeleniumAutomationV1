package SDETday3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AlertMethods {
    public static void main(String[] args) throws InterruptedException {

        RemoteWebDriver driver = new ChromeDriver();
//        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//        driver.manage().window().maximize();

//        Button -1 - only single button
//        WebElement button1 = driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
//        button1.click();
//        Alert alert1 =  driver.switchTo().alert();
//        Thread.sleep(3000);
//        alert1.accept();

//        Button -2 - Two buttons
//        WebElement button1 = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));
//        button1.click();
        Alert alert1 =  driver.switchTo().alert();
//        Thread.sleep(3000);
////        alert1.accept();
//        alert1.dismiss();

//        Type - 3 button ( enter details & click button )


        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
}
