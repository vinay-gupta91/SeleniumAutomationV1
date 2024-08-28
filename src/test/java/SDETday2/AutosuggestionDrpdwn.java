package SDETday2;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutosuggestionDrpdwn {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("selenium");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        Thread.sleep(3000);
        List<WebElement> opt1 = driver.findElements(By.xpath("//div[@class=\"wM6W7d\"]//b"));
        System.out.println(opt1.size());

        for (WebElement Search : opt1){
            if (Search.getText().contains("download")){
                Search.click();
                break;
            }
        }
    }
}
