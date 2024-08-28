package DataDrivenday11;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataRead_2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        File LocateFile = new File("F:\\Practice Folder\\saucelabs.xlsx");
//        String apple = "F:\\Practice Folder\\saucelabs.xlsx";
//        Both above methods we can use or directly send file string location to FileInputStream.
        FileInputStream ReadFile = new FileInputStream(LocateFile);

        XSSFWorkbook ExcelBook = new XSSFWorkbook(ReadFile);
        XSSFSheet ExcelSheet = ExcelBook.getSheetAt(0);        //or
//        XSSFSheet ExcelSheet = ExcelBook.getSheet("Sheetname");

        int rows = ExcelSheet.getLastRowNum()+1;
        int columns =ExcelSheet.getRow(0).getLastCellNum();

        System.out.println("total rows: "+ rows);
        System.out.println("total column: "+ columns);

        for (int i=1; i<rows; i++){
            XSSFCell IdData = ExcelSheet.getRow(i).getCell(0);  // or
            Object PassData = ExcelSheet.getRow(i).getCell(1);
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.saucedemo.com/v1/");
            driver.manage().window().maximize();
            Thread.sleep(2000);

            WebElement userName = driver.findElement(By.name("user-name"));
            userName.sendKeys(IdData.toString());
            WebElement Password = driver.findElement(By.name("password"));
            Password.sendKeys(PassData.toString());
            Thread.sleep(2000);

            WebElement Login = driver.findElement(By.id("login-button"));
            Login.click();
            Thread.sleep(2000);
            driver.close();
        }

    }

}
