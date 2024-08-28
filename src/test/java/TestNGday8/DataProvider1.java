package TestNGday8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataProvider1 {

    @DataProvider(name = "SearchData1")
    public Object[][] searchData(){
        Object search[][] = new Object[3][2];
        search[0][0] = "Delhi";
        search[0][1] = "Red Rort";
        search[1][0] = "Agra";
        search[1][1] = "Taj Mahal";
        search[2][0] = "Hyderabad";
        search[2][1] = "Charminar";
        return search;

    }

    @Test(dataProvider = "SearchData1" )
    public void googleSearch(String Country , String Place) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]"));
        searchBox.sendKeys(Country + " " + Place);
        Thread.sleep(1000);
        WebElement searchButton = driver.findElement(By.xpath("//input[@name=\"btnK\" and @value=\"Google Search\"]"));
        searchButton.click();
        Thread.sleep(2000);
        driver.quit();
    }

}
