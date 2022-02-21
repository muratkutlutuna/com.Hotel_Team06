package tests.us_0007;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import pages.RoomGuncellemePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_01 extends TestBaseRapor {

    //"HOTELMYCAMP" ana sayfasına gidilir
    //Login butonuna tiklanir
    //Username'e gecerli bir username girilir
    //Password'a gecerli bir password girilir
    //Log in butonuna tiklanir
    //"LISTOFUSERS" text'inin gorunurlugu test edilir


    @Test
    public  void test01 ()  {

        extentTest=extentReports.createTest("Yönetici login olabilmelidir", "Yöneticinin hotelin ana sayfasından kullanıcı adı ve şifresiyle basarili login olabilmesi test edildi");

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();

        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.loginButonu.click();

        RoomGuncellemePage roomGuncellemePage = new RoomGuncellemePage();

        Assert.assertTrue(roomGuncellemePage.basariliGirisTexti.isDisplayed(), "basarili giris yapılamadı");

        extentTest.info("Yönetici, kullanıcı adı ve şifresiyle basarili login yaptı");




    }

    }

