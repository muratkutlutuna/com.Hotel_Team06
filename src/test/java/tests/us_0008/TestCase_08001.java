package tests.us_0008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RoomReservationsPage_2;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TestCase_08001 extends TestBaseRapor {

    RoomReservationsPage_2 locate = new RoomReservationsPage_2();

    @Test
    public void testCase01() {

        extentTest = extentReports.createTest("HMC Projekt", "Homepage erisilebilirligi testi edildi");

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("HotelMyCamp sitesine gidildi");

        String hotelMyCampUrl = "https://www.hotelmycamp.com/";
        String actualHotelMyCampUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualHotelMyCampUrl, hotelMyCampUrl);
        extentTest.pass("HotelMyCamp URL'inin  beklenen URL ile ayni oldugu test edildi");


    }


}
