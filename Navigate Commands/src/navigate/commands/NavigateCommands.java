/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navigate.commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author bijayakhatiwada
 */
public class NavigateCommands {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Load the driver
        System.setProperty("webdriver.gecko.driver", "/Users/bijayakhatiwada/Desktop/Desktop – Bijayas MacBook Pro/Java/geckodriver");

        // Create a driver object
        WebDriver driver = new FirefoxDriver();

        System.out.println("The tile of the page is" + driver.getTitle());
        // Launch the url
        driver.get("http://demo.guru99.com/");

        System.out.println("The tile of the page is" + driver.getTitle());

        // Navigate to
        driver.navigate().to("https://hamrobazaar.com/search.php?do_search=Search&order=&way=&searchword=niu+scooter&catid_search=62&city_search=&e_2=&e_1_from=&e_1_to=&e_4=&e_105_from=&e_105_to=&e_64_from=&e_64_to=&e_65_from=&e_65_to=&e_66_from=&e_66_to=&do_search=Search");
        System.out.println("The tile of the page is" + driver.getTitle());

        // Back
        driver.navigate().back();
        System.out.println("The tile of the page is" + driver.getTitle());

        //Forward
        driver.navigate().forward();
        System.out.println("The tile of the page is" + driver.getTitle());

    }

}
