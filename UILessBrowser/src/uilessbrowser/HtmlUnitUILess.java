/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uilessbrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 *
 * @author bijayakhatiwada
 */
public class HtmlUnitUILess {
    
    public static void main(String[] args) {
        
        // No special driver required / just add HtmlUnit jar files to the project
        
        WebDriver driver=new HtmlUnitDriver();
        
        // Launch the browser
        driver.navigate().to("https://www.nopcommerce.com/en");
        
        // Get the title of the landing page
        String title=driver.getTitle();
        
        //Get the url of the landing page
        String url=driver.getCurrentUrl();
        
        System.out.println("The title of the page is :"+title);
        System.out.println("The url of the page is :"+url);
        
        
    }
    
}
