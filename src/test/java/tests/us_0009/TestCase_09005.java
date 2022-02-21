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

public class TestCase_09005 extends TestBaseRapor {

    RoomReservationsPage hotelMyCampPage;
    SoftAssert softAssert;

    @Test
    public void test05() {
        hotelMyCampPage = new RoomReservationsPage();
        softAssert=new SoftAssert();

        extentTest=extentReports.createTest("List Of Reservation Listesinden Birinin Secilebilmesi","List of reservation listesinden birinin secildigi test edildi");
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

        extentTest=extentReports.createTest("Rezervasyonun Silinmesi","Rezervazyonunun silinmesi test edildi");
        JSUtils.scrollIntoVIewJS(hotelMyCampPage.generalDataDeleteButonu);
        ReusableMethods.waitFor(2);
        hotelMyCampPage.generalDataDeleteButonu.click();
        Driver.getDriver().navigate().back();
        hotelMyCampPage.tableElement.click();
        actions.sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT);
        hotelMyCampPage.roomReservationSearchElementi.click();
        ReusableMethods.waitFor(1);

        Assert.assertTrue(hotelMyCampPage.deleteIslemindenSonraContacNameElementi.getText().isEmpty());
        extentTest.info("Delete butonu ile reservation silindi");



    }
}
