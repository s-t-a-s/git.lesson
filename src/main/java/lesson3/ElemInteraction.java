package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElemInteraction {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.imdb.com/chart/top");
        WebElement searchField = driver.findElement(By.cssSelector("#navbar-query"));
        searchField.clear(); // Очистить поле для ввода текста
        searchField.sendKeys("Побег из Шоушенка"); // Ввести текст
        WebElement searchBtn = driver.findElement(By.cssSelector(".magnifyingglass"));
        searchBtn.click(); // Клик
        driver.quit();
    }
}
