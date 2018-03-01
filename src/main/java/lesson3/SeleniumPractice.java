package lesson3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumPractice {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriver driver1 = new FirefoxDriver();
        WebDriver driver2 = new InternetExplorerDriver();
        driver.get("http://www.google.com");
        driver1.get("http://www.google.com");
        driver2.get("http://www.google.com");

    }
}
