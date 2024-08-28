package SDETday2;

import net.bytebuddy.TypeCache;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingDrpdwnmain {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://www.twoplugs.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()= 'Live Posting']")).click();

        WebElement options1= driver.findElement(By.xpath("//select[@name=\"category_id\"]"));
        Select options2 =new Select(options1);
        List<WebElement> options3 = options2.getOptions();
        System.out.println(options3.size());
        ArrayList tempList= new ArrayList();
        ArrayList originalList= new ArrayList();

        for (WebElement option4: options3){
            String option5 = option4.getText();
            tempList.add(option5);
            originalList.add(option5);
        }
        Collections.sort(tempList);
        System.out.println("temporary list - "+tempList);

        System.out.println(tempList.get(2));
        System.out.println("original List - "+originalList);

        // wrong method for this list
//        if (tempList.equals(originalList)){
//            System.out.println("sorting is ok");
//        }
//        else {
//            System.out.println("sorting is not ok");
//        }

        // accurate method by myself
        int k =0;
        int l=0;
        for (int i =2;i<tempList.size();i++){
            if (tempList.get(i).equals(originalList.get(i))){
                k=k+1;
            }
            else {
                l=l+1;
            }
        }
        System.out.println("total matches : "+ k);
        System.out.println("total non matches : "+ l);

    }
}
