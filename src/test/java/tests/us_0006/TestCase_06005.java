package tests.us_0006;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;

public class TestCase_06005 {

    HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();

    @Test
    public void test05() {

        hotelMyCampPage.girisYap();
        hotelMyCampPage.hotelManagementLinki.click();
        hotelMyCampPage.bekle(1);
        hotelMyCampPage.hotelRoomsLinki.click();
        hotelMyCampPage.addHotelRoomButonu.click();
        hotelMyCampPage.bekle(1);
        hotelMyCampPage.fakerCreateHotelRoom();
        hotelMyCampPage.createHotelRoomSaveButonu.click();
        hotelMyCampPage.bekle(2);
        Assert.assertTrue(hotelMyCampPage.başarılıKayıtYazısıElementi.isDisplayed());
        hotelMyCampPage.başarılıKayıtOKButonu.click();
    }
}
