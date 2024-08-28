package SDETday1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectDropdwn {

//    Method- 3 ( code file)
    public static void selectCountry(WebElement ele, String value){
        Select countryOptions = new Select(ele);
        List<WebElement> countryList = countryOptions.getOptions();

        for (WebElement country: countryList){
            if (country.getText().equals(value)){
                country.click();
                System.out.println("Test-1 : Pass");
                break;
            }
        }
    }
}
