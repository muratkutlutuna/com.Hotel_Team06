package tests.us_0002;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

   public class TestCase_02001{
   @Test
   public void ilkLoginTesti(){
       // https://hotelmycamp.com/ sayfasına gidin
      Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
       //"Log in" linki görünülüğünü kontrol edin
       HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
       Assert.assertTrue( hotelMyCampPage.ilkLoginLinki.isDisplayed()," ilk Login görülemiyor");

       //"Log in" linkine tıklayın
       hotelMyCampPage.ilkLoginLinki.click();
       Driver.closeDriver();
   }
}
