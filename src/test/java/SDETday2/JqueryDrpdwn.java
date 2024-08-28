package SDETday2;

import org.openqa.selenium.WebElement;

import java.util.List;

public class JqueryDrpdwn {

    public static void jqueryoptions(List<WebElement> ele, String... value ){


        if (!value[0].equalsIgnoreCase("all")){
            for (WebElement options: ele){
                String options1 = options.getText();
                for (String val: value){
                    if (options1.equals(val)){
                        options.click();
                    }
                }
            }

        }
        else
        {
            for (WebElement options: ele){
                options.click();
            }
        }
    }
}
