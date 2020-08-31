
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
public class ChromeAutomation {
    
    public static void main(String[] args) {
        
        // Loading the webdriver
        System.setProperty("webdriver.chrome.driver", "/Users/bijayakhatiwada/Desktop/Desktop – Bijayas MacBook Pro/Java/chromedriver");
        
        // Creating an object of Webdriver
        WebDriver driver= new ChromeDriver();
        
        // Entering the url
        driver.get("http://demo.guru99.com/test/newtours/");
        
        // Maximize the browser
        driver.manage().window().maximize();
        
        // Entering the username
        driver.findElement(By.name("userName")).sendKeys("mercury");
        
        //Enter the password
        driver.findElement(By.name("password")).sendKeys("mercury");
        
        //Click the login button
        driver.findElement(By.name("submit")).click();
        
        // Title Check
        
        String expectedTitle="Login: Mercury Tours";
        
        String actualTitle=driver.getTitle();
        
        System.out.println(actualTitle);
        
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Test is passed");
        }
        
        else{
            System.out.println("Test is failed");
        }
        
        driver.close();
        
    }
    
}
