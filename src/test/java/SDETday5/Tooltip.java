package SDETday5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/tooltip/");
        driver.manage().window().maximize();

        Thread.sleep(2000);
        WebElement a = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
        driver.switchTo().frame(a);
        WebElement tip = driver.findElement(By.linkText("Tooltips"));
        System.out.println(tip.getAttribute("title"));

//        driver.switchTo().newWindow("https://text-compare.com/");

    }
}
