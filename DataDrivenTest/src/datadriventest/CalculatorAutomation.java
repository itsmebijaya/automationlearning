/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datadriventest;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author bijayakhatiwada
 */
public class CalculatorAutomation {

    public static void main(String[] args) throws Exception {

        // Load the driver
        System.setProperty("webdriver.gecko.driver", "/Users/bijayakhatiwada/Desktop/Desktop – Bijayas MacBook Pro/Java/geckodriver");

        // Create a webdriver object
        WebDriver driver = new FirefoxDriver();

        // Launch the browser and webpage
        driver.get("https://www.calculatestuff.com/financial/simple-interest-calculator");

        // Read the file from where data are going to be driven
        FileInputStream file = new FileInputStream("/Users/bijayakhatiwada/Desktop/Desktop – Bijayas MacBook Pro/Java/Data Driven Excel Sheets/Simple Interest.xlsx");

        //Read a workbook
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        //Read a sheet
        XSSFSheet sheet = workbook.getSheet("Sheet 1");

        int rowCount = sheet.getLastRowNum();
        
        System.out.println("The rowCount is "+rowCount);

        for (int i = 1; i <= rowCount; i++) {

            XSSFRow currentRow = sheet.getRow(i);

            int principal = (int) currentRow.getCell(0).getNumericCellValue();
            int time = (int) currentRow.getCell(1).getNumericCellValue();
            int rate= (int) currentRow.getCell(2).getNumericCellValue();
            
            double amount=currentRow.getCell(5).getNumericCellValue();
            
            String frequency = currentRow.getCell(2).getStringCellValue();
            
            // Send the value to the application
            driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(String.valueOf(principal));
            driver.findElement(By.xpath("//input[@id='interest_rate']")).sendKeys(String.valueOf(time));
            driver.findElement(By.xpath("//input[@id='term']']")).sendKeys(String.valueOf(principal));
            
            
            driver.findElement(By.xpath("//input[@id='calculate-button']")).click();
            
            WebElement calValue= driver.findElement(By.xpath("//span[contains(text(),'Interest')]"));
            String temp=calValue.toString();
            double calculatedValue=Integer.parseInt(temp);
            
            if(amount==calculatedValue){
                System.out.println("Test passed");
        }
            else{
                System.out.println("Test failed");
            }

        }

    }

}
