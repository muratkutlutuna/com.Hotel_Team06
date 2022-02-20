package tests.us_0006;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelMyCampPage;
import pages.HotelRoomsPage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TestCase_06001 extends TestBaseRapor{


    HotelRoomsPage hotelRoomsPage=new HotelRoomsPage();
    HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
    SoftAssert softAssert=new SoftAssert();

    @Test
    public void test01() {
         extentTest=extentReports.createTest("HMC Project us_0006 TC001","Sayfaya başarılı bir şekilde giriş yapıldığı test edildi");
         hotelMyCampPage.girisYap();
         extentTest.info("sayfaya başarılı bir şekilde giriş yapıldı.");
         softAssert.assertTrue(hotelMyCampPage.addUserButonu.isEnabled());
         extentTest.info("addUser butonunun erişilebilirliği test edildi");

        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(hotelRoomsPage.sağÜstManagerButonu).click(hotelRoomsPage.logOutButonu).perform();


    }

}