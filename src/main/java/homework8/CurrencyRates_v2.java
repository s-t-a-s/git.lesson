package homework8;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import java.util.concurrent.TimeUnit;


        import java.util.concurrent.TimeUnit;

public class CurrencyRates_v2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String pageSource;
        String startUSDBuy;
        String endUSDBuy;

        //приватбанк
        driver.get("https://www.privat24.ua");
        pageSource = driver.getPageSource();
        startUSDBuy = "ДОЛ:  </div> <div class=\"section-content rate\">  ";
        pageSource = pageSource.substring(pageSource.indexOf(startUSDBuy) + startUSDBuy.length());
        String pbPok1 = pageSource.substring(0, 6);
        double pbPok = Double.parseDouble(pbPok1);
        String pbProd1 = pageSource.substring(9, 15);
        double pbProd = Double.parseDouble(pbProd1);

        //Укрсиббанк
        driver.get("https://my.ukrsibbank.com/ru/personal/operations/currency_exchange/");
        pageSource = driver.getPageSource();
        startUSDBuy = "США</i></td>\n                    <td><span class=\"mobile-curr-name\">Покупка</span>";
        endUSDBuy = "<i";
        pageSource = pageSource.substring(pageSource.indexOf(startUSDBuy) + startUSDBuy.length());
        String usPok1 = pageSource.substring(0, pageSource.indexOf(endUSDBuy));
        double usPok = Double.parseDouble(usPok1);
        String startUSDSell = "Продажа</span>";
        String endUSDSell = "<i";
        pageSource = pageSource.substring(pageSource.indexOf(startUSDSell) + startUSDSell.length());
        String usProd1 = pageSource.substring(0, pageSource.indexOf(endUSDSell));
        double usProd = Double.parseDouble(usProd1);

        //Аваль
        driver.get("https://www.aval.ua/ru/personal/everyday/exchange/exchange/");
        pageSource = driver.getPageSource();
        startUSDBuy = "Доллары США</td><td class=\"right\">";
        endUSDBuy = "</td>";
        pageSource = pageSource.substring(pageSource.indexOf(startUSDBuy) + startUSDBuy.length());
        String avPok1 = pageSource.substring(0, pageSource.indexOf(endUSDBuy));
        double avPok = Double.parseDouble(avPok1.replace(',', '.'));
        startUSDSell = avPok1.concat("</td><td class=\"right\">");
        endUSDSell = "</td></tr><tr><td class=\"name\">Евро";
        pageSource = pageSource.substring(pageSource.indexOf(startUSDSell) + startUSDSell.length());
        String avProd1 = pageSource.substring(0, pageSource.indexOf(endUSDSell));
        double avProd = Double.parseDouble(avProd1.replace(',', '.'));

        //Ощадбанк
        driver.get("http://www.oschadbank.ua/ua/");
        pageSource = driver.getPageSource();
        startUSDBuy = "buy-USD\" data-buy=\"";
        endUSDBuy = "\">";
        pageSource = pageSource.substring(pageSource.indexOf(startUSDBuy) + startUSDBuy.length());
        String osPok1 = pageSource.substring(0, pageSource.indexOf(endUSDBuy));
        double osPok = Double.parseDouble(osPok1.replace(',', '.'));
        startUSDSell = "sell-USD\" data-sell=\"";
        endUSDSell = "\">";
        pageSource = pageSource.substring(pageSource.indexOf(startUSDSell) + startUSDSell.length());
        String osProd1 = pageSource.substring(0, pageSource.indexOf(endUSDSell));
        double osProd = Double.parseDouble(osProd1.replace(',', '.'));

        //НБУ
        driver.get("http://www.bank.gov.ua/control/uk/curmetal/detail/currency?period=daily");
        pageSource = driver.getPageSource();
        startUSDBuy = "США</td>\n" +
                "\n" +
                "          <td class=\"cell_c\">";
        endUSDBuy = "</td>";
        pageSource = pageSource.substring(pageSource.indexOf(startUSDBuy) + startUSDBuy.length());
        String nbu1 = pageSource.substring(0, pageSource.indexOf(endUSDBuy));
        double nbu = Double.parseDouble(nbu1) / 100;
        driver.quit();

        if (pbPok <= usPok && pbPok <= avPok && pbPok <= osPok && pbPok <= nbu) {
            System.out.println("Банк с самым низким курсом покупки доллара - Приватбанк");
        }
        if (usPok <= pbPok && usPok <= avPok && usPok <= osPok && usPok <= nbu) {
            System.out.println("Банк с самым низким курсом покупки доллара - УкрСибБанк");
        }
        if (avPok <= usPok && avPok <= pbPok && avPok <= osPok && avPok <= nbu) {
            System.out.println("Банк с самым низким курсом покупки доллара - Аваль");
        }
        if (osPok <= usPok && osPok <= avPok && osPok <= pbPok && osPok <= nbu) {
            System.out.println("Банк с самым низким курсом покупки доллара - Ощадбанк");
        }
        if (nbu <= usPok && nbu <= avPok && nbu <= pbPok && nbu <= pbPok) {
            System.out.println("Банк с самым низким курсом покупки доллара - НБУ");
        }

        if (pbProd >= usProd && pbProd >= avProd && pbProd >= osProd && pbProd >= nbu) {
            System.out.println("Банк с самым высоким курсом продажи доллара - Приватбанк");
        }
        if (usProd >= pbProd && usProd >= avProd && usProd >= osProd && usProd >= nbu) {
            System.out.println("Банк с самым высоким курсом продажи доллара - УкрСибБанк");
        }
        if (avProd >= usProd && avProd >= pbProd && avProd >= osProd && avProd >= nbu) {
            System.out.println("Банк с самым высоким курсом продажи доллара - Аваль");
        }
        if (osProd >= usProd && osProd >= avProd && osProd >= pbProd && osProd >= nbu) {
            System.out.println("Банк с самым высоким курсом продажи доллара - Ощадбанк");
        }
        if (nbu >= usProd && nbu >= avProd && nbu >= osProd && nbu >= pbProd) {
            System.out.println("Банк с самым высоким курсом продажи доллара - НБУ");
        }

        System.out.println("Средний курс покупки гривна/доллар: " + (pbPok + usPok + avPok + osPok + nbu) / 5);
        System.out.println("Средний курс продажи гривна/доллар: " + (pbProd + usProd + avProd + osProd + nbu) / 5);

    }
}
