package tests.us_0005;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestCase_05002 {



    @Test
    public void test01() {
        TestCase_05001 tc01=new TestCase_05001();
        tc01.test01();
        ReusableMethods.waitFor(2);
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkDetailsButonElementi.click();
        ReusableMethods.switchToWindow("Admin - Edit Hotel");
        Assert.assertTrue(hotelMyCampPage.editHotelYaziElementi.isDisplayed());


    }
}