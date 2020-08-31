/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datadriventest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author bijayakhatiwada
 */
public class AutomatedRegistration {

    public static void main(String[] args) throws FileNotFoundException, IOException {

        // Load the driver into the project/
        System.setProperty("webdriver.gecko.driver", "/Users/bijayakhatiwada/Desktop/Desktop – Bijayas MacBook Pro/Java/geckodriver");

        // Create a webdriver object
        WebDriver driver = new FirefoxDriver();

        // Launch the website 
        driver.get("http://demo.guru99.com/test/newtours/index.php");

        // ---- Reading the data from the excel file -----
        // Load the file to be read
        FileInputStream file = new FileInputStream("/Users/bijayakhatiwada/Desktop/Desktop – Bijayas MacBook Pro/Java/Data Driven Excel Sheets/Registration Form.xlsx");

        // Load the workbook
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        // Load the sheet of the workbook
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        // Number of rows
        int rowCount = sheet.getLastRowNum();

        // Run the loop to get the data of each row and cell of each row
        for (int i = 1; i <= rowCount; i++) {
            XSSFRow currentRow = sheet.getRow(i);

            String firstname = currentRow.getCell(0).getStringCellValue();
            String lastname = currentRow.getCell(1).getStringCellValue();
            int phone = (int) currentRow.getCell(2).getNumericCellValue();
            String email = currentRow.getCell(3).getStringCellValue();
            String city = currentRow.getCell(4).getStringCellValue();

            String address = currentRow.getCell(5).getStringCellValue();
            String state_province = currentRow.getCell(6).getStringCellValue();
            int postal_code = (int) currentRow.getCell(7).getNumericCellValue();
            String country = currentRow.getCell(8).getStringCellValue();
            String username = currentRow.getCell(9).getStringCellValue();
            String password = currentRow.getCell(10).getStringCellValue();
            String confirm_password = currentRow.getCell(11).getStringCellValue();

            System.out.println("The password is " + password + " and confirm_password is" + confirm_password);
            System.out.println("First name is" + firstname);

            // Click register to open the form
            driver.findElement(By.linkText("REGISTER")).click();

            //  send the corresponding data to webpage
            // Send the data
            driver.findElement(By.name("firstName")).sendKeys(firstname);
            driver.findElement(By.name("lastName")).sendKeys(lastname);
            driver.findElement(By.name("phone")).sendKeys(String.valueOf(phone));
            driver.findElement(By.name("userName")).sendKeys(email);
            driver.findElement(By.name("address1")).sendKeys(city);
            driver.findElement(By.name("city")).sendKeys(address);
            driver.findElement(By.name("state")).sendKeys(state_province);
            driver.findElement(By.name("postalCode")).sendKeys(String.valueOf(postal_code));

            WebElement dropcountry = driver.findElement(By.name("country"));
            dropcountry.sendKeys(country);

            driver.findElement(By.name("email")).sendKeys(username);
            driver.findElement(By.name("password")).sendKeys(password);
            driver.findElement(By.name("confirmPassword")).sendKeys(confirm_password);

            // Submit the data
            driver.findElement(By.name("submit")).click();

            if (driver.getPageSource().contains("Thank you for registering")) {
                System.out.println("Registration completed for " + currentRow + " count");
            } else {
                System.out.println("Registration failed for " + currentRow + " count");
            }
        }
        
        System.out.println("Registration completed");
    }

}
