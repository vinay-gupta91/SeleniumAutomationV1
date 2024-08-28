package SDETday5;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindow {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();


        Thread.sleep(2000);
        // open a link in a new tab
//        String nextWindow = Keys.chord(Keys.CONTROL, Keys.RETURN);
//        driver.findElement(By.linkText("Register")).sendKeys(nextWindow);

        // open a url in a new tab & window
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.orangehrm.com/en/book-a-free-demo/");



    }
}
