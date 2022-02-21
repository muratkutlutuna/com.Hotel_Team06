package tests.us_0006;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelMyCampPage;
import pages.HotelRoomsPage;
import utilities.Driver;
import utilities.TestBaseRapor;


public class TestCase_06002 extends TestBaseRapor{

    HotelRoomsPage hotelRoomsPage=new HotelRoomsPage();
    HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
    SoftAssert softAssert=new SoftAssert();

    @Test
    public void test02(){

       extentTest=extentReports.createTest("HMC Project us_0006 TC002","Hotel Rooms sayfasındaki addHotelRoom butonunun erişilebilirliği test edildi");
        hotelMyCampPage.girisYap();
       extentTest.info("sayfaya başarılı bir şekilde giriş yapıldı");
        hotelMyCampPage.hotelManagementLinki.click();
       extentTest.info("hotel management linkine tıklandı");
        hotelMyCampPage.bekle(1);
        hotelRoomsPage.hotelRoomsLinki.click();
        hotelMyCampPage.bekle(3);
       extentTest.info("hotel rooms linkine tıklandı");
        softAssert.assertTrue(hotelRoomsPage.addHotelRoomButonu.isEnabled());
        extentTest.info("addHotelRoom butonunun erişilebilirliği test edildi");

       Actions actions=new Actions(Driver.getDriver());
       actions.moveToElement(hotelRoomsPage.sağÜstManagerButonu).click(hotelRoomsPage.logOutButonu).perform();
    }

}
