package homework8;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ZZ {
    String BankURL;
    String pageSource;
    String startUSDBuy;
    String endUSDBuy;

    public static void main(String[] args) {

    }
    private double buyUSD (String BankURL, String startUSDBuy, String endUSDBuy){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(BankURL);
        pageSource = pageSource.substring(pageSource.indexOf(startUSDBuy) + startUSDBuy.length());
        String pbPok1 = pageSource.substring(0, 6);
        double pbPok = Double.parseDouble(pbPok1);
        String pbProd1 = pageSource.substring(9, 15);
        double pbProd = Double.parseDouble(pbProd1);
        return 1;
    }
}
