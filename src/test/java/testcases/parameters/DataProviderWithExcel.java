package testcases.parameters;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class DataProviderWithExcel {

    // DataProvider to provide test data from Excel
    @DataProvider(name = "testCheck")
    public Object[][] testData() throws IOException {
        // Get the test data from the Excel sheet
        return getExcelSheetData("D:\\Practice Folder\\Excel.xlsx", "Sheet");
    }

    // Method to read data from the Excel file
    public String[][] getExcelSheetData(String filepath, String sheetName) throws IOException {
        // Create a FileInputStream to read the Excel file"
        FileInputStream fileInputStream = new FileInputStream(filepath);

        // Create a workbook instance from the Excel file
        XSSFWorkbook wb = new XSSFWorkbook(fileInputStream);

        // Get the sheet by name
        XSSFSheet sheet = wb.getSheet(sheetName);

        // Get the number of rows in the sheet
        int noOfRows = sheet.getPhysicalNumberOfRows();

        // Get the number of columns in the first row (assuming all rows have the same number of columns)
        int noOfColumns = sheet.getRow(0).getPhysicalNumberOfCells();

        // Create a 2D array to hold the test data
        String[][] data = new String[noOfRows - 1][noOfColumns];

        // Iterate over the rows and columns to populate the data array
        for (int i = 0; i < noOfRows; i++) { // start from 1 to skip the header row
            XSSFRow row = sheet.getRow(i);
            for (int j = 1; j < noOfColumns; j++) {
                Cell cell = row.getCell(j);
                // Read the cell value based on the cell type (assuming string here for simplicity)
             /*  if (cell != null) {
                    data[i - 1][j] = cell.getStringCellValue();
                } else {
                    data[i - 1][j] = ""; // If the cell is empty, assign an empty string
                }*/
            }
        }

        // Close the workbook and return the data
        wb.close();
        return data;
    }

    // Test method using the data provider
    @Test(dataProvider = "testCheck")
    public void verifyGoogleSearch(String courseName, String cityName) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement searchTextbox = driver.findElement(By.name("q"));
        searchTextbox.sendKeys(courseName + " " + cityName); // Combine the course name and city
        searchTextbox.sendKeys(Keys.ENTER);

        Thread.sleep(3000); // Adding a delay to view the results (replace with WebDriverWait in real code)
        driver.quit(); // Close the browser after the test
    }

    }





