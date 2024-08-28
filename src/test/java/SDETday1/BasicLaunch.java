package SDETday1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.util.List;

public class BasicLaunch {
    public static void main(String[] args) {

////        Answer - part-3
        ChromeDriver driver = new ChromeDriver();
////        RemoteWebDriver driver = new ChromeDriver();
//        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        System.out.println("Title of website is : " +driver.getTitle());
        System.out.println("URL of website is : " + driver.getCurrentUrl());

//        Answer - part-4

        WebElement cartButton = driver.findElement(By.xpath("//button[@type=\"button\"]"));
        System.out.println(cartButton.isDisplayed());
        System.out.println(cartButton.isEnabled());
        System.out.println(cartButton.isSelected());

        WebElement Radiobutton = driver.findElement(By.xpath("//input[@id=\"pollanswers-3\"]"));
        System.out.println("It should be false : "+Radiobutton.isSelected());
        Radiobutton.click();
        System.out.println("It should be True : " +Radiobutton.isSelected());

//        Answer - part-5
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.navigate().back();
//        driver.navigate().refresh();
//        driver.navigate().forward();
        driver.navigate().to("https://www.youtube.com/");

//        Answer - part-6
        WebElement Links = driver.findElement(By.xpath("//div[@class=\"footer-upper\"]//a"));
        System.out.println(Links.getText());

        List<WebElement>Links2 = driver.findElements(By.xpath("//div[@class=\"footer-upper\"]//a"));
        System.out.println(Links2.size());

        for (WebElement eem : Links2)
            System.out.println(eem.getText());

//        Answer - part-7
        driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
        WebElement email1 = driver.findElement(By.cssSelector("input.email"));
        WebElement email2 = driver.findElement(By.cssSelector("input.email[type=\"email\"]"));
        WebElement email3 = driver.findElement(By.id("Email"));
        WebElement email4 = driver.findElement(By.name("Email"));

        System.out.println(email1.getAttribute("value"));
        System.out.println(email2.getAttribute("value"));
        System.out.println(email3.getAttribute("value"));
        System.out.println(email4.getAttribute("value"));
        email1.clear();
        email1.sendKeys("vinay@gmail.com");

        WebElement button = driver.findElement(By.xpath("//*[@type=\"submit\"]"));
        System.out.println(button.getText());



    }
}
