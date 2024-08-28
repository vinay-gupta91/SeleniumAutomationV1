package SDETday3;

import org.checkerframework.checker.units.qual.C;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.in");

        List<WebElement> Links1 = driver.findElements(By.tagName("a"));
        System.out.println(Links1.size());

//        for (WebElement a: Links1){                     //Method-1
//            String s = a.getAttribute("href");
//            System.out.println(s);
//        }
//        for (int i= 0; i<Links1.size();i++ ){             // Method -2
//            String s= Links1.get(i).getAttribute("href");
//            System.out.println(s);
//        }

        int i =0;
        int j= 0;
        for (WebElement link : Links1){
            String a = link.getAttribute("href");
            if (a== null || a.isEmpty()){
                i = i + 1;
            }
            else {
                System.out.println(a);
                j=j+1;
            }
        }
        System.out.println("Total Broken links : " + i);
        System.out.println("Total Working links: " + j);

    }
}
