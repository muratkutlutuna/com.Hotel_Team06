package tests.us_0008;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import pages.RoomReservationsPage_2;
import utilities.TestBaseRapor;

public class TestCase_08004 extends TestBaseRapor {

    RoomReservationsPage_2 locate = new RoomReservationsPage_2();
    HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();


    @Test(priority = 1)
    public void testCase04() {

        extentTest = extentReports.createTest("HMC Projekt", "Homepage erisilebilirligi testi edildi");

        hotelMyCampPage.girisYap();
        extentTest.info("Kullanici adi ve sifre girilerek giris yapildi");

        locate.hotelManagementLinki.click();
        extentTest.info("Hotel Management yazisina tiklandi");

        locate.roomReservationsLinki.click();
        extentTest.info("Room reservations butonu tiklandi");

        Assert.assertTrue(locate.listOfReservationsYazisi.isDisplayed());
        extentTest.info("Reservasyon olusturulacak sayfaya basarili bir sekilde gidildigi görüldü");


    }


}
