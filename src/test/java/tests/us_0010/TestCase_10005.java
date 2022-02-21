package tests.us_0010;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;

public class TestCase_10005 {
    @Test
    public void loginButonuTesti(){
        TestCase_10004 dorduncuTest=new TestCase_10004();
        dorduncuTest.bookNowTesti();

        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        Assert.assertTrue(hotelMyCampPage.ikinciLoginLinki.isDisplayed());
        hotelMyCampPage.ikinciLoginLinki.click();
    }
}
