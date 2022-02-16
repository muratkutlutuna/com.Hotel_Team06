package tests.us_0002;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TestCase_02004 extends TestBaseRapor {
    @Test
    public void loginButonunun() {

        // https://hotelmycamp.com/ sayfasına gidin
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest=extentReports.createTest("HotelMyCamp us_0002  TestCase_02004","https://hotelmycamp.com test edildi");

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

        //Password textbox kontrol edin
        Assert.assertTrue(hotelMyCampPage.passwordBox.isDisplayed()," Password textbox görülemiyor ");
        extentTest.info("Password textbox kontrol edildi");

        //Password textbox'a Admin password girilmeli  Password  : Manager1!
        hotelMyCampPage.passwordBox.sendKeys("Manager1! ");
        extentTest.info("Password textbox kontrol edildi ");

        //Login butonunun görünürlüğünü kontrol edin
        Assert.assertTrue(hotelMyCampPage.loginButonu.isDisplayed()," Login butonunun görülemiyor ");
        extentTest.info("Login butonunun görünülüğünü kontrol edildi");

        //Login butonuna tıklayın
        hotelMyCampPage.loginButonu.click();
        extentTest.info("Log in butonuna tıklandi");


        Driver.closeDriver();
          }
       }
