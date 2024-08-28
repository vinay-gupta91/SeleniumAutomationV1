package SDETday4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class StaticTable {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://learn.microsoft.com/en-us/officeupdates/update-history-microsoft365-apps-by-date ");
        driver.manage().window().maximize();

        List<WebElement> columns = driver.findElements(By.xpath("//table[@aria-label=\"Table 1\"]//tr/th"));
        List<WebElement> rows = driver.findElements(By.xpath("//table[@aria-label=\"Table 1\"]//tbody//tr"));

        System.out.println("no of columns : "+ columns.size() );;
        System.out.println("no. of rows : "+ rows.size());
        Thread.sleep(3000);

//        Get the data from particular row & column
        WebElement secondRow1 = driver.findElement(By.xpath("//table[@aria-label=\"Table 1\"]//tr[2]/td[1]"));
        System.out.println(secondRow1.getText());


//        Generic method to print all data
//        for (int r=1; r<=rows.size();r++)
//            for (int c=1; c<=columns.size();c++){
//                WebElement Data = driver.findElement(By.xpath("//table[@aria-label=\"Table 1\"]//tr["+r+"]/td["+c+"]"));
//                System.out.print(Data.getText() + " ");
//            }
//            System.out.println();
//        }

//        To get particular data
        for (int r=1; r<=rows.size();r++){
            WebElement Data = driver.findElement(By.xpath("//table[@aria-label=\"Table 1\"]//tr["+r+"]/td[2]"));
            if (Data.getText().equals("2306")){
                System.out.println(driver.findElement(By.xpath("//table[@aria-label=\"Table 1\"]//tr["+r+"]/td[3]")).getText());
                System.out.println(driver.findElement(By.xpath("//table[@aria-label=\"Table 1\"]//tr["+r+"]/td[4]")).getText());
            }
        }

    }
}
