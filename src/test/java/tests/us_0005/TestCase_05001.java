package tests.us_0005;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelListPage;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TestCase_05001 extends TestBaseRapor {

    HotelMyCampPage hotelMyCampPage;
    HotelListPage hotelListPage;

    @Test
    public  void test01() {
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


    }
}
