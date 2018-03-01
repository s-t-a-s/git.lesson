package lesson7.part2;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class KismiaChangeGender extends BrowserFactory {


    @Test
    public void changeGender() throws InterruptedException {
        driver.get("https://kismia.com/profile/settings#profile");
        if (driver.findElement(By.cssSelector(".settings-radio [value='m']")).isSelected()) {
            System.out.println("male");
            Thread.sleep(5000);
            driver.findElement(By.cssSelector(".settings-radio [value='f']")).click();
            Thread.sleep(5000);
            saveChanges();
            Thread.sleep(5000);
            Assert.assertTrue(driver.findElement(By.cssSelector(".settings-radio [value='m']")).isSelected(), "gender is not changed to female");
        } else {
            System.out.println("female");
            Thread.sleep(5000);
            driver.findElement(By.cssSelector(".settings-radio [value='m']")).click();
            Thread.sleep(5000);
            saveChanges();
            Thread.sleep(5000);
            Assert.assertTrue(driver.findElement(By.cssSelector(".settings-radio [value='m']")).isSelected(), "gender is not changed to male");
        }
    }
    public void saveChanges(){
        driver.findElement(By.cssSelector(".button-FR.settings__button.button--flat-green.js_save")).click();
        //driver.findElement(By.cssSelector("[data-tab='profile'] .js_save")).click();
    }
}
     /**  driver.get("https://kismia.com/profile/settings#profile");


        driver.findElement(By.cssSelector(".settings-radio [value='m']")).click();
        if(isPopupPresent()){
            saveChanges();

        Assert.assertTrue(driver.findElement(By.cssSelector(".settings-radio [value='m']")).isSelected(), "gender is not changed to mail");
    }
        else

    {
        driver.findElement(By.cssSelector(".settings-radio [value='f']")).click();
            saveChanges();
        Assert.assertTrue(driver.findElement(By.cssSelector(".settings-radio [value='m']")).isSelected(), "gender is not changed to femail");
    }
        Thread.sleep(5000);


    Select select = new Select(driver.findElement(By.cssSelector(".settings-path__select--year")));
     System.out.println(select.getFirstSelectedOption().getAttribute("value"));


     select.selectByValue("1930");
      #dialog-form .button--green-border




    public boolean isPopupPresent(){
        return driver.findElements(By.cssSelector("#dialog-form")).size() > 0;
    }

    public void saveChanges(){
        driver.findElement(By.cssSelector("#dialog-form .button--green-border")).click();
        driver.findElement(By.cssSelector("[data-tab='profile'] .js_save")).click();
    }**/

