package tests.us_0010;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TestCase_10001 {


    @Test
   public  void roomsTest() {
        //1- "https://www.hotelmycamp.com/" sayfasina gider
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.navRoomsButton.click();


    }

}
