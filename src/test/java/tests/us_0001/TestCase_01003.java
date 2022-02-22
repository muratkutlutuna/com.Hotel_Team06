package tests.us_0001;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AnasayfaPage;
import utilities.*;

public class TestCase_01003 extends TestBaseRapor {

    AnasayfaPage anasayfaPage = new AnasayfaPage();

    @Test(priority = 1)
    public void ikonYaziBaslikGorunurlukTest() {
        extentTest = extentReports.createTest("TestCase_01003", "Ana sayfanin welcome to our hotel kismindaki yazilar, resimler ve butonlar calisir ve gorunur oldugunu test edilir");
        extentTest.info("kullanici olarak ana sayfaya girilir");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("kullanici olarak sayfanin welcome to our hotel kismina inilir");
        JSUtils.scrollIntoVIewJS(anasayfaPage.checkAvailabilityButton);
        extentTest.info("kullanici olarak \"welcome to our hotel\" yazisi, 7/24 service restaurant bar, transfer, spa ikonlari ve yazilari kontrol edilir");
        ReusableMethods.waitFor(1);
        Assert.assertTrue(anasayfaPage.welcomeToHotelmycampYazisi.isDisplayed());
        Assert.assertTrue(anasayfaPage.welcomeToOurHotelBasligi.isDisplayed());
        Assert.assertTrue(anasayfaPage.welcomeYazisi.isDisplayed());
        Assert.assertTrue(anasayfaPage.zilIkonu.isDisplayed());
        Assert.assertTrue(anasayfaPage.tepsiIkonu.isDisplayed());
        Assert.assertTrue(anasayfaPage.arabaIkonu.isDisplayed());
        Assert.assertTrue(anasayfaPage.mumIkonu.isDisplayed());
        Assert.assertTrue(anasayfaPage.frontDesk257Yazisi.isDisplayed());
        Assert.assertTrue(anasayfaPage.restaurantBarYazisi.isDisplayed());
        Assert.assertTrue(anasayfaPage.transferServicesYazisi.isDisplayed());
        Assert.assertTrue(anasayfaPage.spaSuitesYazisi.isDisplayed());
        extentTest.pass("Butonlar calisir durumda");
    }

    @Test(priority = 2)
    public void facebookIkonTest() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        JSUtils.scrollIntoVIewJS(anasayfaPage.welcomeToHotelmycampYazisi);
        ReusableMethods.waitFor(1);
        extentTest.info("kullanici olarak facebook ikonunun calismasi ve gorunurlugu kontrol edilir");
        AnasayfaPage.elementCalismasiniGorunurlugunuKontrolEt(anasayfaPage.facebookIkon1, "Facebook");
        extentTest.fail("kullanici olarak facebook ikonunun calismasi hata verir");

    }

    @Test(priority = 3)
    public void googleIkonTest() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        JSUtils.scrollIntoVIewJS(anasayfaPage.welcomeToHotelmycampYazisi);
        ReusableMethods.waitFor(1);
        extentTest.info("kullanici olarak google ikonunun calismasi ve gorunurlugu kontrol edilir");
        AnasayfaPage.elementCalismasiniGorunurlugunuKontrolEt(anasayfaPage.googleIkon1, "Google");
        extentTest.fail("kullanici olarak google ikonunun calismasi hata verir");
    }

    @Test(priority = 4)
    public void instagramIkonTest() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        JSUtils.scrollIntoVIewJS(anasayfaPage.welcomeToHotelmycampYazisi);
        ReusableMethods.waitFor(1);
        extentTest.info("kullanici olarak instagram ikonunun calismasi ve gorunurlugu kontrol edilir");
        AnasayfaPage.elementCalismasiniGorunurlugunuKontrolEt(anasayfaPage.instagramIkon1, "Instagram");
        extentTest.fail("kullanici olarak instagram ikonunun calismasi hata verir");
    }
}
