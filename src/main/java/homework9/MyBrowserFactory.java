package homework9;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.testng.annotations.AfterSuite;
        import org.testng.annotations.BeforeSuite;
        import java.util.concurrent.TimeUnit;

public class MyBrowserFactory {

    public static WebDriver driver;

    @BeforeSuite
    public void setUp() {
        driver = new ChromeDriver();
//        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        WebElement playBtn = driver.findElement(By.xpath("//a[@class='rouge'][contains(text(),'Играть')]"));
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.elementToBeClickable(playBtn));
//        playBtn.click();
//        wait.ignoring(StaleElementReferenceException.class).until(ExpectedConditions.not(ExpectedConditions.attributeToBe(By.xpath("//a[@class='link matches-game-name show_payment_widget un_redirect_link']"),"data-uid",id)));
    }



    @AfterSuite
    public void tearDown(){
        driver.quit();
    }
}