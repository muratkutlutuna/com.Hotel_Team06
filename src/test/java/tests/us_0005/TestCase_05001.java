package tests.us_0005;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelListPage;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TestCase_05001 extends TestBaseRapor {



    @Test
    public  void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest=extentReports.createTest("HotelMyCamp us_0005  TestCase_05001","https://hotelmycamp.com test edildi");


        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        HotelListPage hotelListPage=new HotelListPage();

        hotelMyCampPage.girisYap();
        extentTest.info("giris yapildigi kontrol edildi");

        hotelListPage.hotelManagementYaziElementi.click();
        extentTest.info("Management butonuna tiklandigi kontrol edildi");
        hotelListPage.hotelListIkonElementi.click();
        extentTest.info("Hotel List butonuna tiklandigi kontrol edildi");
        Assert.assertTrue(hotelListPage.listOfHotelYaziElementi.isDisplayed());
        extentTest.info("List Of Hoet Yazisinin goruldugu kontrol edildi");



    }
}
