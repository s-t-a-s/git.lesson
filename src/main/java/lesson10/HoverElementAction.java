package lesson10;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.interactions.Actions;

public class HoverElementAction {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.imdb.com/");
        WebElement elem = driver.findElement(By.cssSelector("#consumer_main_nav #navNameMenu"));
        Actions actions = new Actions(driver);
        actions.moveToElement(elem).perform();
        Thread.sleep(5000);
        driver.quit();
    }
}
