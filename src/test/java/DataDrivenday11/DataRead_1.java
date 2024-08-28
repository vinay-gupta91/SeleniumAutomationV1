package DataDrivenday11;

import org.apache.poi.xssf.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataRead_1 {

    public static void main(String[] args) throws IOException {

//        Locate File > Read File > workbook > sheet > Cell > row

        File LocateFile = new File("F:\\Practice Folder\\SampleFile.xlsx");
        FileInputStream ReadFile = new FileInputStream(LocateFile);

        XSSFWorkbook ExcelBook = new XSSFWorkbook(ReadFile);
        XSSFSheet ExcelSheet = ExcelBook.getSheetAt(0);

        int rows = ExcelSheet.getLastRowNum()+1;
        int columns =ExcelSheet.getRow(0).getLastCellNum();

        System.out.println("total rows: "+ rows);
        System.out.println("total column: "+ columns);

        for (int i=1; i<rows; i++){
            for (int j=0; j<columns; j++){
                XSSFCell CellData = ExcelSheet.getRow(i).getCell(j);
                System.out.print(CellData + "\t");                //or
//                Object CellData = ExcelSheet.getRow(i).getCell(j);
//                System.out.print(CellData+ "\t");
            }
            System.out.println();
        }
        ExcelBook.close();

    }
}
