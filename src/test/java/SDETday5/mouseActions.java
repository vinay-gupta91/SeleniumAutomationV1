package SDETday5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseActions {
    public static void main(String[] args) throws InterruptedException {

        // Mouse Right click                         ----------------------------------
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
//        driver.manage().window().maximize();
//
//        WebElement button = driver.findElement(By.xpath("//span[text() = \"right click me\"]"));
//        Actions mouse = new Actions(driver);
//        mouse.contextClick(button).perform();

        //Mouse Double click                           --------------------------------
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
//        driver.manage().window().maximize();
//        Thread.sleep(2000);
//        driver.switchTo().frame("iframeResult");
//
////        WebElement inputBox = driver.findElement(By.id("field1"));    //or
//        WebElement inputBox = driver.findElement(By.cssSelector("input#field1"));
//        inputBox.clear();
//        inputBox.sendKeys("Testing");
//        WebElement button = driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
//        Thread.sleep(2000);
//        Actions operate = new Actions(driver);
////        operate.doubleClick(button).perform();
//        //   or method -2
//        Action a = operate.doubleClick(button).build();
//        a.perform();



        // Mouse Drag & drop                              -------------------

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement source1 = driver.findElement(By.id("box1"));
        WebElement destination1 = driver.findElement(By.id("box101"));

        Actions operate = new Actions(driver);
        operate.dragAndDrop(source1,destination1).perform();

        // Mouse Hower                             -------------------
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://demo.opencart.com/index.php?route=product/category&language=en-gb&path=33");
//        driver.manage().window().maximize();
//
//        Actions actions = new Actions(driver);
//
//        Thread.sleep(2000);
//        WebElement a = driver.findElement(By.xpath("//a[text()=\"Desktops\"]"));
//        WebElement b = driver.findElement(By.xpath("//a[text()=\"Mac (1)\"]"));
//        actions.moveToElement(a).moveToElement(b).click().perform();
//
//        Thread.sleep(2000);
//        WebElement c = driver.findElement(By.xpath("//a[text()=\"Components\"]"));
//        WebElement d = driver.findElement(By.xpath("//a[text()=\"Monitors (2)\"]"));
//        actions.moveToElement(c).moveToElement(d).click().perform();
//
//        Thread.sleep(2000);
//        WebElement e = driver.findElement(By.xpath("//a[text()=\"MP3 Players\"]"));
//        WebElement f = driver.findElement(By.xpath("//a[text()=\"test 4 (0)\"]"));
//        actions.moveToElement(c).moveToElement(d).click().perform();


        //   Mouse slider                           -------------------
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
//        driver.manage().window().maximize();
//
//        Thread.sleep(2000);
//        WebElement slider1 = driver.findElement(By.xpath("//div[@id=\"slider-range\"]//span[1]"));
//        Actions operate = new Actions(driver);
//        operate.dragAndDropBy(slider1,50,0).perform();



    }
}
