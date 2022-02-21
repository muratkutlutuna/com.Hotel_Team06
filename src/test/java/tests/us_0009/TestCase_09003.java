package tests.us_0009;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.RoomReservationsPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TestCase_09003 extends TestBaseRapor {

    RoomReservationsPage hotelMyCampPage;
    SoftAssert softAssert;
    @Test
    public void test03() {
        hotelMyCampPage = new RoomReservationsPage();
        softAssert=new SoftAssert();

        extentTest=extentReports.createTest("Rezervasyon Bilgileri","Rezervasyon bilgileri update edildi");
        hotelMyCampPage = new RoomReservationsPage();
        hotelMyCampPage.roomReservation();
        extentTest.info("Room reservation kismina giris yapildi");
        softAssert.assertTrue(hotelMyCampPage.roomReservationGirisYazisiElementi.isDisplayed());
        extentTest.info("List of reservation kismi goruldu");

        hotelMyCampPage.contactNameSurnameBox.sendKeys("Aslan");
        extentTest.info("Contact name kismi dolduruldu");
        Actions actions = new Actions(Driver.getDriver());
        hotelMyCampPage.tableElement.click();
        actions.sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT);
        hotelMyCampPage.roomReservationSearchElementi.click();
        ReusableMethods.waitFor(1);
        hotelMyCampPage.searchtenSonrakiDetailsElementi.click();
        extentTest.info("Arama yapildiktan sonra cikan details butonuna basildi");

        softAssert.assertTrue(hotelMyCampPage.editHotelroomreservatıonElementi.isDisplayed());

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

        Driver.getDriver().navigate().refresh();

        Assert.assertTrue(hotelMyCampPage.adultAmountElementi.getText().equals("5"));
        extentTest.info("Update islemi basariyla gerceklestirildi");


    }

}
