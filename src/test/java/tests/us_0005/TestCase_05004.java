package tests.us_0005;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelListPage;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TestCase_05004 extends TestBaseRapor {



    @Test
    public  void test01() {
        TestCase_05003 tc01=new TestCase_05003();
        tc01.test01();
        extentTest=extentReports.createTest("HotelMyCamp us_0005  TestCase_05004","https://hotelmycamp.com test edildi");

        HotelListPage hotelListPage=new HotelListPage();
        ReusableMethods.waitFor(3);

        Assert.assertTrue( hotelListPage.hotelWasupdatedSuccessfullyYaziElementi.isDisplayed());
        extentTest.info("hotel Wasupdated Successfully Yazisinin goruldugu kontrol edildi");
        hotelListPage.okButonElementi.click();
        extentTest.info("hotel Wasupdated Successfully Yazisinin goruldugu kontrol edildi");

    }
}
