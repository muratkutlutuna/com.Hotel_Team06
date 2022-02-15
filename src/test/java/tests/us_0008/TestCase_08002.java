package tests.us_0008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TestCase_08002 {

    HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();

    @Test
    public void TestCase02(){

        // HotelMyCamp sitesine gidilir
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        // Ekranda log in linkinin görünürlügü kotrol edilir


        String expextedHomePageLogInYazisi="Log in";
        String actualHomePageLogInYazisi=hotelMyCampPage.hMCAnasayfaLogInLinki.getText();

        Assert.assertTrue(actualHomePageLogInYazisi.equals(expextedHomePageLogInYazisi), "Homepage te Log in linki görünmüyor");

        // Log in butonuna tiklanir

        hotelMyCampPage.hMCAnasayfaLogInLinki.click();

        // Basarili bir sekilde log in sayfasina gecis yapildigi kontrol edilir

        Assert.assertTrue(hotelMyCampPage.usernameLogInBox.isDisplayed(), "Homepage ten login sayfasina gecilemedi");


    }


}
