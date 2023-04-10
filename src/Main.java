import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.support.ui.Select;

public class Main {
    public static void main(String[] args) {


       System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://127.0.0.1:5500/reg_student.html");
        // WebDriver driver = new ChromeDriver();
        // ChromeOptions ops = new ChromeOptions();
        //  ops.addArguments("--remote-allow-origins=*");
        //driver.get("");

      /*  driver.findElement(By.id("UserName")).sendKeys("2021001948");

        driver.findElement(By.id("Password")).sendKeys("pJa@364227");

        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.partialLinkText("College")).click();

        driver.findElement(By.id("asss")).click();
*/
        WebElement dropd = driver.findElement(By.id("cars0"));
        Select select = new Select(dropd);
        select.selectByValue("volvo");


          /* try {
                File file = new File("/Users/jaypatel/IdeaProjects/selenium_new/Book 2.xlsx");   //creating a new file instance
                FileInputStream fis = new FileInputStream(file);   //obtaining bytes from the file
//creating Workbook instance that refers to .xlsx file
                XSSFWorkbook wb = new XSSFWorkbook(fis);
                XSSFSheet sheet = wb.getSheetAt(0);     //creating a Sheet object to retrieve object
                Iterator<Row> itr = sheet.iterator();    //iterating over excel file
                while (itr.hasNext()) {
                    Row row = itr.next();
                    Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column
                    while (cellIterator.hasNext()) {
                        Cell cell = cellIterator.next();
                        switch (cell.getCellType()) {
                            case Cell.CELL_TYPE_STRING:    //field that represents string cell type
                                System.out.print(cell.getStringCellValue() + "\t\t\t");
                                break;
                            case Cell.CELL_TYPE_NUMERIC:    //field that represents number cell type
                                System.out.print(cell.getNumericCellValue() + "\t\t\t");
                                break;
                            default:
                        }
                    }
                    System.out.println("");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
           */


        }


        //driver.findElement(By.id("ContentPlaceHolder1_lstStudentLevelExamForm_lnkPrint_7")).click();


}
