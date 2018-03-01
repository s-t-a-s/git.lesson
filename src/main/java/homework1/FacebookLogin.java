package homework1;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/webDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("+380680417846");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Autotest@2017");
        driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
