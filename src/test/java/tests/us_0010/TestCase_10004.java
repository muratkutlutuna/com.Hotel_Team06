package tests.us_0010;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;

public class TestCase_10004 {

    @Test
    public void bookNowTesti() {
        TestCase_10003 ucuncuTest = new TestCase_10003();
        ucuncuTest.odaSecilebirligi();

        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
      //  Assert.assertTrue(hotelMyCampPage.ilkOdaSecenegiMoonBookNowElementi.isDisplayed());
      //  hotelMyCampPage.ilkOdaSecenegiMoonBookNowElementi.click();

}
}
