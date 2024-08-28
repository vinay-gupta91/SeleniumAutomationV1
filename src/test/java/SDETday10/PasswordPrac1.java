package SDETday10;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class PasswordPrac1 {

    @Test
    public void passwordMethods(){

        String pass = "admin123";
        int a= 124322;

        byte[] encodedString = Base64.encodeBase64(pass.getBytes());
        System.out.println("encoded string is : " + new String(encodedString) );

        byte[] decodedString = Base64.decodeBase64(encodedString);
        System.out.println("decoded string is : " + new String(decodedString) );


    }

    public static String encryptedPass() {

        String ActualPass = "admin123";

        byte[] encodedString = Base64.encodeBase64(ActualPass.getBytes());
        byte[] decodedString = Base64.decodeBase64(encodedString);
        return new String(decodedString);

    }


    public static void TakeScreenshot(WebElement ele, String scrShotName) throws IOException {
        File src = ele.getScreenshotAs(OutputType.FILE);
        File dest = new File(".\\sreenshots\\"+scrShotName+"");
        FileUtils.copyFile(src,dest);

    }
}
