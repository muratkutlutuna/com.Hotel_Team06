package tests.us_0008;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TestCase_08004 {

    HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();

    @Test
    public void TestCase04(){

        // HotelMyCamp sitesine gidilir
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        // Log in linkine tiklanir
        hotelMyCampPage.hMCAnasayfaLogInLinki.click();

        // Log in butonuna tiklanir
        hotelMyCampPage.usernameLogInBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"),Keys.TAB);
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.logInButonu.click();

        // Hotel Management butonu tiklanir
        hotelMyCampPage.hotelManagementLinkii.click();

        // Room reservations butonu tiklanir
        hotelMyCampPage.roomReservationsLinki.click();

        // Reservasyon olusturulacak sayfaya basarili bir sekilde gidildigi görülür

        Assert.assertTrue(hotelMyCampPage.listOfReservationsYazisi.isDisplayed(), "Reservasyon olusturulacak sayfaya gidilemedi");






    }




}
