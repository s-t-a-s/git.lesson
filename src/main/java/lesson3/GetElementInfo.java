package lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementInfo {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.imdb.com/chart/top");
        WebElement element = driver.findElement(By.cssSelector("#navbar-query"));
        System.out.println(element.getText()); // Текст элемента
        System.out.println(element.getAttribute("placeholder")); // Получить значение аттрибута
        System.out.println(element.getCssValue("border-radius")); // Получить значение css параметра
        System.out.println(element.getTagName()); // Имя тега элемента
        driver.quit();
    }

}

