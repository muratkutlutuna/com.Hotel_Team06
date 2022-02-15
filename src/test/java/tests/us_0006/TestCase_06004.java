package tests.us_0006;

import org.testng.annotations.Test;
import pages.HotelMyCampPage;

public class TestCase_06004 {

    HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();

    @Test
    public void test04(){

        hotelMyCampPage.girisYap();
        hotelMyCampPage.hotelManagementLinki.click();
        hotelMyCampPage.bekle(1);
        hotelMyCampPage.hotelRoomsLinki.click();
        hotelMyCampPage.addHotelRoomButonu.click();
        hotelMyCampPage.bekle(1);
        hotelMyCampPage.fakerCreateHotelRoom();
        hotelMyCampPage.createHotelRoomSaveButonu.click();
    }
}
