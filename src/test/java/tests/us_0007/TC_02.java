package tests.us_0007;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import pages.RoomGuncellemePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_02 extends TestBaseRapor {

    //HOTELMYCAMP ana sayfasına gidilir
    //Login butonuna tiklanir
    //Username'e gecerli bir username girilir
    //Password'a gecerli bir password girilir
    //Log in butonuna tiklanir

    //"Hotel Management" menüsü tiklanir
    //"Hotel Rooms" link butonu tıklanır
    //"DETAILS" butonu tiklanır
    //"Edit Hotelroom" yazisinin görünürlüğü test edilir

    @Test
    public void test02 () {

        extentTest=extentReports.createTest("Yönetici oda bilgileri guncelleme sayfasına giriş yapabilmelidir", "Oda bilgilerini guncellemek için List of Hotel Rooms ve Edit HotelRoom sayfalarına basarili giris test edildi");


        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.loginButonu.click();

    // buraya kadar az farkla birlikte TC_01 ile aynı

       hotelMyCampPage.hotelManagementLinki.click();

       RoomGuncellemePage roomGuncellemePage = new RoomGuncellemePage();

       roomGuncellemePage.roomListLinki.click();

       roomGuncellemePage.detailsButton.click();

       Assert.assertTrue(roomGuncellemePage.editHotelRoom.isDisplayed(), "Oda bilgileri guncelleme sayfasına basarili giris yapılamadı");

       extentTest.info("Yönetici oda bilgileri guncelleme sayfasına basarili giris yaptı");


    }


}
