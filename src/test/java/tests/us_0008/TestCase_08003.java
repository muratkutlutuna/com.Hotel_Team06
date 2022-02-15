package tests.us_0008;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TestCase_08003 {

    HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();

    @Test
    public void TestCase03() {

        // HotelMyCamp sitesine gidilir
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        // Log in linkine tiklanir
        hotelMyCampPage.hMCAnasayfaLogInLinki.click();

        // Log in butonuna tiklanir
        hotelMyCampPage.usernameLogInBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"),Keys.TAB);
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.logInButonu.click();

        //Basarili bir sekilde log in yapildigi kotrol edilir

        Assert.assertTrue(hotelMyCampPage.SystemManagementYazisi.isDisplayed(), "basarili giris yapilamadi");













    }


}
