package tests.us_0009;


import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.RoomReservationsPage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TestCase_09001 extends TestBaseRapor {
    RoomReservationsPage hotelMyCampPage;
    SoftAssert softAssert;

    @Test
    public void test01() {
        extentTest = extentReports.createTest("List Of Reservation yazisinin gorulmesi", "List Of Reservation yazisinin gorulmesi test edildi");
        hotelMyCampPage = new RoomReservationsPage();
        hotelMyCampPage.roomReservation();
        extentTest.info("Room reservation kismina giris yapildi");

        softAssert = new SoftAssert();
        softAssert.assertTrue(hotelMyCampPage.roomReservationGirisYazisiElementi.isDisplayed());
        extentTest.pass("List of reservation kismi goruldu");



    }



}
