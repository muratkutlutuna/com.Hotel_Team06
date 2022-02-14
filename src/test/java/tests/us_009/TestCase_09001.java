package tests.us_009;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;
import utilities.JSUtils;
import utilities.ReusableMethods;

public class TestCase_09001 {


    @Test
    public void test(){

        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.roomReservation();
        Assert.assertTrue(hotelMyCampPage.roomReservationGirisYazisiElementi.isDisplayed());

        hotelMyCampPage.contactNameSurnameBox.sendKeys("Aslan");
        Actions actions=new Actions(Driver.getDriver());
        hotelMyCampPage.tableElement.click();
        actions.sendKeys(Keys.ARROW_RIGHT).sendKeys(Keys.ARROW_RIGHT);
        hotelMyCampPage.roomReservationSearchElementi.click();
        hotelMyCampPage.bekle(2);
        hotelMyCampPage.searchtenSonrakiDetailsElementi.click();
        Assert.assertTrue(hotelMyCampPage.editHotelroomreservatıonElementi.isDisplayed());

        hotelMyCampPage.dateStartElementi.clear();
        hotelMyCampPage.dateStartElementi.sendKeys("01/12/2022");
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

    }

}
