package tests.us_0010;

import org.testng.annotations.Test;
import pages.UserReservationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TestCase_10001 extends TestBaseRapor {


    @Test
   public  void roomsTest() {

        extentTest=extentReports.createTest("TestCase_10001","www.hotelmycamp.com sayfasina gidildi ve 'Rooms' linkine tiklandi.");

        extentTest.info("\"https://www.hotelmycamp.com/\" sayfasina gidildi.");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        UserReservationPage userReservation_page =new UserReservationPage();

        extentTest.info("Sag ustteki 'Room\" elementine tiklandi.");
        userReservation_page.roomsElementi.click();
    }
}
