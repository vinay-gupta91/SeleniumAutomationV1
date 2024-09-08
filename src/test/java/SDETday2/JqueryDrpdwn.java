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

//        2nd Way

        for (WebElement element : ele){
            if (!value[0].toLowerCase().contains("all")){
                for (String input : value){
                    if (element.getText().equals(input)){
                        element.click();
                    }
                }
            }
            else {
                element.click();
            }
        }




    }

}
