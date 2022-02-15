package tests.us_0008;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class TestCase_08001 {

    @Test

    public void TestCase01(){

        // HotelMyCamp sitesine gidilir
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        // Sayfa URL nin https://www.hotelmycamp.com/ oldugu kotrol edilir

        String hotelMyCampUrl="https://www.hotelmycamp.com/";
        String actualHotelMyCampUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(actualHotelMyCampUrl, hotelMyCampUrl, "HotelMyCamp Url i uyusmuyor ");

        Driver.closeDriver();


    }




}
