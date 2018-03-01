package lesson3;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementSizeAndCoordinates {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.imdb.com/chart/top");
        WebElement element = driver.findElement(By.cssSelector("#navbar-query"));
        Dimension size = element.getSize(); // Размер элемента
        System.out.println("Height: "+size.getHeight()); // Высота
        System.out.println("Width: "+size.getWidth()); // Ширина
        Point location = element.getLocation(); // Локация элемента (Расположение/Позиция)
        System.out.println(location.getX()); // Координаты по горизонтали (Верхний левый угол)
        System.out.println(location.getY()); // Координаты по вертикали (Верхний левый угол)
        driver.quit();
    }
}
