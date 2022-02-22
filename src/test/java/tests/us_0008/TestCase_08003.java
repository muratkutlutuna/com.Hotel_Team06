package tests.us_0008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import pages.RoomReservationsPage_2;
import utilities.TestBaseRapor;

public class TestCase_08003 extends TestBaseRapor {

    RoomReservationsPage_2 locate = new RoomReservationsPage_2();
    TestCase_08002 testCase_08002 = new TestCase_08002();
    HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();


    @Test
    public void testCase03() {

        extentTest = extentReports.createTest("HMC Projekt", "Basarili bir sekilde log in olunudugu test edildi");

        hotelMyCampPage.girisYap();
        extentTest.info("Kullanici adi ve sifre girilerek giris yapildi");


        Assert.assertTrue(locate.SystemManagementYazisi.isDisplayed());
        extentTest.pass("Basarili bir sekilde giris yapildigi test edildi");





    }


}
