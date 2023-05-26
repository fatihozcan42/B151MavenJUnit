package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumClass {
    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver","/Users/fatihozcan/Documents/Selenium/drives/chromedriver_mac64/chromedriver");
        WebDriver driver = new ChromeDriver();
       // driver.get("https://www.google.com/");

        driver.get("http://techproeducation.com");


    }


}
