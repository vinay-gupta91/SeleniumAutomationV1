package DataDrivenday11;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataReadMultiple1 {



    @DataProvider(name = "searchDataProvider")
    public String[][] searchDataExcel() throws IOException {

        File FileName = new File("F:\\Practice Folder\\googleSearch.xlsx") ;
        FileInputStream ReadFile = new FileInputStream(FileName);
        XSSFWorkbook Workbook = new XSSFWorkbook(ReadFile);
        XSSFSheet Worksheet = Workbook.getSheet("google");

        int Rows = Worksheet.getLastRowNum();
        int cells = Worksheet.getRow(0).getLastCellNum();  // or
        String[][] datas = new String[Rows][cells];

        for (int i = 1; i<=Rows; i++){
            for (int j= 0; j<cells; j++){
//                datas[i-1][j] = String.valueOf(Worksheet.getRow(i).getCell(j)); // or
                datas[i-1][j] = (Worksheet.getRow(i).getCell(j).toString());
            }
        }
        return datas;

    }
}
