package SDETday10;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.domsnapshot.model.StringIndex;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class UploadFile2 {

    public static void main(String[] args) throws InterruptedException, AWTException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/upload-download");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement button = driver.findElement(By.xpath("//input[@id=\"uploadFile\"]"));
//        button.click();                          // It not works , Then use JS method or mouse action

        JavascriptExecutor jss = (JavascriptExecutor)driver;
        jss.executeScript("arguments[0].click();",button);

//        Actions mouse = new Actions(driver);
//        mouse.moveToElement(button).click().perform();

        Robot rb = new Robot();
        rb.delay(2000);

        //   Ctrl+c   ( Copy the location in clipboard )
        StringSelection sc = new StringSelection("F:\\Practice Folder\\Sample File UP.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc, null);

//        // ctrl + v

        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.delay(2000);

        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.delay(2000);

        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        System.out.println(" done testing");



    }
}
