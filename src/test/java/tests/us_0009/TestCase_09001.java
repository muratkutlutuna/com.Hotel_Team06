package tests.us_0009;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;
import utilities.JSUtils;

public class TestCase_09001 {
    HotelMyCampPage hotelMyCampPage;

    @Test
    public void test01() {

        hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.roomReservation();
        Assert.assertTrue(hotelMyCampPage.roomReservationGirisYazisiElementi.isDisplayed());


    }

}
