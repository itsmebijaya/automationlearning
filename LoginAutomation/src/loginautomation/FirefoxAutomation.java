
import org.openqa.selenium.By;
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
public class FirefoxAutomation {
    
    public static void main(String[] args) {
        
        // Load the firefox webdriver to the project
        System.setProperty("webdriver.gecko.driver", "/Users/bijayakhatiwada/Desktop/Desktop – Bijayas MacBook Pro/Java/geckodriver");
        
        // create an object of webdriver
        WebDriver driver=new FirefoxDriver();
        
        // launch the browser
        driver.get("http://demo.guru99.com/test/newtours/");
        
        // Send - Enter the username
        driver.findElement(By.name("userName")).sendKeys("mercury");
        
        // Send - Enter the password
        driver.findElement(By.name("password")).sendKeys("mercury");
        
        // Login button automation
        driver.findElement(By.name("submit")).click();
        
        String expTitle="Login: Mercury Tours";
        
        String actTitle=driver.getTitle();
        
        if(expTitle.equals(actTitle)){
            System.out.println("Login successful");
        }
        
        else{
            System.out.println("Login failed");
        }
        
        
    }
    
}
