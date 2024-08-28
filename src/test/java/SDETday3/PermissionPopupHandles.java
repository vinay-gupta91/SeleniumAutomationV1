package SDETday3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PermissionPopupHandles {
    public static void main(String[] args) {

        ChromeOptions settings = new ChromeOptions();
        settings.addArguments("--disable-notifications");

        WebDriver driver = new ChromeDriver(settings);

        driver.get("https://www.googleadservices.com/pagead/aclk?sa=L&ai=DChcSEwixwYXC-PmAAxWOQUgAHfsfA40YABAAGgJjZQ&gclid=CjwKCAjwxaanBhBQEiwA84TVXNyqf3jJkDKdzUjR6kF-pp65TacgNNz1pF7WabDV7gT53tdzbUz_OhoCDkkQAvD_BwE&ei=e7zpZIO2BcS84-EP6awV&ohost=www.google.com&cid=CAESauD2NkI-gUAV5bYfQCI-LAD8R85TlKsHa87_8pWR0H2y9X71r0GaAuvYwMk3yWdhq-WcY7DtAJlG_EPWS_LwF8qqz_5meZErAC4g6MmZMte9ILKURRup43MX8OChAMgBelrtByfh4yU2bwA&sig=AOD64_2scCLZuE5QjDPX99c8YbExXjXnbw&q&sqi=2&adurl&ved=2ahUKEwjD3_TB-PmAAxVE3jgGHWlWBQAQ0Qx6BAgPEAE");
        driver.manage().window().maximize();


    }
}
