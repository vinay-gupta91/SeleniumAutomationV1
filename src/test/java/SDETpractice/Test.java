package SDETpractice;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test {

    public static void main(String[] args) throws IOException {

//        locate File > read File > workbook > sheet > row > cell
        File LocateFile = new File("F:\\Practice Folder\\SampleFile.xlsx");
        FileInputStream ReadFile = new FileInputStream(LocateFile);
        XSSFWorkbook Workbook = new XSSFWorkbook(ReadFile);

        XSSFSheet Worksheet = Workbook.getSheetAt(0);
        int Rows = Worksheet.getLastRowNum()+1;
        int Column = Worksheet.getRow(0).getLastCellNum();

        System.out.println("Total Rows : "+ Rows);
        System.out.println("Total Column :"+ Column);


        Object a = Worksheet.getRow(1).getCell(0);
        System.out.println(a);
    }
}
