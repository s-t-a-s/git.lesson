package lesson7.part2;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.*;

public class KismiaLogin extends BrowserFactory {


    @Test(description = "Логин обычным пользователем")

    @Description("Проверка логина обычным юзером, должно работать нормально ))")
    @Parameters({"email", "password"})
    public void login(@Optional("devmydocs@gmail.com")String email, @Optional("qwe1rty2")String password) throws InterruptedException {
                System.out.println("EMAIL: "+email);
                System.out.println("PASSWORD: "+password);
                try {
                        driver.get("https://kismia.com");
                    } catch (Exception e){
                        System.out.println("STOP LOADING WINDOW");
                        JavascriptExecutor js = (JavascriptExecutor) driver;
                        js.executeScript("return window.stop");
                    }

                driver.findElement(By.cssSelector("#user-email")).clear();
                driver.findElement(By.cssSelector("#user-email")).sendKeys(email);
                driver.findElement(By.cssSelector("#user-password")).clear();
                driver.findElement(By.cssSelector("#user-password")).sendKeys(password);
                driver.findElement(By.cssSelector("#sign-in-form .submit")).click();
                Thread.sleep(5000);
                Assert.assertTrue(driver.getCurrentUrl().contains("kismia.com/u36792901"), "Wrong PAGE: "+driver.getCurrentUrl());

                    }
}