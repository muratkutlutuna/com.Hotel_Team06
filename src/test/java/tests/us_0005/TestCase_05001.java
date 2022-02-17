package tests.us_0005;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestCase_05001 {

    HotelMyCampPage hotelMyCampPage;

    @Test
    public  void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.girisYap();
        hotelMyCampPage.hotelManagementYaziElementi.click();
        hotelMyCampPage.hotelListIkonElementi.click();
        Assert.assertTrue(hotelMyCampPage.listOfHotelYaziElementi.isDisplayed());



    }
}
