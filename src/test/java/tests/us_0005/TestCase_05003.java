package tests.us_0005;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestCase_05003 {


    @Test
    public  void test01() {
        TestCase_05002 tc01=new TestCase_05002();
        tc01.test01();
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();

        hotelMyCampPage.codeKutusuElementi.clear();
        hotelMyCampPage.codeKutusuElementi.sendKeys("12345");
        hotelMyCampPage.nameKutusuElementi.clear();
        hotelMyCampPage.nameKutusuElementi.sendKeys("Green Garden");
        hotelMyCampPage.addressKutusuElementi.clear();
        hotelMyCampPage.addressKutusuElementi.sendKeys("Mugla");
        hotelMyCampPage.phoneKutusuElementi.clear();
        hotelMyCampPage.phoneKutusuElementi.sendKeys("123456789");
        hotelMyCampPage.emailKutusuElementi.clear();
        hotelMyCampPage.emailKutusuElementi.sendKeys("tatil@tatil.com");
        Select select=new Select( hotelMyCampPage.dropdownElementi);
        select.selectByIndex(1);
        hotelMyCampPage.saveButonElementi.click();


    }
}
