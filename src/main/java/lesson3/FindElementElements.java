package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementElements {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/webDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.imdb.com/chart/top");
        WebElement element = driver.findElement(By.cssSelector(".lister-list tr"));
        System.out.println(element.getText());

        driver.get("http://www.imdb.com/chart/top");
        List<WebElement> elements = driver.findElements(By.cssSelector(".lister-list tr"));
        for(WebElement element1 : elements)
            System.out.println(element1.getText());
        driver.quit();
    }

}
