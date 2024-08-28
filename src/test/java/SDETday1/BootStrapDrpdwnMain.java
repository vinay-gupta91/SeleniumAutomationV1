package SDETday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;
import java.util.concurrent.ForkJoinPool;

public class BootStrapDrpdwnMain {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

//        Method-1

//        WebElement Button = driver.findElement(By.xpath("//div[@class = 'dropdown-active-item product-category-active']"));
//        Button.click();
//
//
//        List<WebElement> productList = driver.findElements(By.xpath("//ul[@id=\"productType\"]//li"));
//
//        for (WebElement product : productList) {
//            if (product.getText().equals("Refinance")) {
//                product.click();
//                break;
//            }
//        }

//        Method-2

//        WebElement Button = driver.findElement(By.xpath("//div[@class = 'dropdown-active-item product-category-active']"));
//        Button.click();
//
//        List<WebElement> productList = driver.findElements(By.xpath("//ul[@id=\"productType\"]//li"));
//        BootStrapDrpdwn.selectProduct(productList, "Non Housing Loans");

//        We can use same method created for different  dropdowns & links
        List<WebElement> Linkcreditcard = driver.findElements(By.xpath("//div[@class=\"footer-upper\"]//a"));
        BootStrapDrpdwn.selectProduct(Linkcreditcard, "Privacy notice");

    }
}

