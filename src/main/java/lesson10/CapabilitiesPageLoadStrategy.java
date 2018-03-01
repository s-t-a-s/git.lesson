package lesson10;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CapabilitiesPageLoadStrategy {
    public static void main(String[] args) {
        WebDriver driver;
        ChromeOptions options = new ChromeOptions();
        options.setCapability("pageLoadStrategy", "none");
        driver = new ChromeDriver(options);
        driver.get("https://kismia.com");
    }
}
