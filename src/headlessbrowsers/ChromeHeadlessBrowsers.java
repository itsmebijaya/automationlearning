/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headlessbrowsers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


/**
 *
 * @author bijayakhatiwada
 */
public class ChromeHeadlessBrowsers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Loading the webdriver
        System.setProperty("webdriver.chrome.driver", "/Users/bijayakhatiwada/Desktop/Desktop – Bijayas MacBook Pro/Java/chromedriver");
        
        ChromeOptions options= new ChromeOptions();
        options.setHeadless(true);
        
        
        // Creating an object of Webdriver
        WebDriver driver= new ChromeDriver(options);
        
        // Launcing the browser
        driver.navigate().to("https://www.nopcommerce.com/en/demo");
        
        //Get the title of the landing webbrowser
        String title=driver.getTitle();
        
        // Get the current url of
        String url=driver.getCurrentUrl();
        
        System.out.println("The tile of the page is"+title);
        System.out.println("The url of the page is"+url);
        
    }
    
    
}
