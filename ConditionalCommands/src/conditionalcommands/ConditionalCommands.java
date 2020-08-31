/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalcommands;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 *
 * @author bijayakhatiwada
 */
public class ConditionalCommands {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // Load the firefox webdriver to the project
        System.setProperty("webdriver.gecko.driver", "/Users/bijayakhatiwada/Desktop/Desktop – Bijayas MacBook Pro/Java/geckodriver");
        
        // Create an object of webdriver
        WebDriver driver=new FirefoxDriver();
        
        // Launch the website
        driver.get("https://pathao.com/np/earn-with-bike/");
        
        // Get the element through XPath
        WebElement email=driver.findElement(By.xpath("//input[@id='first_name']"));
        
        WebElement number=driver.findElement(By.xpath("//input[@id='last_name']"));
        
        if(email.isDisplayed() && email.isEnabled()){
           email.sendKeys("bijayakhatiwada@yahoo.com");
        }
        
        if(number.isDisplayed() && number.isEnabled()){
            number.sendKeys("9849092876");
        }
        
 
        
        Boolean rider=driver.findElement(By.xpath("//label[contains(text(),'Bike Rider')]")).isSelected();
        
        if(!rider){
            driver.findElement(By.xpath("//label[contains(text(),'Bike Rider')]")).click();
        }
        
        //
        
    }
    
}
