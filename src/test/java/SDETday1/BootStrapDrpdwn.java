package SDETday1;

import org.openqa.selenium.WebElement;

import java.util.List;

public class BootStrapDrpdwn {

    public static void selectProduct(List<WebElement> ele, String value){

        for (WebElement product : ele ) {
            if (product.getText().equals(value))
            {
                product.click();
                break;
            }
        }

    }
//    No need to create another method for the same logic , as shown below. we can use the same for multiple things
    public static  void selectLink(List<WebElement> ele2, String value2){
        for (WebElement Link : ele2 ) {
            if (Link.getText().equals(value2))
            {
                Link.click();
                break;
            }
        }
    }
}
