package SDETday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandles {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");

//        Method -1
        driver.switchTo().frame("packageListFrame");
        driver.findElement(By.linkText("org.openqa.selenium.bidi")).click();
        driver.switchTo().defaultContent();

//        Method-2
        Thread.sleep(5000);
        driver.switchTo().frame(1);
        driver.findElement(By.linkText("BiDiSessionStatus")).click();


//        driver.findElement(By.)
    }
}
