package SDETday3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class HandleWindows {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
//        String winID= driver.getWindowHandle();
//        System.out.println(winID);
        Thread.sleep(4000);

        WebElement a = driver.findElement(By.xpath("//a[contains(text(), \"OrangeHRM\")]"));
        a.click();

        Set<String> WinIDS = driver.getWindowHandles();
        List<String> Ids = new ArrayList(WinIDS);

//        Method -1
        String ParentID = Ids.get(0);
        String childID = Ids.get(1);

        System.out.println("This is parent ID"+ ParentID);
        System.out.println("This is child ID"+ childID);

//        Switch to windows
        driver.switchTo().window(ParentID);
        System.out.println("Parent window title "+ driver.getTitle());
        driver.switchTo().window(childID);
        System.out.println("Child window title"+ driver.getTitle());



//        Method-2


        for (String WebID: WinIDS) {
            String title = driver.switchTo().window(WebID).getTitle();
            System.out.println(WebID);
            System.out.println(driver.getTitle());
            System.out.println(title);
        }


        Thread.sleep(3000);
        driver.close();
//        driver.quit();
    }
}
