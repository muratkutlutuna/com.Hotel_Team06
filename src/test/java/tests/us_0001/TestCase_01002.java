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

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static java.time.LocalDate.now;
import static org.testng.TestRunner.PriorityWeight.priority;

public class TestCase_01002 {
    HotelMyCampPage hotelMyCampPage;

    @Test (priority = 1)
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
        ////========Element Test Etme=====//
    //    public static void navElementCalismasiniGorunurlugunuVeYazisiniKontrolEt(WebElement webElement, String beklenenElementYazisi) {
    //        Assert.assertTrue(webElement.isDisplayed(),beklenenElementYazisi+" elementi gorunmuyor!!");
    //        Assert.assertTrue(webElement.getText().contains(beklenenElementYazisi),beklenenElementYazisi+" elementinin yazisi yanlis!!");
    //        webElement.click();
    //        String actualTitle = Driver.getDriver().getTitle();
    //        Assert.assertTrue(actualTitle.contains(beklenenElementYazisi),beklenenElementYazisi+" linki calismiyor!!");
    //        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
    //    }

    @Test (priority = 2)
    public void takvimGorunurlukTesti(){
        //"3)Ana sayfadaki ""Check-in"" ve ""check-out"" tarih butonlari,
        //ve acilan takvimlerinin gorunurlukleri kontrol edilir."
        hotelMyCampPage = new HotelMyCampPage();
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage.checkIn.click();
        Assert.assertTrue(hotelMyCampPage.takvim.isDisplayed());
        hotelMyCampPage.checkOut.click();
        Assert.assertTrue(hotelMyCampPage.takvim.isDisplayed());
 }
    @Test (priority = 3)
    public void dropdownTesti(){
        //"4)Ana sayfadaki oda tipi ve musteri butonu, ve
        //onlari dropdown pencerelerinin calisir durumda oldukari kontrol edilir "
        hotelMyCampPage = new HotelMyCampPage();
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        Select selectRoomType = new Select(hotelMyCampPage.roomTypeDropdown);
        Select selectAdults = new Select(hotelMyCampPage.adultsDropdown);
        selectRoomType.selectByVisibleText("Queen");
        Assert.assertTrue(selectRoomType.getFirstSelectedOption().isSelected());
        selectAdults.selectByVisibleText("1 Adult");
        Assert.assertTrue(selectAdults.getFirstSelectedOption().isSelected());
        List<WebElement> optionsRoomType = selectRoomType.getOptions();
        optionsRoomType.forEach(t -> System.out.print(t.getText()));
        List<WebElement> optionsAdults = selectAdults.getOptions();
        optionsAdults.forEach(t -> System.out.print(t.getText()));
    }
    @Test (priority=4)
    public void checkAvailabilityTesti(){
        hotelMyCampPage = new HotelMyCampPage();
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        Select selectRoomType = new Select(hotelMyCampPage.roomTypeDropdown);
        Select selectAdults = new Select(hotelMyCampPage.adultsDropdown);
        //5)Ana sayfadaki Check availibility butonunun gorunur oldugu kontrol edilir
        Assert.assertTrue(hotelMyCampPage.checkAvailabilityButton.isDisplayed(),"Check Availability butonu gorunur degil!!");
        //6)kullanici olarak dropdownboxlar ve tarih verileri girilebilir olmali buton tiklanabilir olmalidir
        hotelMyCampPage.checkIn.clear();
        hotelMyCampPage.checkOut.clear();
        hotelMyCampPage.checkIn.sendKeys("2/15/2022");
        hotelMyCampPage.checkOut.sendKeys("2/20/2022");
        selectRoomType.selectByVisibleText("Double");
        selectAdults.selectByVisibleText("2 Adult");
        hotelMyCampPage.checkAvailabilityButton.click();
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Rooms";
        Assert.assertTrue(actualTitle.contains(expectedTitle));

    }
    @Test
    public void gecisliResimTesti(){
        //7)kullanici olarak gecisli resimler kontrol edilir
        hotelMyCampPage = new HotelMyCampPage();
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        ReusableMethods.waitForVisibility(hotelMyCampPage.gecisliResim1,5);
        Assert.assertTrue(hotelMyCampPage.gecisliResim1.isDisplayed());
        ReusableMethods.waitFor(1);
        ReusableMethods.waitForVisibility(hotelMyCampPage.gecisliResim2,5);
        Assert.assertTrue(hotelMyCampPage.gecisliResim2.isDisplayed());
        ReusableMethods.waitFor(1);
        ReusableMethods.waitForVisibility(hotelMyCampPage.gecisliResim1,5);
        Assert.assertTrue(hotelMyCampPage.gecisliResim1.isDisplayed());
        ReusableMethods.waitFor(1);
        ReusableMethods.waitForVisibility(hotelMyCampPage.gecisliResim2,5);
        Assert.assertTrue(hotelMyCampPage.gecisliResim2.isDisplayed());

    }

    @Test (priority = 5)
    public void yanlisTarihTesti(){
        //8)kullanici olarak yanlis tarih ile rezervasyon testi
        hotelMyCampPage = new HotelMyCampPage();
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        DateTimeFormatter duzenle = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        LocalDate tarih = LocalDate.now();
        hotelMyCampPage.checkIn.sendKeys(tarih.minusDays(20).format(duzenle));
        hotelMyCampPage.checkOut.sendKeys(tarih.plusDays(5).format(duzenle));
        Select selectRoomType = new Select(hotelMyCampPage.roomTypeDropdown);
        Select selectAdults = new Select(hotelMyCampPage.adultsDropdown);
        selectRoomType.selectByVisibleText("Double");
        selectAdults.selectByVisibleText("2 Adult");
        hotelMyCampPage.checkAvailabilityButton.click();
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Rooms";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

}
