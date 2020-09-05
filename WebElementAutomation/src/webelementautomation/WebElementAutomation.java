/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webelementautomation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author bijayakhatiwada
 */
public class WebElementAutomation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {

        // Load the webdriver into the system
        System.setProperty("webdriver.chrome.driver", "/Users/bijayakhatiwada/Desktop/Desktop – Bijayas MacBook Pro/Java/chromedriver");

        // Create an object of webdriver
        WebDriver driver = new ChromeDriver();
        
        
        // Open the browser and launch the website
        driver.get("http://demo.automationtesting.in/Register.html");

        // Enter the data into the fields
        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Bijaya");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Khatiwada");

        driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("Pragatinagar-12, Satungal, Kathmandu");
        driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("bijayakhatiwada@yahoo.com");
        driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("9849092548");

        WebElement male = driver.findElement(By.xpath("//label[1]//input[1]"));
        if (!male.isSelected()) {
            male.click();
        }

        WebElement cricket = driver.findElement(By.id("checkbox1"));
        if (!cricket.isSelected()) {
            cricket.click();
        }

        WebElement movies = driver.findElement(By.id("checkbox2"));
        if (!movies.isSelected()) {
            movies.click();
        }

        WebElement hockey = driver.findElement(By.id("checkbox3"));
        if (!hockey.isSelected()) {
            hockey.click();
        }


        driver.findElement(By.id("msdd")).click();
        driver.findElement(By.linkText("Arabic")).click();
        driver.findElement(By.linkText("Croatian")).click();
        
        Select skills = new Select(driver.findElement(By.xpath("  //select[@id='Skills']")));
        skills.selectByVisibleText("Java");

        Select countries = new Select(driver.findElement(By.xpath("  //select[@id='countries']")));
        countries.selectByVisibleText("Nepal");

        driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--single']")).click();
        driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("Australia");
        driver.findElement(By.className("select2-results__option")).click();

        Select year = new Select(driver.findElement(By.xpath("//select[@id='yearbox']")));
        year.selectByVisibleText("1990");

        Select month = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
        month.selectByVisibleText("September");

        Select day = new Select(driver.findElement(By.xpath("//select[@id='daybox']")));
        day.selectByVisibleText("19");

        driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Norway123");
        driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Norway123");

        driver.findElement(By.xpath("//button[@id='submitbtn']")).submit();

    }

}
