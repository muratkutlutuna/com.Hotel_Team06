package tests.us_0005;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelListPage;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TestCase_05002 extends TestBaseRapor {



    @Test
    public void test01() {

        TestCase_05001 tc01=new TestCase_05001();
        tc01.test01();
        extentTest=extentReports.createTest("HotelMyCamp us_0005  TestCase_05002","https://hotelmycamp.com test edildi");

        ReusableMethods.waitFor(2);
        HotelListPage hotelListPage=new HotelListPage();

        hotelListPage.ilkDetailsButonElementi.click();
        extentTest.info("Details butonuna tiklandigi kontrol edildi");
        ReusableMethods.switchToWindow("Admin - Edit Hotel");
        Assert.assertTrue(hotelListPage.editHotelYaziElementi.isDisplayed());
        extentTest.info("Edit otel yazisinin goruldugu kontrol edildi");

    }
}