package tests.us_0002;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TestCase_02005 {

    @Test
    public void ListOfUsersYazisiTesti() {

        // https://hotelmycamp.com/ sayfasına gidin
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        //"Log in" linki görünülüğünü kontrol edin
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(hotelMyCampPage.ilkLoginLinki.isDisplayed(), " ilk Login görülemiyor");

        //"Log in" linkine tıklayın
        hotelMyCampPage.ilkLoginLinki.click();

        //Username textbox görünürlüğünü kontrol edin
        softAssert.assertTrue(hotelMyCampPage.usernameBox.isDisplayed(), "Username textbox görülemiyor");

        //Username textbox'a Admin username girilmeli
        hotelMyCampPage.usernameBox.sendKeys("manager"); // username: manager

        //Password textbox kontrol edin
        softAssert.assertTrue(hotelMyCampPage.passwordBox.isDisplayed(), " Password textbox görülemiyor ");

        //Password textbox'a Admin password girilmeli  Password  : Manager1!
        hotelMyCampPage.passwordBox.sendKeys("Manager1! ");

        //Login butonunun görünürlüğünü kontrol edin
        softAssert.assertTrue(hotelMyCampPage.loginButonu.isDisplayed(), " Login butonunun görülemiyor ");

        //Login butonuna tıklayın
        hotelMyCampPage.loginButonu.click();

        //" ListOfUsers  " yazısının görünürlüğünü kontrol edin
        softAssert.assertTrue(hotelMyCampPage.basariliGirisYazisi.isDisplayed(),"ListOfUsers yazisi görülemiyor ");

        softAssert.assertAll();
        Driver.closeDriver();
    }
}
