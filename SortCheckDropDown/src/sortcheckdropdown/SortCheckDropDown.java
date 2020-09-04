/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortcheckdropdown;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author bijayakhatiwada
 */
public class SortCheckDropDown {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Load the webdriver into the project
        System.setProperty("webdriver.chrome.driver", "/Users/bijayakhatiwada/Desktop/Desktop – Bijayas MacBook Pro/Java/chromedriver");
        
        
        // Create an object of webdriver
        WebDriver driver=new ChromeDriver();
        
        // Open the browser and launch the url
        driver.get("http://testautomationpractice.blogspot.com/");
        
        // Find the element
        WebElement element=driver.findElement(By.id("animals"));
        Select select=new Select(element);
        List<WebElement> options=select.getOptions();
        
        // Create two list original and temporary
        List originalList=new ArrayList();
        List tempList=new ArrayList();
        
        // Assign value of drop-down to both of the list
        
        for(WebElement e:options){
           tempList.add(e.getText());
           originalList.add(e.getText());
        }
        
        System.out.println("Original List before sorting :"+originalList);
        System.out.println("Temporary List before sorting :"+tempList);
        
        // Sort the list of temporary list
        Collections.sort(tempList);
        
         System.out.println("Original List before sorting :"+originalList);
        System.out.println("Temporary List before sorting :"+tempList);
        
        if(tempList.equals(originalList)){
            System.out.println("The drop down list is sorted");
        }
        else{
            System.out.println("The drop down list is not sorted");
        }
    }
    
}
