package tests.us_0002;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TestCase_02002 extends TestBaseRapor {

    @Test
    public void userNameTextboxTesti(){
        // https://hotelmycamp.com/ sayfasına gidin
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest=extentReports.createTest("HotelMyCamp us_0002  TestCase_02002","https://hotelmycamp.com test edildi");

        //"Log in" linki görünülüğünü kontrol edin
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        Assert.assertTrue( hotelMyCampPage.ilkLoginLinki.isDisplayed()," ilk Login görülemiyor");
        extentTest.info("Log in linki görünülüğünü kontrol edildi");

        //"Log in" linkine tıklayın
        hotelMyCampPage.ilkLoginLinki.click();
        extentTest.info("Log in linkine tıklandi");

        //Username textbox görünürlüğünü kontrol edin
       Assert.assertTrue(hotelMyCampPage.usernameBox.isDisplayed(),"Username textbox görülemiyor");
        extentTest.info("Username textbox görünülüğünü kontrol edildi");

        //Username textbox'a Admin username girilmeli
        hotelMyCampPage.usernameBox.sendKeys( "manager"); // username: manager
        extentTest.info("Username textbox'a Admin username girildi");

        Driver.closeDriver();
    }
}
