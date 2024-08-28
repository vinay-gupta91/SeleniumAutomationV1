package SDETday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectDropdwnMain {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.orangehrm.com/en/book-a-free-demo/");

//        part - 8


//        Method -1
//        WebElement countrySelect = driver.findElement(By.xpath("//select[@name=\"Country\"]"));
//        Select countryOptions = new Select(countrySelect);
//        countryOptions.selectByIndex(2);
//        countryOptions.selectByVisibleText("Bangladesh");

//        Method -2
//        WebElement countrySelect = driver.findElement(By.xpath("//select[@name=\"Country\"]"));
//        Select countryOptions = new Select(countrySelect);
//        List<WebElement> countryList = countryOptions.getOptions();
//
//        for (WebElement Country: countryList){
//            if (Country.getText().equals("Bolivia")){
//                Country.click();
//            }
//        }

//        Method  -3 ( making generic method to use it from other class )
        WebElement countrySelect = driver.findElement(By.xpath("//select[@name=\"Country\"]"));
        SelectDropdwn.selectCountry(countrySelect, "Canada");

    }
}
