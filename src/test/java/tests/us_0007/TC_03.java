package tests.us_0007;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import pages.RoomGuncellemePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class TC_03 extends TestBaseRapor  {


    @Test
    public void test03 () throws IOException {

        //HOTELMYCAMP ana sayfasına gidilir
        //Login butonuna tiklanir
        //Username'e gecerli bir username girilir
        //Password'a gecerli bir password girilir
        //Log in butonuna tiklanir

        extentTest=extentReports.createTest("Yönetici oda bilgilerinde değişiklik yapabilmelidir", "Oda bilgilerinde değişiklik yapılması ve kaydedilmesi test edildi");

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.loginButonu.click();

        //"Hotel Management" menüsü tiklanir
        //"Hotel Rooms" link butonu tıklanır
        //"DETAILS" butonu tiklanır

        hotelMyCampPage.hotelManagementLinki.click();

        RoomGuncellemePage roomGuncellemePage = new RoomGuncellemePage();

        roomGuncellemePage.roomListLinki.click();

        roomGuncellemePage.detailsButton.click();

    // buraya kadar az farkla TC-2 ile aynı


        //"Hotel" başlıklı dropdown menüye tıklar, bir otel adı seçer
        //"Code" kutucuguna tiklar bir kod girilir
        //"Name" kutucuguna tiklar bir İsim girilir
        //"Location" kutucuguna tiklar bir şehir girilir
        //"Description" kutucuguna tiklar açıklama girilir
        //"Price" kutucuguna tiklar fiyat girilir
        //"Room type" dropdown menusunden oda tipi seçer
        //"Max Adult Count" kutusuna tıklar max. yetişkin sayısı girer
        //"Max Children Count" kutusuna tıklar max. çocuk sayısı girer
        //"IsAvailable" kutucugu tıklanır
        //"Save" butonu tiklanir
        //Açılan pencerede "HotelRoom was updated successfully" textinin görünürlüğü test edilir ve "OK" tıklanır.

                // ====== TEST DATASI ======= //

        //HAPPY HOTEL
        //1234
        //Haydar Aslan
        //Madrid
        //klımalı oda
        //250
        //Double
        //2
        //4


        Select select1 = new Select(roomGuncellemePage.hotelSelectDropdownButton);
        select1.selectByVisibleText("HAPPY HOTEL");

        hotelMyCampPage.addHotelCodeKutusu.clear();
        hotelMyCampPage.addHotelCodeKutusu.sendKeys("1234");

        roomGuncellemePage.nameBox.clear();
        roomGuncellemePage.nameBox.sendKeys("Haydar Aslan");

       roomGuncellemePage.locationBox.clear();
       roomGuncellemePage.locationBox.sendKeys("Madrid");

        roomGuncellemePage.descriptionBox.clear();
        roomGuncellemePage.descriptionBox.sendKeys("klımalı oda");

        hotelMyCampPage.reservationCreatPrice.clear();
        hotelMyCampPage.reservationCreatPrice.sendKeys("250");

        Select select2 = new Select(roomGuncellemePage.roomTypeDropdownButton);
        select2.selectByVisibleText("Double");

        roomGuncellemePage.maxAdultBox.clear();
        roomGuncellemePage.maxAdultBox.sendKeys("2");

        roomGuncellemePage.maxChildBox.clear();
        roomGuncellemePage.maxChildBox.sendKeys("4");


        if (!roomGuncellemePage.isAvailableBox.isSelected()) {
            roomGuncellemePage.isAvailableBox.click();
        }

        extentTest.info("Oda bilgilerini içeren kutucuklara test verileri basarili olarak giris yapıldı");

        roomGuncellemePage.saveRoomButton.click();


       roomGuncellemePage.basarılıOdaKayıtTexti.isDisplayed();

       extentTest.info("Girilen bilgiler basarili olarak kaydedildi");

       ReusableMethods.waitFor(2); // OK e hemen basılmıyor, o nedenle 2 sn bekletiyoruz

       roomGuncellemePage.okButton.click();


    }
}
