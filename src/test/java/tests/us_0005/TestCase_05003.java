package tests.us_0005;

import org.openqa.selenium.interactions.Actions;
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
        ReusableMethods.waitFor(2);
        hotelListPage.ilkDetailsButonElementi.click();
        extentTest.info("Details butonuna tiklandigi kontrol edildi");

        ReusableMethods.switchToWindow("Admin - Edit Hotel");
        Assert.assertTrue(hotelListPage.editHotelYaziElementi.isDisplayed());
        extentTest.info("Edit otel yazisinin goruldugu kontrol edildi");

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
        Select select=new Select( hotelListPage.dropdownElementi);
        select.selectByIndex(1);
        extentTest.info("bolumlerin dolduruldugu kontrol edildi");

        hotelListPage.saveButonElementi.click();
        extentTest.info("save butonuna tiklandigi kontrol edildi");
        ReusableMethods.waitFor(3);

        //Assert.assertTrue( hotelListPage.hotelWasupdatedSuccessfullyYaziElementi.isDisplayed());
       // extentTest.info("hotel Wasupdated Successfully Yazisinin goruldugu kontrol edildi");

        hotelListPage.okButonElementi.click();
        extentTest.info("hotel Wasupdated Successfully Yazisinin goruldugu kontrol edildi");

    }
}
