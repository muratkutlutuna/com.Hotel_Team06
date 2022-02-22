package tests.us_0010;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserReservationPage;
import utilities.TestBaseRapor;

public class TestCase_10005 extends TestBaseRapor {
    @Test
    public void loginButonuTesti(){

        TestCase_10004 dorduncuTest=new TestCase_10004();
        dorduncuTest.bookNowTesti();

        extentTest=extentReports.createTest("TestCase_10005"," 'Login' linkine tiklandi.");

        UserReservationPage userReservation_page =new UserReservationPage();

        extentTest.pass(" 'Login' linki goruldu.");
         Assert.assertTrue(userReservation_page.ikinciLoginLinki.isDisplayed());

        extentTest.info(" 'Login' linkine tiklandi.");
        userReservation_page.ikinciLoginLinki.click();
    }
}
