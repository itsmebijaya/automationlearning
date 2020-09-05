
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bijayakhatiwada
 */
public class WebTableRead {
    public static void main(String[] args) {
        
        // Load the webdriver
        System.setProperty("webdriver.chrome.driver", "/Users/bijayakhatiwada/Desktop/Desktop – Bijayas MacBook Pro/Java/chromedriver");
   
        // Create an object of webdriver
        WebDriver driver = new ChromeDriver();
        
        // Launch the browser
        driver.get("file:///Users/bijayakhatiwada/Desktop/webtable.html");
        
        int r=driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
        int c=driver.findElements(By.xpath("/html/body/table/tbody/tr/th")).size();
        
        System.out.println("The number of row is "+r);
        System.out.println("The number of column is "+c);
        
        // Run a loop to read each data of the table and display the data
        
        for(int i=2;i<=r;i++){
            for(int j=1; j<=c;j++){
               String elements=driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText();
               
                System.out.print(elements);
                 System.out.print(" ");
                 System.out.print(" ");
                
            }
            System.out.println(" ");
        }
    
    }
    
}
