package tests.us_0006;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;

public class TestCase_06002 {

    HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();

    @Test
    public void test02(){
        hotelMyCampPage.girisYap();
        hotelMyCampPage.hotelManagementLinki.click();
        hotelMyCampPage.bekle(1);
        hotelMyCampPage.hotelRoomsLinki.click();
        Assert.assertTrue(hotelMyCampPage.addHotelRoomButonu.isEnabled());
    }

}
