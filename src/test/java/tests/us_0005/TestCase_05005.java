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

public class TestCase_05005 extends TestBaseRapor {


    @Test
    public void test01() {

        TestCase_05002 tc01=new TestCase_05002();
        tc01.test01();
        extentTest=extentReports.createTest("HotelMyCamp us_0005  TestCase_05003","https://hotelmycamp.com test edildi");
        HotelListPage hotelListPage=new HotelListPage();
        ReusableMethods.waitFor(2);

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

        hotelListPage.deleteButonElementi.click();
        extentTest.info("delete butonuna tiklanabildigi kontrol edildi");
        ReusableMethods.waitFor(3);

        Assert.assertTrue( hotelListPage.wouldYouLikeToContinueYaziElementi.isDisplayed());
        extentTest.info("would You Like To Continue Yazisının goruldugu  kontrol edildi");
        hotelListPage.okButonElementi.click();
        extentTest.info("OK butonuna tiklanabildigi kontrol edildi");





    }
}