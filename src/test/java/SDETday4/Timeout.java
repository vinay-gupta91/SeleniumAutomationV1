package SDETday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Timeout {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("selenium");

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));  // wait for max. upto 2 seconds in complete program
        Thread.sleep(9000);                                          // wait for fixed 3 seconds
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
