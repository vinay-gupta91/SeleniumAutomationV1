package SDETday3;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckBoxSelectionMain {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

//    Method - 1 (select by an element )
//        WebElement Day = driver.findElement(By.xpath("//label[text()= \"Monday\"]"));
//        Day.click();

//    Method - 2 (Select by multiple names )
//        List<WebElement> Day = driver.findElements(By.xpath("//label[@class=\"form-check-label\" and contains(@for,\"day\")]"));
//        List<WebElement> Day = driver.findElements(By.xpath("//label[@for=\"days\"]/parent::div//input"));
//        for (WebElement option: Day){
//            String option1= option.getText();
//            if (option1.equals("Monday") || option1.equals("Friday")){
//                option.click();
//            }
//        }

//     Method-3 ( select by all elements or last 2 , first 2 )
        List<WebElement> Day = driver.findElements(By.xpath("//label[@class=\"form-check-label\" and contains(@for,\"day\")]"));

//        for (int i = 0; i<Day.size()-4;i++){        // First 3 days
//            Day.get(i).click();
//        }
//

        for (int i = Day.size()-2; i<Day.size();i++){      // Last 2 days
            Day.get(i).click();
        }



    }
}
