package tests.us_0009;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestCase_09002 {
    HotelMyCampPage hotelMyCampPage;
    TestCase_09001 dependson = new TestCase_09001();


    @Test
    public void test02() {
        dependson.test01();
        hotelMyCampPage = new HotelMyCampPage();

        hotelMyCampPage.contactNameSurnameBox.sendKeys("Aslan");
        Actions actions = new Actions(Driver.getDriver());
        hotelMyCampPage.tableElement.click();
        actions.sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT);
        hotelMyCampPage.roomReservationSearchElementi.click();
        ReusableMethods.waitFor(2);
        hotelMyCampPage.searchtenSonrakiDetailsElementi.click();
        Assert.assertTrue(hotelMyCampPage.editHotelroomreservatıonElementi.isDisplayed());
    }
}
