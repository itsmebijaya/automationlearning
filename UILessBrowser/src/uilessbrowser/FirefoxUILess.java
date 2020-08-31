/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headlessbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 *
 * @author bijayakhatiwada
 */
public class FirefoxUILess {
    
    public static void main(String[] args) {
        
        // Load the driver
        System.setProperty("webdriver.gecko.driver", "/Users/bijayakhatiwada/Desktop/Desktop – Bijayas MacBook Pro/Java/geckodriver");
        
        //UILess Browser Object
        FirefoxOptions options=new FirefoxOptions();
        options.setHeadless(true);
        
        // Create an object of firefox driver
        WebDriver driver=new FirefoxDriver(options);
        
        // Launch the browser
        driver.get("https://www.nopcommerce.com/en");
        
        // Get the url of the landing page
        String url= driver.getCurrentUrl();
        
        // Get the title of landing page
        String title=driver.getTitle();
        
        System.out.println("The url of the landing page is "+url);
        System.out.println("The title of the  page is "+title);
        
        
    }
    
}
