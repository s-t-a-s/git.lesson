package lesson3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBrowserNavigation {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/webDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.get("https://facebook.com");
        System.out.println("CURRENT URL: "+driver.getCurrentUrl());
        driver.navigate().back();
        System.out.println("AFTER .back() URL: "+driver.getCurrentUrl());
        driver.navigate().forward();
        System.out.println("AFTER .forward() URL: "+driver.getCurrentUrl());
        driver.quit();

    }
}
