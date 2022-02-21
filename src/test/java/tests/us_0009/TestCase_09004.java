package tests.us_0009;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.RoomReservationsPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TestCase_09004 extends TestBaseRapor {
    RoomReservationsPage hotelMyCampPage;
    SoftAssert softAssert;

    @Test
    public void test04() {
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
        ReusableMethods.waitFor(2);
        hotelMyCampPage.searchtenSonrakiDetailsElementi.click();
        extentTest.info("Arama yapildiktan sonra cikan details butonuna basildi");
        softAssert=new SoftAssert();
        softAssert.assertTrue(hotelMyCampPage.editHotelroomreservatıonElementi.isDisplayed());

        extentTest=extentReports.createTest("Properties Kismini Doldurma","Properties kismi dolduruldu");
        hotelMyCampPage.roomReservationsPropertiesElementi.click();
        extentTest.info("Room Reservations Properties bolumune giris yapildi");
        Select select=new Select(hotelMyCampPage.propertiesTipElementi);
        select.selectByIndex(1);

        hotelMyCampPage.propertiesCodeElementi.sendKeys("1234");
        extentTest.info("Properties'te Code kismi dolduruldu");
        hotelMyCampPage.propertiesValueElementi.sendKeys("Test1234");
        extentTest.info("Properties'te Value kismi dolduruldu");
        ReusableMethods.waitFor(2);
        JSUtils.scrollIntoVIewJS(hotelMyCampPage.propertiesSaveElementi);
        hotelMyCampPage.propertiesSaveElementi.click();
        extentTest.info("Properties'te Save kismi dolduruldu");

        ReusableMethods.waitFor(2);
        softAssert.assertTrue(hotelMyCampPage.valueaddedElementi.isDisplayed());
        extentTest.info("Value added yazisi goruldu");
        hotelMyCampPage.valueaddedOkButonuElementi.click();

        //hotelMyCampPage.cikisYapma();


    }

}
