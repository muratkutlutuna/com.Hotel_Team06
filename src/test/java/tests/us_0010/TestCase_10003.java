package tests.us_0010;

import org.testng.annotations.Test;
import pages.HotelMyCampPage;

public class TestCase_10003 {

    @Test
    public void odaSecilebirligi(){
        TestCase_10002 ikinciTest= new TestCase_10002();
        ikinciTest.advancedSearchTest();

        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.doubleRoomSecenekleriElementi.click();




    }
}
