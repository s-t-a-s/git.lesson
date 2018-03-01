package homework3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
public class CurrencyRates {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.privat24.ua");
        String[] pbPok_Prod = driver.findElement(By.xpath("//div[@class='section-content type'][contains(text(),'ДОЛ')]/parent::div/div[2]")).getText().split("\\s+");
        double pbPok = Double.parseDouble(pbPok_Prod[0]);
        double pbProd = Double.parseDouble(pbPok_Prod[2]);

        driver.get("https://my.ukrsibbank.com/ru/personal/operations/currency_exchange/");
        String usPok1 = driver.findElement(By.xpath("//td[text()='USD, ']/parent::tr/td[2]")).getText();
        String usProd1 = driver.findElement(By.xpath("//td[text()='USD, ']/parent::tr/td[3]")).getText();
        double usPok = Double.parseDouble(usPok1);
        double usProd = Double.parseDouble(usProd1);

        driver.get("https://www.aval.ua/ru/personal/everyday/exchange/exchange/");
        String avPok1 = driver.findElement(By.xpath("//td[@class='name'][contains(text(),'США')]/parent::tr/td[2]")).getText();
        String avProd1 = driver.findElement(By.xpath("//td[@class='name'][contains(text(),'США')]/parent::tr/td[3]")).getText();
        double avPok = Double.parseDouble(avPok1.replace(',', '.'));
        double avProd = Double.parseDouble(avProd1.replace(',', '.'));

        driver.get("http://www.oschadbank.ua/ua/");
        String osPok1 = driver.findElement(By.xpath("//strong[@class='buy-USD']")).getText();
        String osProd1 = driver.findElement(By.xpath("//strong[@class='sell-USD']")).getText();
        double osPok = Double.parseDouble(osPok1.replace(',', '.'));
        double osProd = Double.parseDouble(osProd1.replace(',', '.'));


        driver.get("http://www.bank.gov.ua/control/uk/curmetal/detail/currency?period=daily");
        String nbuPok1 = driver.findElement(By.xpath("//td[contains(text(),'Долар США')]/parent::tr/td[5]")).getText();
        double nbuPok = Double.parseDouble(nbuPok1)/100;
        double nbuProd = nbuPok;



        if (pbPok <= usPok && pbPok <= avPok && pbPok <= osPok && pbPok <= nbuPok){
            System.out.println("Банк с самым низким курсом покупки доллара - Приватбанк");
        }
        if (usPok <= pbPok && usPok <= avPok && usPok <= osPok && usPok <= nbuPok){
            System.out.println("Банк с самым низким курсом покупки доллара - УкрСибБанк");
        }
        if (avPok <= usPok && avPok <= pbPok && avPok <= osPok && avPok <= nbuPok){
            System.out.println("Банк с самым низким курсом покупки доллара - Аваль");
        }
        if (osPok <= usPok && osPok <= avPok && osPok <= pbPok && osPok <= nbuPok){
            System.out.println("Банк с самым низким курсом покупки доллара - Ощадбанк");
        }
        if (nbuPok <= usPok && nbuPok <= avPok && nbuPok <= pbPok && nbuPok <= pbPok){
            System.out.println("Банк с самым низким курсом покупки доллара - НБУ");
        }

        if (pbProd >= usProd && pbProd >= avProd && pbProd >= osProd && pbProd >= nbuProd){
            System.out.println("Банк с самым высоким курсом продажи доллара - Приватбанк");
        }
        if (usProd >= pbProd && usProd >= avProd && usProd >= osProd && usProd >= nbuProd){
            System.out.println("Банк с самым высоким курсом продажи доллара - УкрСибБанк");
        }
        if (avProd >= usProd && avProd >= pbProd && avProd >= osProd && avProd >= nbuProd){
            System.out.println("Банк с самым высоким курсом продажи доллара - Аваль");
        }
        if (osProd >= usProd && osProd >= avProd && osProd >= pbProd && osProd >= nbuProd){
            System.out.println("Банк с самым высоким курсом продажи доллара - Ощадбанк");
        }
        if (nbuProd >= usProd && nbuProd >= avProd && nbuProd >= osProd && nbuProd >= pbProd){
            System.out.println("Банк с самым высоким курсом продажи доллара - НБУ");
        }

        System.out.println("Средний курс покупки гривна/доллар: " + (pbPok+usPok+avPok+osPok+nbuPok)/5);
        System.out.println("Средний курс продажи гривна/доллар: " + (pbProd+usProd+avProd+osProd+nbuProd)/5);
        driver.quit();
    }
}
