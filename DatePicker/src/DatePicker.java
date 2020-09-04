
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bijayakhatiwada
 */
public class DatePicker {

    public static void main(String[] args) {

        // Load the driver
        System.setProperty("webdriver.gecko.driver", "/Users/bijayakhatiwada/Desktop/Desktop – Bijayas MacBook Pro/Java/geckodriver");

        // Create an object of the driver
        WebDriver driver = new FirefoxDriver();

        // Launch the browser and website
        driver.get("https://fs10.formsite.com/9orlOs/flqywgtvcs/index.html?1599209286649");

        // Click the calendar icon
        driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();

//        // To insert the future date
//        
//        
//        
//        for(int i=9;i<=12;i++){
//            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
//            String m=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//            System.out.println(m);
//            
//            if(m.equalsIgnoreCase("December")){
//                driver.findElement(By.linkText("17")).click();
//                break;
//            }
//        }
        // To insert the future date
        
        Select year=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
        year.selectByVisibleText("1990");
        for (int i = 8; i >= 1; i--) {
            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
            String m = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            System.out.println(m);

            if (m.equalsIgnoreCase("March")) {
                driver.findElement(By.linkText("17")).click();
            }

        }

    }

}
