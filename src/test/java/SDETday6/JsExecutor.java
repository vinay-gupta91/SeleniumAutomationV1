package SDETday6;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class JsExecutor {
    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver = new ChromeDriver();
//        driver.get("https://demo.nopcommerce.com/");
//        driver.manage().window().maximize();
//        Thread.sleep(2000);


        //  Draw Border
//        WebElement logo = driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
//        JsExecutorUtil.jsDrawBorder(logo, driver);

        TakesScreenshot ts = (TakesScreenshot)driver;
        File src= ts.getScreenshotAs(OutputType.FILE);
        File trg= new File(".\\sreenshots\\title.png");
//        FileUtils.copyFile(src, trg);
//
//        //  Get title
//        String title = JsExecutorUtil.jsGetTitle(driver);
//        System.out.println(title);

//        // click on link
//        WebElement login = driver.findElement(By.xpath("//a[@class=\"ico-login\"]"));
//        JsExecutorUtil.jsClick(login, driver);

//        //  send alert to webapp
//        JsExecutorUtil.jsAlert("hello vinay", driver);

        // scroll the page
//        JsExecutorUtil.jsScrollDown(driver);
//        Thread.sleep(3000);
//        JsExecutorUtil.jsScrollUp(driver);
//        JsExecutorUtil.jsScroll(driver);

//        WebElement link = driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[1]/strong"));
//        JsExecutorUtil.jsScrollToElement(link, driver);


    }
}
