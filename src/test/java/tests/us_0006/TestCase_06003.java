package tests.us_0006;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelMyCampPage;
import pages.HotelRoomsPage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TestCase_06003 extends TestBaseRapor{

    HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
    HotelRoomsPage hotelRoomsPage=new HotelRoomsPage();
    SoftAssert softAssert=new SoftAssert();

    @Test
    public void test03(){

        extentTest=extentReports.createTest("HMC Project us_0006 TC003","Kayıt formu sayfasına gelindiği test edildi");
        hotelMyCampPage.girisYap();
        extentTest.info("sayfaya başarılı bir şekilde giriş yapıldı");
        hotelMyCampPage.hotelManagementLinki.click();
        extentTest.info("hotel management linkine tıklandı");
        hotelMyCampPage.bekle(1);
        hotelRoomsPage.hotelRoomsLinki.click();
       extentTest.info("hotel rooms linkine tıklandı");
        hotelRoomsPage.addHotelRoomButonu.click();
       extentTest.info("addHotelRoom butonuna tıklandı");
        hotelMyCampPage.bekle(1);
        softAssert.assertTrue(hotelRoomsPage.createHotelRoomYazıElementi.isDisplayed());
        extentTest.info("'Create Hotelroom' yazısının görünürlüğü test edildi");

       Actions actions=new Actions(Driver.getDriver());
       actions.moveToElement(hotelRoomsPage.sağÜstManagerButonu).click(hotelRoomsPage.logOutButonu).perform();


    }
}

