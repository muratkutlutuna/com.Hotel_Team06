package tests.us_0009;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.JSUtils;

public class TestCase_09003 {

    HotelMyCampPage hotelMyCampPage;
    TestCase_09002 dependson1 = new TestCase_09002();

    @Test
    public void test03() {
        dependson1.test02();
        hotelMyCampPage = new HotelMyCampPage();

        hotelMyCampPage.dateStartElementi.clear();
        hotelMyCampPage.dateStartElementi.sendKeys("01/06/2022");

        hotelMyCampPage.dateEndElementi.clear();
        hotelMyCampPage.dateEndElementi.sendKeys("01/08/2022");

        hotelMyCampPage.adultAmountElementiBosTiklama.click();
        hotelMyCampPage.bekle(2);

        JSUtils.scrollIntoVIewJS(hotelMyCampPage.adultAmountElementi);

        hotelMyCampPage.adultAmountElementi.clear();
        hotelMyCampPage.adultAmountElementi.sendKeys("5");

        hotelMyCampPage.childrenAmountElementi.clear();
        hotelMyCampPage.childrenAmountElementi.sendKeys("5");

        hotelMyCampPage.notesElementi.clear();
        hotelMyCampPage.notesElementi.sendKeys("Hosgeldiniz");
        hotelMyCampPage.generalDataSaveButonu.click();

        Assert.assertTrue(hotelMyCampPage.updatedSuccessfullyYazisiElementi.isDisplayed());


    }
}
