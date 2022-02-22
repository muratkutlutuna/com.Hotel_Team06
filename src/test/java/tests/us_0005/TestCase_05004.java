package tests.us_0005;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelListPage;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TestCase_05004 extends TestBaseRapor {

    HotelMyCampPage hotelMyCampPage;
    HotelListPage hotelListPage;

    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest=extentReports.createTest("HotelMyCamp us_0005  TestCase_05001","https://hotelmycamp.com test edildi");

        hotelMyCampPage = new HotelMyCampPage();
        hotelListPage=new HotelListPage();
        hotelMyCampPage.girisYap();
        extentTest.info("giris yapildigi kontrol edildi");
        hotelListPage.hotelManagementYaziElementi.click();
        hotelListPage.hotelListIkonElementi.click();
        Assert.assertTrue(hotelListPage.listOfHotelYaziElementi.isDisplayed());
        extentTest.info("Hotel management butonuna  ve ardindan Hotel List butonuna tiklandigi ve List Of Hoet Yazisinin goruldugu kontrol edildi");
        ReusableMethods.waitFor(2);
        hotelListPage.ilkDetailsButonElementi.click();
        ReusableMethods.switchToWindow("Admin - Edit Hotel");
        Assert.assertTrue(hotelListPage.editHotelYaziElementi.isDisplayed());
        extentTest.info("Edit otel yazisinin goruldugu kontrol edildi");
        ReusableMethods.waitFor(2);

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

        hotelListPage.deleteButonElementi.click();

       /* if ( hotelListPage.wouldYouLikeToContinueYaziElementi.isDisplayed()){


        }else{
          hotelListPage.deleteButonElementi.click();

        }*/


        extentTest.info("delete butonuna tiklanabildigi kontrol edildi");
        ReusableMethods.waitFor(3);

        Assert.assertTrue( hotelListPage.wouldYouLikeToContinueYaziElementi.isDisplayed());
        extentTest.info("would You Like To Continue Yazisının goruldugu  kontrol edildi");
        ReusableMethods.waitFor(3);
        hotelListPage.okButonElementi.click();
        ReusableMethods.waitFor(2);


        // extentTest.info("OK butonuna tiklanabildigi kontrol edildi");
      //  hotelListPage.hataYazisiOkButonuElementi.click();





    }
}