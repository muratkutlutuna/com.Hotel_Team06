package tests.us_0007;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_01 {

    //"HOTELMYCAMP" ana sayfasına gidilir
    //Login butonuna tiklanir
    //Username'e gecerli bir username girilir
    //Password'a gecerli bir password girilir
    //Log in butonuna tiklanir
    //"LISTOFUSERS" text'inin gorunurlugu test edilir


    @Test
    public  void test01 ()  {

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.usernameBox.sendKeys("manager");
        hotelMyCampPage.passwordBox.sendKeys("Manager1!");
        hotelMyCampPage.loginButonu.click();
        WebElement basariliGirisTexti = Driver.getDriver().findElement(By.xpath("//span[text()='ListOfUsers']"));
        Assert.assertTrue(basariliGirisTexti.isDisplayed(), "basarili giris yapılamadı");

    }

    }

