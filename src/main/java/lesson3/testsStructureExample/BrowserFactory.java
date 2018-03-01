package lesson3.testsStructureExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class BrowserFactory {
    public WebDriver driver;

    @BeforeTest
    public void setUp(){
        driver = new ChromeDriver();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
