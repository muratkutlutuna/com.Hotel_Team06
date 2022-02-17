package tests.us_0005;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestCase_05004 {



    @Test
    public  void test01() {
        TestCase_05003 tc01=new TestCase_05003();
        tc01.test01();
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        ReusableMethods.waitFor(3);
        Assert.assertTrue( hotelMyCampPage.hotelWasupdatedSuccessfullyYaziElementi.isDisplayed());
        hotelMyCampPage.okButonElementi.click();

    }
}
