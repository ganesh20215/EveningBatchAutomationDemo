package testng.parallelexecution;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;

public class DataProviderAnnotationExample {

    public static WebDriver driver;

    @DataProvider(name = "excel-data")
    public Object[][] dataProviderFun() {
        Object[][] arrObj = getExcelData("C:\\Users\\ganesh.jadhav\\OneDrive - Emtec Inc\\Desktop\\publish_events\\TestDataEveningBatch.xlsx", "DataSet2");
        return arrObj;
    }

    public String[][] getExcelData(String fileName, String sheetName) {
        String[][] data = null;
        try {
            FileInputStream file = new FileInputStream(fileName);
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheet(sheetName);
            XSSFRow row = sheet.getRow(0);
            int noOfRows = sheet.getPhysicalNumberOfRows();
            int noOfCols = row.getLastCellNum();
            Cell cell;
            data = new String[noOfRows - 1][noOfCols];

            for (int i = 1; i < noOfRows; i++) {
                for (int j = 0; j < noOfCols; j++) {
                    row = sheet.getRow(i);
                    cell = row.getCell(j);
                    data[i - 1][j] = cell.getStringCellValue();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

    @BeforeMethod
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ganesh.jadhav\\Downloads\\chromedriver_win32 (4)\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "excel-data")
    public void dataProviderTest(String keyword1, String keyword2) {
        WebElement element = driver.findElement(By.name("q"));
        element.sendKeys(keyword1, keyword2);
        element.sendKeys(Keys.ENTER);
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }
}
