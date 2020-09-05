
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
public class SwitchWindowAutomation {
    
    public static void main(String[] args) {
        
        // Load a web driver into the project
        System.setProperty("webdriver.chrome.driver", "/Users/bijayakhatiwada/Desktop/Desktop – Bijayas MacBook Pro/Java/chromedriver");
        
        // Create an object of Webdriver
        WebDriver driver=new ChromeDriver();
        
        // Open the browser and open the url
       driver.get("http://demo.automationtesting.in/Windows.html");
       
       // Open the new window
       driver.findElement(By.xpath("//a[contains(text(),'Open New Seperate Windows')]")).click();
       
       driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
       
       Set<String> s=driver.getWindowHandles();
       
       for(String i:s){
           System.out.println(i);
           String t=driver.switchTo().window(i).getTitle();
           
           if(t.contains("SeleniumHQ Browser ")){
              driver.close();
               System.out.println("Closed child window");
           }
       }
        
    }
    
}
