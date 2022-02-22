package tests.us_0008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RoomReservationsPage_2;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TestCase_08002 extends TestBaseRapor {

    RoomReservationsPage_2 locate = new RoomReservationsPage_2();
    TestCase_08001 testCase_08001 = new TestCase_08001();

    @Test
    public void testCase02() {

        extentTest = extentReports.createTest("HMC Projekt", "Homepage Log in  Linkinin görüldügü testi edildi");

        ReusableMethods.waitFor(2);

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        extentTest.info("HMC Anasayafaya basarili bir sekilde gidildi");

        String hotelMyCampUrl = "https://www.hotelmycamp.com/";
        String actualHotelMyCampUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualHotelMyCampUrl, hotelMyCampUrl);
        extentTest.pass("HotelMyCamp URL'inin  beklenen URL ile ayni oldugu test edildi");


        String expextedHomePageLogInYazisi = "Log in";
        String actualHomePageLogInYazisi = locate.hMCAnasayfaLogInLinki.getText();

        Assert.assertTrue(actualHomePageLogInYazisi.equals(expextedHomePageLogInYazisi));
        extentTest.pass("Homepage te Log in linki nin görüldügü test edildi");


        locate.hMCAnasayfaLogInLinki.click();
        extentTest.info(" Log in butonuna  tiklandi");

        Assert.assertTrue(locate.usernameLogInBox.isDisplayed());
        extentTest.pass("Homepage ten login sayfasina basarili bir sekilde  gecildigi test edildi");


    }


}