package tests.us_0008;

import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import pages.RoomReservationsPage_2;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class TestCase_08005 extends TestBaseRapor {

    Select select;
    RoomReservationsPage_2 locate = new RoomReservationsPage_2();
    HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
    TakesScreenshot tss = (TakesScreenshot) Driver.getDriver();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void testCase05() throws IOException {

        extentTest = extentReports.createTest("HMC Projekt",
                "Reservasyonun basaryila kaydedildigi test edildi");

        hotelMyCampPage.girisYap();
        extentTest.info("Kullanici adi ve sifre girilerek giris yapildi");

        locate.hotelManagementLinki.click();
        extentTest.info("Hotel Management yazisina tiklandi");

        locate.roomReservationsLinki.click();
        extentTest.info("Room reservations butonuna tiklandi");

        Assert.assertTrue(locate.listOfReservationsYazisi.isDisplayed());
        extentTest.info("Reservasyon olusturulacak sayfaya basarili bir sekilde gidildigi görüldü");

        locate.addRoomReservationLinki.click();
        extentTest.info("ADD ROOM RESERVATION butonuna tiklandi");

        Assert.assertTrue(locate.createHotelRoomReservatıonYazisi.isDisplayed());
        extentTest.pass("Create Hotelroomreservatıon yazisinin ekranda görüldügü gürüldü");

        locate.dropDownSelectUser.click();
        extentTest.info("Select User yazisina a tiklandi");

        ReusableMethods.waitFor(2);

        select = new Select(locate.dropDownSelectUser);
        select.selectByIndex(1);
        extentTest.info("Dropdown dan user secildi");

        locate.dropDownSelectUser.click();
        extentTest.info("Select HotelRoom yazisina tiklandi");

        select = new Select(locate.dropDownSelectHotelRoom);
        select.selectByIndex(2);
        extentTest.info("Dropdown dan bir oda secildi");


        actions.click(locate.roomReservationPrice)
                .sendKeys(ConfigReader.getProperty("RoomResevationPrice"))
                .perform();
        extentTest.info("Bug tespit edildi.==>Reservasyon ücreti olarak eksi deger girisi mümkün olmamalidir...!");

        actions.click(locate.roomReservationDateStart)
                .sendKeys(ConfigReader.getProperty("RoomReservationDateStart"))
                .perform();

        actions.click(locate.roomReservationDateEnd)
                .sendKeys(ConfigReader.getProperty("RoomReservationDateEnd"))
                .perform();
        extentTest.info("Bug tespit edildi.==>Reservasyon bitis tarihi baslangic tarihinden önce girilememelidir...!");

        actions.click(locate.roomReservationDateEnd)
                .sendKeys(Keys.TAB, Keys.TAB)
                .sendKeys(ConfigReader.getProperty("RoomReservationAdultAmount"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("RoomReservationChildrenAmount"))
                .perform();

        extentTest.info("Bug tespit edildi.==> Yetiskin ve cocuk sayisi eksi deger girilememelidir...!" +
                "\n==> Yetiskin sayisi olarak 0 girilirse sadece cocuk sayisi girilerek rezervasyon yapilamamalidir...!" +
                "\n==> Yetiskin veya cocuk sayisi 10 basamaki bir sayi girilememelidir...! Örn; 1000000000  ");

        ReusableMethods.getScreenshot("TestCase05");

        ReusableMethods.waitFor(2);

        actions.click(locate.ContactNameSurnameBox)
                .sendKeys(ConfigReader.getProperty("RoomReservationContactNameSurname"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("RoomReservationContactPhone"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("RoomReservationContactEmail"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("RoomReservationNotes"))
                .perform();
        extentTest.info("Bug tespit edildi.==> Tek bir harf girerek reservayon sahibi ad-soyad  girisi mümkün olmamalidir...!" +
                "\n==> Reservasyon iletisim numarasi olarak 0000000000 numarasi gecersiz sayilmalidir...!" +
                "\n==> Gecersiz bir E-Mail adresi girisi  mümkün olmamalidir...! Örn; -@g.com.tr ");



        ReusableMethods.getScreenshot("TestCase05.");
        ReusableMethods.waitFor(2);
        locate.approvedKutucugu.click();

        locate.roomReservationCreatButonu.click();
        extentTest.info("Reservasyonu tamamlamak icin Save butonuna basildi");


        String str = "RoomReservation was inserted successfully";

        ReusableMethods.waitFor(2);

        Assert.assertTrue(locate.reservationbasariliyazisi.isDisplayed(), "bak ....");

        extentTest.pass("Save butonuna tikladiktan sonra \"RoomReservation was inserted successfully \"\n" +
                "yazisinin ekranda görüldü.\n");
        ReusableMethods.waitFor(5);





    }


}
