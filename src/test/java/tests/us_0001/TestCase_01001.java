package tests.us_0001;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TestCase_01001 {
    HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
    @Test
    public void test_01(){
        //1)kullanici olarak ana sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        //2)Title'in "Hotelmycamp"icerdigi kontrol edilir
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = ConfigReader.getProperty("anaSayfaTitle");
        Assert.assertEquals(actualTitle,expectedTitle,"Title beklenen gibi degil!!");
        //3)url'nin "https://www.hotelmycamp.com/" oldugu kontrol edilir
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("HMCUrl");
        Assert.assertEquals(actualUrl,expectedUrl,"Url beklenen gibi degil!!");
        //4)Ana sayfaya gidildiginde "HOTELMYCAMP" ikonu gorulur olmalidir
        String expectedIcon = "HOTELMYCAMP";
        String actualIcon = hotelMyCampPage.logo.getText();
        Assert.assertEquals(actualIcon, expectedIcon,"Logo beklenen gibi degil!!");
    }
}
