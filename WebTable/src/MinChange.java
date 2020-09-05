
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
public class MinChange {
    
    public static void main(String[] args) {
        
        // Load the driver into the project
        System.setProperty("webdriver.gecko.driver", "/Users/bijayakhatiwada/Desktop/Desktop – Bijayas MacBook Pro/Java/geckodriver");
        
        // Create a webdriver object
        WebDriver driver=new FirefoxDriver();
        
        // Open the browser and launch the website
        driver.get("http://demo.guru99.com/test/web-table-element.php");
        
        //  Find the number of rows
        int rows=driver.findElements(By.xpath("/html/body/div/div[3]/div[1]/table/tbody/tr")).size();
        System.out.println("The number of row is "+rows);
        
        double num[] =new double[rows]; 
        
        for(int i=2;i<=rows;i++){
            String value=driver.findElement(By.xpath("/html/body/div/div[3]/div[1]/table/tbody/tr["+i+"]/td[3]")).getText();
            
            double Value=Double.parseDouble(value);
            
            num[i-2]=Value;
            
            
        }
        

        
        
        double minValue=num[0];
        
        for(int i=1;i<num.length-1;i++){
            if(minValue>num[i]){
                System.out.println("--------------");
                System.out.println(minValue);
                minValue=num[i];
            }
            
        }
        
        
        System.out.println("Result :"+minValue);
    }
    
}
