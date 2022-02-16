package tests.us_0009;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.JSUtils;

public class TestCase_09005 {
    @Test
    public void test05() {
        TestCase_09002 dependson = new TestCase_09002();
        dependson.test02();
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        JSUtils.scrollIntoVIewJS(hotelMyCampPage.generalDataDeleteButonu);
        hotelMyCampPage.bekle(2);
        hotelMyCampPage.generalDataDeleteButonu.click();
        Assert.assertTrue(hotelMyCampPage.reservationSilinmesiOnayiElementi.isDisplayed());


    }
}
