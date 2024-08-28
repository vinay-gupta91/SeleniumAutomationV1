package SDETpractice;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestMain {

    WebDriver driver;
    @BeforeClass
    public void testLogin(String browser){
        if(browser.toLowerCase().contains("edge")){
            driver = new EdgeDriver();
            driver.get("https://www.saucedemo.com/v1/");
            driver.manage().window().maximize();
        } else if (browser.toLowerCase().contains("chrome")) {
            driver = new EdgeDriver();
            driver.get("https://www.saucedemo.com/v1/");
            driver.manage().window().maximize();
        }

    }


}
