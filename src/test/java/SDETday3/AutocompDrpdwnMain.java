package SDETday3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutocompDrpdwnMain {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.twoplugs.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text() = 'Live Posting']")).click();

        WebElement countryList = driver.findElement(By.xpath("//input[@id=\"autocomplete\"]"));
        countryList.clear();
        Thread.sleep(3000);
        countryList.sendKeys("Delhi");
        String selections;

        do{
            countryList.sendKeys(Keys.ARROW_DOWN);
            Thread.sleep(3000);
            selections = countryList.getAttribute("value");
            if(selections.equalsIgnoreCase("Delhi, ON, Canada")){
                countryList.sendKeys(Keys.ENTER);
                break;
            }
        }while (!selections.isEmpty());

    }
}
