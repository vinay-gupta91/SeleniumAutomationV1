package SDETday6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.util.List;

public class Datepicker {

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://dummyflights.com/blog/20/detail/what-is-dummy-ticket-and-how-do-they-work");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement calender = driver.findElement(By.xpath("//input[@name=\"departure_date\"]"));
        JsExecutorUtil.jsScrollToElement(calender, driver);
        Thread.sleep(2000);
        calender.click();

        String month = "Mar";
        String year = "2024";
        String date = "23";

        Thread.sleep(1000);

        // Select Month & year

        while(true) {
            String monthyear = driver.findElement(By.xpath("//div[@class=\"calendar left\"]//th[@class=\"month\"]")).getText();
            String arr[] = monthyear.split(" ");
            String calmonth = arr[0];
            String calyear = arr[1];

            if (month.equalsIgnoreCase(calmonth) && year.equalsIgnoreCase(calyear)) {
                System.out.println("time is found");
                break;
            } else {
                Thread.sleep(1000);
                driver.findElement(By.xpath("//div[@class=\"calendar left\"]//th[@class=\"next available\"]")).click();
                System.out.println("month & year is : " + calmonth + " // " + calyear);
            }
        }


        // Select date

        List<WebElement> dates = driver.findElements(By.xpath("//div[@class=\"calendar left\"]//td"));
        int ss = dates.size();
        System.out.println(ss);
        Assert.assertTrue(ss!=0);
        for (WebElement number:dates) {
            if (number.getText().equals(date)) {
                number.click();
                break;
            }
        }

//    another method by me

//        for (int i = 1; i<12; i++){
//            WebElement month = driver.findElement(By.xpath("//th[@class=\"month\"]"));
//            if (month.getText().contains("Nov")){
//                List<WebElement> calender = driver.findElements(By.xpath("//table[@class=\"table-condensed\"]//tr/td"));
//                for (WebElement cal: calender){
//                    if (cal.getText().equals("15")){
//                        cal.click();
//                        break;
//                    }
//                }
//            }
//            else {
//                WebElement nextButton = driver.findElement(By.xpath("//th[@class=\"next available\"]"));
//                nextButton.click();
//                Thread.sleep(1000);
//            }
//        }

        driver.close();

    }
}
