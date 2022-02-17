package tests.us_0005;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestCase_05005 {

    HotelMyCampPage hotelMyCampPage;

    @Test
    public void test01() {

        TestCase_05002 tc01=new TestCase_05002();
        tc01.test01();
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.bekle(3);

        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();

        hotelMyCampPage.deleteButonElementi.click();
        hotelMyCampPage.bekle(3);
        Assert.assertTrue( hotelMyCampPage.wouldYouLikeToContinueYaziElementi.isDisplayed());
        hotelMyCampPage.okButonElementi.click();



    }
}