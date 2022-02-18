package tests.us_0005;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import pages.HotelListPage;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TestCase_05006 extends TestBaseRapor {



    @Test
    public void test01() {

        TestCase_05002 tc01=new TestCase_05002();
        tc01.test01();
        extentTest=extentReports.createTest("HotelMyCamp us_0005  TestCase_05003","https://hotelmycamp.com test edildi");
        HotelListPage hotelListPage=new HotelListPage();

        hotelListPage.photosButonElementi.click();
        extentTest.info("Photos bolumune tiklandigi kontrol edildi");

        Assert.assertTrue(hotelListPage.selectFileButonElementi.isEnabled());
        extentTest.info("selectFile butonunun tiklanabildigi kontrol edildi");

        hotelListPage.propertiesButonElementi.click();
        extentTest.info("properties bolumune tiklanabildigi kontrol edildi");
        Select select=new Select( hotelListPage.tipBolumuDropDownElementi);
        extentTest.info("dropdown  bolumunden  secim yapilabildigi kontrol edildi");
        select.selectByIndex(2);

        hotelListPage.properpiesCodeBolumuElementi.sendKeys("11111");
        hotelListPage.valueBolumuElementi.sendKeys("test");
        extentTest.info("alanlarin doldurulabildigi kontrol edildi");
        ReusableMethods.waitFor(2);
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.waitFor(3);
        Assert.assertTrue(hotelListPage.propertiesSaveButonElementi.isEnabled());
        extentTest.info("Save butonuna tiklanabildigi kontrol edildi");

    }
}