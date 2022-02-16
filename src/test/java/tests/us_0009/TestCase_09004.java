package tests.us_0009;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.JSUtils;

public class TestCase_09004 {

    @Test
    public void test04() {
        TestCase_09002 dependson = new TestCase_09002();
        dependson.test02();
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.roomReservationsPropertiesElementi.click();
        Select select=new Select(hotelMyCampPage.propertiesTipElementi);
        select.selectByIndex(1);

        hotelMyCampPage.propertiesCodeElementi.sendKeys("1234");
        hotelMyCampPage.propertiesValueElementi.sendKeys("Test1234");
        hotelMyCampPage.bekle(2);
        JSUtils.scrollIntoVIewJS(hotelMyCampPage.propertiesSaveElementi);
        hotelMyCampPage.propertiesSaveElementi.click();

        hotelMyCampPage.bekle(2);
        Assert.assertTrue(hotelMyCampPage.valueaddedElementi.isDisplayed());
        hotelMyCampPage.valueaddedOkButonuElementi.click();


    }

}
