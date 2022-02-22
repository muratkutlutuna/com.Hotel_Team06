package tests.us_0010;

import org.testng.annotations.Test;
import pages.UserReservationPage;
import utilities.TestBaseRapor;

public class TestCase_10003 extends TestBaseRapor {

    @Test
    public void odaSecilebirligi(){

        TestCase_10002 ikinciTest= new TestCase_10002();
        ikinciTest.advancedSearchTest();

        extentTest=extentReports.createTest("TestCase_10003","Oda secenekleri goruntulendi.");

        UserReservationPage userReservation_page =new UserReservationPage();

        extentTest.info("Double linkine tiklanarak oda seceneklerine ulasildi.");
        userReservation_page.searchtenSonrakiDoubleRoomElementi.click();

        extentTest.info("Double Room\" elementine tiklandi ve double oda seceneklerine ulasildi.");
        userReservation_page.doubleRoomSecenekleriElementi.click();
    }
}
