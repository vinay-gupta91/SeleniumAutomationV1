package ProertiesExampleday12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile {
    Properties properties ;
    String path = "C:.\\src\\test\\java\\ProertiesExampleday12\\config.properties";

//    To read Config File
    public ReadConfigFile() throws IOException {

        properties = new Properties();
        FileInputStream ReadF = new FileInputStream(path);
        properties.load(ReadF);
    }

//    To get URl from Config. File
    public String getURL(){
        String url = properties.getProperty("url");
        if (url!= null) {
            return url;
        } else {
            throw new RuntimeException("URL is not Found");
        }
    }

//    To get URl from Config. File
    public String getUserName(){
        String userName = properties.getProperty("username");
        if (userName!= null){
            return userName;
        }
        else {
            throw new RuntimeException("username  is not Found");
        }
    }
    public String getPassWord(){
        String passWord = properties.getProperty("password");
        if (passWord!= null){
            return passWord;
        }
        else {
            throw new RuntimeException("password is not Found");
        }
    }


}
