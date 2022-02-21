package tests.us_0005;

import org.openqa.selenium.Keys;
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

public class TestCase_05005 extends TestBaseRapor {



    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest=extentReports.createTest("HotelMyCamp us_0005  TestCase_05001","https://hotelmycamp.com test edildi");


        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        HotelListPage hotelListPage=new HotelListPage();

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



        hotelListPage.photosButonElementi.click();
        extentTest.info("Photos bolumune tiklandigi kontrol edildi");
        Assert.assertTrue(hotelListPage.selectFileButonElementi.isEnabled());
        extentTest.info("selectFile butonunun tiklanabildigi kontrol edildi");
        ReusableMethods.waitFor(2);

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

        Driver.closeDriver();

    }
}