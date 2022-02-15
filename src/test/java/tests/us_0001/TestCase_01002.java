package tests.us_0001;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestCase_01002 {
    HotelMyCampPage hotelMyCampPage;

    @Test
    public void navigasyonButonlariTesti() {
        hotelMyCampPage = new HotelMyCampPage();
        //1)Kullanici olarak ana sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        //"2)ana sayfada navigasyondaki Home, Rooms, Restaurant, About, Blog,
        //Contact, Login butonlari calisir durumda olduklari kontrol edilir"
        ReusableMethods.navElementCalismasiniGorunurlugunuVeYazisiniKontrolEt(hotelMyCampPage.navHomeButton,"Home");
        ReusableMethods.navElementCalismasiniGorunurlugunuVeYazisiniKontrolEt(hotelMyCampPage.navRoomsButton,"Rooms");
        ReusableMethods.navElementCalismasiniGorunurlugunuVeYazisiniKontrolEt(hotelMyCampPage.navRestaurantButton,"Restaurant");
        ReusableMethods.navElementCalismasiniGorunurlugunuVeYazisiniKontrolEt(hotelMyCampPage.navAboutButton,"About");
        ReusableMethods.navElementCalismasiniGorunurlugunuVeYazisiniKontrolEt(hotelMyCampPage.navBlogButton,"Blog");
        ReusableMethods.navElementCalismasiniGorunurlugunuVeYazisiniKontrolEt(hotelMyCampPage.navContactButton,"Contact");
        ReusableMethods.navElementCalismasiniGorunurlugunuVeYazisiniKontrolEt(hotelMyCampPage.navLoginButton,"Log in");
        }

    @Test
    public void takvimGorunurlukTesti(){
        //"3)Ana sayfadaki ""Check-in"" ve ""check-out"" tarih butonlari,
        //ve acilan takvimlerinin gorunurlukleri kontrol edilir."
        hotelMyCampPage.checkIn.click();
        Assert.assertTrue(hotelMyCampPage.takvim.isDisplayed());
        hotelMyCampPage.checkOut.click();
        Assert.assertTrue(hotelMyCampPage.takvim.isDisplayed());
 }
    @Test
    public void dropdownTesti(){
        //"4)Ana sayfadaki oda tipi ve musteri butonu, ve
        //onlari dropdown pencerelerinin calisir durumda oldukari kontrol edilir "
        //5)kullanici olarak dropdownboxlar ve tarih verileri girilebilir olmali buton tiklanabilir olmalidir
        //6)Ana sayfadaki Check availibility butonunun gorunur oldugu kontrol edilir
        //7)kullanici olarak gecisli resimler kontrol edilir

        Select selectRoomType = new Select(hotelMyCampPage.roomTypeDropdown);
        Select selectAdults = new Select(hotelMyCampPage.adultsDropdown);


    }


}
