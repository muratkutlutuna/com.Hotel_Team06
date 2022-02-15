package tests.us_0006;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;

public class TestCase_06001 {

    HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();

    @Test
    public void test01() {

        hotelMyCampPage.girisYap();
        Assert.assertTrue(hotelMyCampPage.addUserButonu.isEnabled());
    }

}