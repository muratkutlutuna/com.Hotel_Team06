package tests.us_0009;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.JSUtils;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TestCase_09003 extends TestBaseRapor {


    @Test
    public void test03() {
        extentTest=extentReports.createTest("Rezervasyon Bilgileri","Rezervazyon bilgileri update edildi");

        TestCase_09002 dependson1 = new TestCase_09002();
        dependson1.test02();
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();

        hotelMyCampPage.dateStartElementi.clear();
        hotelMyCampPage.dateStartElementi.sendKeys("01/06/2022");
        extentTest.info("Giris tarihi degistirildi");

        hotelMyCampPage.dateEndElementi.clear();
        hotelMyCampPage.dateEndElementi.sendKeys("01/08/2022");
        extentTest.info("Cikis tarihi degistirildi");

        hotelMyCampPage.adultAmountElementiBosTiklama.click();
        ReusableMethods.waitFor(2);

        JSUtils.scrollIntoVIewJS(hotelMyCampPage.adultAmountElementi);

        hotelMyCampPage.adultAmountElementi.clear();
        hotelMyCampPage.adultAmountElementi.sendKeys("5");

        extentTest.info("Adult Amount sayisi degistirildi");

        hotelMyCampPage.childrenAmountElementi.clear();
        hotelMyCampPage.childrenAmountElementi.sendKeys("5");
        extentTest.info("Children Amount sayisi degistirildi");

        hotelMyCampPage.notesElementi.clear();
        hotelMyCampPage.notesElementi.sendKeys("Hosgeldiniz");
        extentTest.info("Notes kismi degistirildi");

        hotelMyCampPage.generalDataSaveButonu.click();
        extentTest.info("Save butonuna tiklandi");

        Assert.assertTrue(hotelMyCampPage.updatedSuccessfullyYazisiElementi.isDisplayed());
        extentTest.info("Update islemi basariyla gerceklestirildi");


    }
}
