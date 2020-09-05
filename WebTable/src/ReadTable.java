
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
public class ReadTable {
    
    public static void main(String[] args) {
        
        // Load the web driver
        System.setProperty("webdriver.gecko.driver", "/Users/bijayakhatiwada/Desktop/Desktop – Bijayas MacBook Pro/Java/geckodriver");
        
        // Create an webdriver object
        WebDriver driver=new FirefoxDriver();
        
        // Launch the brower and url
        driver.get("http://demo.guru99.com/test/web-table-element.php");
        
        int r=driver.findElements(By.xpath("/html/body/div/div[3]/div[1]/table/tbody/tr")).size();
        int c=driver.findElements(By.xpath("/html/body/div/div[3]/div[1]/table/thead/tr/th")).size();
        
        System.out.println("The number of row is "+r);
        System.out.println("The number of column is "+c);
        
        
            for(int j=1;j<=c;j++){
                
           String headerText=driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/table/thead/tr/th["+j+"]")).getText();
                System.out.print(headerText);
                System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println("");
        
        
        for(int i=2;i<=r;i++){
            for(int j=1;j<=c;j++){
                
                String text=driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/table/tbody/tr["+i+"]/td["+j+"]")).getText();
                System.out.print(text);
                System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println("");
        }
        
        
        
    }
}
