package SDETday2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class JqueryDrpdwnMain {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
        driver.manage().window().maximize();

        WebElement options1 = driver.findElement(By.id("justAnInputBox"));
        options1.click();

        List<WebElement> drpDwn1 = driver.findElements(By.xpath("//li[@class=\"ComboTreeItemChlid\"]"));
        JqueryDrpdwn.jqueryoptions(drpDwn1,"choice 2", "choice 2 1", "choice 6 2 2", "choice 7");
        JqueryDrpdwn.jqueryoptions(drpDwn1,"aLL");
        System.out.println(drpDwn1.size());

    }
}
