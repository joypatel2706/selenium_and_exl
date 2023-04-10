import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadCellExample {
    public static void main(String[] args) {
        ReadCellExample rc = new ReadCellExample();   //object of the class
//reading the value of 2nd row and 2nd column
              //variable for storing the cell value
        Workbook wb = null;           //initialize Workbook null
        try {
            FileInputStream fis = new FileInputStream("/Users/jaypatel/IdeaProjects/selenium_new/Book 2.xlsx");
            wb = new XSSFWorkbook(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Sheet sheet = wb.getSheetAt(0);   //getting the XSSFSheet object at given index
        Row row = sheet.getRow(2); //returns the logical row
        Cell cell = row.getCell(2); //getting the cell representing the given column
        double value = cell.getNumericCellValue();    //getting cell value
        System.out.println(value);
    }
}