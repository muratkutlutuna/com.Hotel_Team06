package tests.us_0002;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TestCase_02003 {
    @Test
    public void passwordTextboxTesti() {

        // https://hotelmycamp.com/ sayfasına gidin
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        //"Log in" linki görünülüğünü kontrol edin
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        Assert.assertTrue(hotelMyCampPage.ilkLoginLinki.isDisplayed(), " ilk Login görülemiyor");

        //"Log in" linkine tıklayın
        hotelMyCampPage.ilkLoginLinki.click();

        //Username textbox görünürlüğünü kontrol edin
        Assert.assertTrue(hotelMyCampPage.usernameBox.isDisplayed(), "Username textbox görülemiyor");

        //Username textbox'a Admin username girilmeli
        hotelMyCampPage.usernameBox.sendKeys("manager"); // username: manager

        //Password textbox kontrol edin
       Assert.assertTrue(hotelMyCampPage.passwordBox.isDisplayed()," Password textbox görülemiyor ");

        //Password textbox'a Admin password girilmeli  Password  : Manager1!
        hotelMyCampPage.passwordBox.sendKeys("Manager1! ");

        Driver.closeDriver();

        }
    }