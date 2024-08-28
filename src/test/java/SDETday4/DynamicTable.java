package SDETday4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class DynamicTable {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions settings = new ChromeOptions();
        settings.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(settings);
        driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
        driver.manage().window().maximize();

        driver.findElement(By.name("username")).sendKeys("demo");
        driver.findElement(By.name("password")).sendKeys("demo");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

//        driver.switchTo().alert().dismiss(); // cancel by manual
        Thread.sleep(5000);
        driver.findElement(By.xpath("//li[@id=\"menu-sale\"]/a")).click();
        driver.findElement(By.xpath("//li[@id=\"menu-sale\"]//a[text()= \"Orders\"]")).click();


        String totalPages = driver.findElement(By.xpath("//div[@class=\"col-sm-6 text-end\"]")).getText();
        System.out.println(totalPages);
        Integer pageCount = Integer.parseInt(totalPages.substring(totalPages.indexOf("(")+1,totalPages.indexOf("Pages")-1));
        System.out.println("Total page count : "+ pageCount);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9));

        for (int r=1 ; r<5; r++) {
            Thread.sleep(2000);
            WebElement page = driver.findElement(By.xpath("//ul[@class=\"pagination\"]/li/span"));
            List<WebElement> pageChange = driver.findElements(By.xpath("//table[@class=\"table table-bordered table-hover\"]//tbody//tr"));
            System.out.println("Active pageno." + page.getText() + "  " + "Total Records" + pageChange.size());
            for (int p = 1; p < pageChange.size(); p++) {
                String customer = driver.findElement(By.xpath("//tbody/tr[" + p + "]/td[3]")).getText();
                String status = driver.findElement(By.xpath("//tbody/tr[" + p + "]/td[4]")).getText();
                String total = driver.findElement(By.xpath("//tbody/tr[" + p + "]/td[5]")).getText();
                System.out.println(customer + " " + status + " " + total);
            }
            String pageNumber = Integer.toString(r + 1);
            driver.findElement(By.xpath("//ul[@class=\"pagination\"]//li/a[text()= '" + pageNumber + "']")).click();
        }


            // another method by myself to print all data on all pages

//            for (int k= 1; k<=c;k++){
//                System.out.println("page no."+ k);
//                for (int i = 1; i< row.size();i++){
//                    for (int j = 1; j< column.size();j++){
//                        WebElement d = driver.findElement(By.xpath("//div[@class=\"table-responsive\"]/tr["+i+"]/td["+j+"]"));
//                        System.out.print(d.getText() + " || ");
//                    }
//                    System.out.println();
//                }
//                driver.findElement(By.xpath("//span[@class=\"page-link\"]//parent::li//following-sibling::li[1]")).click();
//                Thread.sleep(3000);
//            }
        driver.quit();

    }
}
