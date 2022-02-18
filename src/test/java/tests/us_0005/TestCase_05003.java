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

public class TestCase_05003 extends TestBaseRapor {


    @Test
    public  void test01() {

        TestCase_05002 tc01=new TestCase_05002();
        tc01.test01();
        extentTest=extentReports.createTest("HotelMyCamp us_0005  TestCase_05003","https://hotelmycamp.com test edildi");

        HotelListPage hotelListPage=new HotelListPage();
        hotelListPage.codeKutusuElementi.clear();
        hotelListPage.codeKutusuElementi.sendKeys("12345");
        hotelListPage.nameKutusuElementi.clear();
        hotelListPage.nameKutusuElementi.sendKeys("Green Garden");
        hotelListPage.addressKutusuElementi.clear();
        hotelListPage.addressKutusuElementi.sendKeys("Mugla");
        hotelListPage.phoneKutusuElementi.clear();
        hotelListPage.phoneKutusuElementi.sendKeys("123456789");
        hotelListPage.emailKutusuElementi.clear();
        hotelListPage.emailKutusuElementi.sendKeys("tatil@tatil.com");
        extentTest.info("bolumlerin dolduruldugu kontrol edildi");
        Select select=new Select( hotelListPage.dropdownElementi);
        extentTest.info("Dropdown  bolumunden secim yapıldıgı kontrol edildi");
        select.selectByIndex(1);
        hotelListPage.saveButonElementi.click();
        extentTest.info("save butonuna tiklandigi kontrol edildi");



    }
}
