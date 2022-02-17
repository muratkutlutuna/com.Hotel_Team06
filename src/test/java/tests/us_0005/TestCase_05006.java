package tests.us_0005;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestCase_05006 {

    HotelMyCampPage hotelMyCampPage;

    @Test
    public void test01() {
        TestCase_05002 tc01=new TestCase_05002();
        tc01.test01();
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.photosButonElementi.click();
        Assert.assertTrue(hotelMyCampPage.selectFileButonElementi.isEnabled());

        hotelMyCampPage.propertiesButonElementi.click();
        Select select=new Select( hotelMyCampPage.tipBolumuDropDownElementi);
        select.selectByIndex(2);
        hotelMyCampPage.properpiesCodeBolumuElementi.sendKeys("11111");
        hotelMyCampPage.valueBolumuElementi.sendKeys("test");
        ReusableMethods.waitFor(2);
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        hotelMyCampPage.bekle(2);
        Assert.assertTrue(hotelMyCampPage.propertiesSaveButonElementi.isEnabled());


    }
}