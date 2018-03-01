package homework3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class LiniaKino {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://liniakino.com/showtimes/aladdin/");
        //driver.findElement(By.xpath("//*[@id='closeButton']")).click();
        driver.findElement(By.xpath("//a[text()='Зоряні війни: Останні джедаї']/../following::a[1]")).click();
        WebElement iframeElem = driver.findElement(By.xpath("//*[@id=\"vkino-widget\"]/iframe"));
        driver.switchTo().frame(iframeElem); // Переключится на frame
        int a = driver.findElements(By.xpath("//*[@id=\"hall-scheme-container\"]/div//div")).size();
        int b = driver.findElements(By.xpath("//*[@id=\"hall-scheme-container\"]/div//div[@class=\"seat seat-occupied\"]")).size();
        int c = driver.findElements(By.xpath("//*[@id=\"hall-scheme-container\"]/div//div[@class=\"seat seat-color1\"]")).size();
        System.out.println("Кол-во мест в зале " + a);
        System.out.println("Кол-во мест занятых " + b);
        System.out.println("Кол-во мест свободных " + c);
        double d = b*100/a;
        if (d*10%10 < 5) System.out.println("% Занятых мест от “всего мест в зале” " + ((int)d) + "%");
        if (d*10%10 >= 5) System.out.println("% Занятых мест от “всего мест в зале” " + ((int)++d) + "%");
        double e = 100-d;
        if (e*10%10 < 5) System.out.println("% Свободных мест от “всего мест в зале” " + ((int)e) + "%");
        if (e*10%10 >= 5) System.out.println("% Свободных мест от “всего мест в зале” " + ((int)++e) + "%");
        driver.quit();
    }
}