package tests.us_0002;


import org.testng.Assert;
import org.testng.annotations.Test;
import pages.GirisLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TestCase_02001 extends TestBaseRapor {
   @Test
   public void ilkLoginTesti(){


       // https://hotelmycamp.com/ sayfasına gidin
      Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

       extentTest=extentReports.createTest("HotelMyCamp us_0002  TestCase_02001","https://hotelmycamp.com test edildi");
       //"Log in" linki görünülüğünü kontrol edin
       GirisLoginPage girisLoginPage =new GirisLoginPage();
       Assert.assertTrue( girisLoginPage.ilkLoginLinki.isDisplayed()," ilk Login görülemiyor");
       extentTest.info("Log in linki görünülüğünü kontrol edildi");

       //"Log in" linkine tıklayın
       girisLoginPage.ilkLoginLinki.click();

       extentTest.info("Log in linkine tıklandi");

   }

}
