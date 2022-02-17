package tests.us_0009;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.JSUtils;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TestCase_09005 extends TestBaseRapor {
    @Test
    public void test05() {
        extentTest=extentReports.createTest("Rezervasyonun Silinmesi","Rezervazyonunun silinmesi test edildi");
        TestCase_09002 dependson = new TestCase_09002();
        dependson.test02();
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        JSUtils.scrollIntoVIewJS(hotelMyCampPage.generalDataDeleteButonu);
        ReusableMethods.waitFor(2);
        hotelMyCampPage.generalDataDeleteButonu.click();
        Assert.assertTrue(hotelMyCampPage.reservationSilinmesiOnayiElementi.isDisplayed());
        extentTest.info("Delete butonunun islevi test edildi");


    }
}
