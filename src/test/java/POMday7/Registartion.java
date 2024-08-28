package POMday7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.Delayed;

public class Registartion {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();
        Thread.sleep(2000);

//        RegistrationPOM1 rp1 = new RegistrationPOM1(driver);
        RegistrationPOM2 rp1 = new RegistrationPOM2(driver);
        rp1.setFirstName("vinay");
        rp1.setLastName("Gupta");
        rp1.setPhone("7911739928");
        rp1.setEmail("test@gmail.com");
        rp1.setAddress("B-block, Kundan Nagar");
        rp1.setCity("delhi");
        rp1.setState("New Delhi");
        rp1.setPostalCode("110007");
        rp1.setCountry("INDIA");
        rp1.setUserName("test@gmail.com");
        rp1.setPassword("qwerty@12345");
        rp1.setConfirmPassword("qwerty@12345");

        Thread.sleep(6000);
        rp1.clickSubmit();

    }
}
