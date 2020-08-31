
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bijayakhatiwada
 */
public class CloseQuit {
    
    public static void main(String[] args) {
        
        // Load the driver
        System.setProperty("webdriver.gecko.driver", "/Users/bijayakhatiwada/Desktop/Desktop – Bijayas MacBook Pro/Java/geckodriver");
        
        
        // Create an object
        WebDriver driver=new FirefoxDriver();
        
        // Launch the browser
        driver.get("http://www.popuptest.com/popuptest1.html");
        
        // Close the browser - Closes only one browser -
       
        driver.close();
        
        // Closes all the browser
        
        driver.quit();
    }
    
}
