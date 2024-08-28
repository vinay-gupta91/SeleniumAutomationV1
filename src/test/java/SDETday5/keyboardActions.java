package SDETday5;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;

public class keyboardActions {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        // Send actions to the page ( Actions class is needed )
//        driver.get("https://the-internet.herokuapp.com/key_presses");
//        driver.manage().window().maximize();
//
//        Thread.sleep(2000);
//
//        Actions act = new Actions(driver);
//        act.sendKeys("s").perform();
//        Thread.sleep(2000);
//        act.sendKeys("a").perform();
//        Thread.sleep(2000);
//        act.sendKeys(Keys.TAB).perform();
//        Thread.sleep(2000);

        // Send actions to the webelement ( No Actions class is needed )
//        driver.get("https://the-internet.herokuapp.com/key_presses");
//        driver.manage().window().maximize();
//
//        Thread.sleep(2000);
//
//        WebElement a = driver.findElement(By.xpath("//*[@id=\"target\"]"));
//        a.sendKeys("super");
//        Thread.sleep(2000);
//        a.sendKeys("a");
//        Thread.sleep(2000);
//        a.sendKeys(Keys.TAB);
//        Thread.sleep(2000);

        //   copy text from one place to another
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);
        Actions act = new Actions(driver);

        WebElement area1 = driver.findElement(By.id("inputText1"));
        area1.sendKeys("Hello vinay");
//        act.keyDown(Keys.CONTROL);
//        act.sendKeys("a");
//        act.sendKeys("c");
//        act.keyUp(Keys.CONTROL);
//        act.perform();
//
//        act.sendKeys(Keys.TAB).perform();
//
//        act.keyDown(Keys.CONTROL);
//        act.sendKeys("v");
//        act.keyUp(Keys.CONTROL);
//        act.perform();

        // in different manner
        act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
        Thread.sleep(1000);
        act.sendKeys(Keys.TAB).perform();
        Thread.sleep(1000);
        act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();



    }
}
