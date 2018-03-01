/*package lesson10;



import com.gargoylesoftware.htmlunit.javascript.host.file.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;

public class TakesScreenshot {
    
    
    public static void main(String[] args)throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile, new File("/Users/lolik/11zzzz1.png"));
    }

    private File getScreenshotAs(OutputType<File> file) {
    }

}*/
