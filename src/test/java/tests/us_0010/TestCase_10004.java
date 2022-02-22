package tests.us_0010;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserReservationPage;
import utilities.TestBaseRapor;

public class TestCase_10004 extends TestBaseRapor {

    @Test
    public void bookNowTesti() {

        TestCase_10003 ucuncuTest = new TestCase_10003();
        ucuncuTest.odaSecilebirligi();

        extentTest=extentReports.createTest("TestCase_10004","Bir oda secildi ve 'Book Now' butonuna tiklandi.");

        extentTest.info("Ilk oda secildi.");
        UserReservationPage userReservation_page =new UserReservationPage();

        extentTest.pass(" 'Book Now' elementi goruntulendi ve tiklandi.");
        Assert.assertTrue(userReservation_page.ilkOdaSecenegiMoonBookNowElementi.isDisplayed());
        userReservation_page.ilkOdaSecenegiMoonBookNowElementi.click();
 }
}
