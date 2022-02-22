package tests.us_0003;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KayitRegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TestCase_03002 extends TestBaseRapor {
    KayitRegistrationPage kayitRegistrationPage=new KayitRegistrationPage();
    @Test
    public void test01(){
         //kayit olma sayfasi görüntülenmeli
        extentTest=extentReports.createTest("HotelMyCamp us_0003  TestCase_03002","https://hotelmycamp.com test edildi");

        //https://www.hotelmycamp.com/ sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        //sag üstteki login butonuna tiklanir
        kayitRegistrationPage.loginLinki.click();

        //create a new account butonunun görünürlügü test edilir
        Assert.assertTrue(kayitRegistrationPage.kayitButonu.isDisplayed());
        extentTest.info("kayit butonu görünürlügü test edildi");

        //create a new account butonuna tiklanir
        kayitRegistrationPage.kayitButonu.click();

        //Kayit sayfasinin acildigi kontrol edilir
        Assert.assertTrue(kayitRegistrationPage.kayitSayfasi.isDisplayed());
        extentTest.info("kayit sayfasinin acildigi kontrol edildi");
    }
}
