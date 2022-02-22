package tests.us_0001;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AnasayfaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class TestCase_01002 extends TestBaseRapor {
    AnasayfaPage anasayfaPage = new AnasayfaPage();

    @DataProvider
    public static Object[][] butonlar() {
        AnasayfaPage anasayfaPage = new AnasayfaPage();
        Object[][] butonlarVeTextler = {{anasayfaPage.navHomeButton, "Home"},
                {anasayfaPage.navRoomsButton, "Rooms"},
                {anasayfaPage.navRestaurantButton, "Restaurant"},
                {anasayfaPage.navAboutButton, "About"},
                {anasayfaPage.navBlogButton, "Blog"},
                {anasayfaPage.navContactButton, "Contact"},
                {anasayfaPage.navLoginButton, "Log in"}
        };
        return butonlarVeTextler;
    }

    @Test(priority = 1, dataProvider = "butonlar")
    public void navigasyonButonTest(WebElement buton, String text) {
        extentTest = extentReports.createTest("TestCase_01002", "Anasayfanin girisindeki yazilar, resimler, butonlar, inputlar ve dropdown pageler calisir ve gorunur oldugunu test edildi");
        extentTest.info("kullanici olarak ana sayfaya gidilir");        //1)Kullanici olarak ana sayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("ana sayfada navigasyondaki Home, Rooms, Restaurant, About, Blog, Contact, Login butonlari calisir durumda olduklari kontrol edilir");
        AnasayfaPage.elementCalismasiniGorunurlugunuVeYazisiniKontrolEt(buton, text);
        extentTest.pass("Navigasyon butonlari calisir durumda");
    }


    @Test(priority = 2)
    public void takvimGorunurlukTest() {
        extentTest.info("kullanici olarak ana sayfaya gidilir");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Ana sayfadaki \"\"Check-in\"\" ve \"\"check-out\"\" tarih butonlari, ve acilan takvimlerinin gorunurlukleri kontrol edilir.");
        anasayfaPage.checkIn.click();
        Assert.assertTrue(anasayfaPage.takvim.isDisplayed());
        anasayfaPage.checkOut.click();
        Assert.assertTrue(anasayfaPage.takvim.isDisplayed());
        extentTest.pass("Check in ve check out butonlari calisir durumda");
    }

    @Test(priority = 3)
    public void dropdownTest() {
        extentTest.info("tekrar anasayfaya gidilir");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Ana sayfadaki oda tipi ve musteri butonu, ve onlarin dropdown pencerelerinin calisir durumda oldukari kontrol edilir ");
        Select selectRoomType = new Select(anasayfaPage.roomTypeDropdown);
        Select selectAdults = new Select(anasayfaPage.adultsDropdown);
        selectRoomType.selectByVisibleText("Queen");
        Assert.assertTrue(selectRoomType.getFirstSelectedOption().isSelected());
        extentTest.pass("Oda tipi dropdown penceresi calisir durumda");
        selectAdults.selectByVisibleText("1 Adult");
        Assert.assertTrue(selectAdults.getFirstSelectedOption().isSelected());
        extentTest.pass("Kisi sayisi dropdown penceresi calisir durumda");
        List<WebElement> optionsRoomType = selectRoomType.getOptions();
        optionsRoomType.forEach(t -> System.out.print(t.getText()));
        List<WebElement> optionsAdults = selectAdults.getOptions();
        optionsAdults.forEach(t -> System.out.print(t.getText()));
        extentTest.info("dropdown pencerelerindeki ogeleri consola yazdirdim");
    }

    @Test(priority = 4)
    public void checkAvailabilityTest() {
        extentTest.info("tekrar anasayfaya gidilir");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Oda uygunluk testi yapilir");
        Select selectRoomType = new Select(anasayfaPage.roomTypeDropdown);
        Select selectAdults = new Select(anasayfaPage.adultsDropdown);
        //5)Ana sayfadaki Check availibility butonunun gorunur oldugu kontrol edilir
        Assert.assertTrue(anasayfaPage.checkAvailabilityButton.isDisplayed(), "Check Availability butonu gorunur degil!!");
        extentTest.pass("Check availibility butonu gorunurlugu test edildi");
        //6)kullanici olarak dropdownboxlar ve tarih verileri girilebilir olmali buton tiklanabilir olmalidir
        anasayfaPage.checkIn.clear();
        anasayfaPage.checkOut.clear();
        anasayfaPage.checkIn.sendKeys("2/15/2022");
        anasayfaPage.checkOut.sendKeys("2/20/2022");
        selectRoomType.selectByVisibleText("Double");
        selectAdults.selectByVisibleText("2 Adult");
        anasayfaPage.checkAvailabilityButton.click();
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Rooms";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        extentTest.pass("Check availibility butonu calisir durumda");

    }

    @Test(priority = 5)
    public void gecisliResimTest() {
        extentTest.info("Kullanici olarak gecisli resimler kontrol edilir");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        ReusableMethods.waitForVisibility(anasayfaPage.gecisliResim1, 5);
        Assert.assertTrue(anasayfaPage.gecisliResim1.isDisplayed());
        ReusableMethods.waitFor(1);
        ReusableMethods.waitForVisibility(anasayfaPage.gecisliResim2, 5);
        Assert.assertTrue(anasayfaPage.gecisliResim2.isDisplayed());
        ReusableMethods.waitFor(1);
        ReusableMethods.waitForVisibility(anasayfaPage.gecisliResim1, 5);
        Assert.assertTrue(anasayfaPage.gecisliResim1.isDisplayed());
        ReusableMethods.waitFor(1);
        ReusableMethods.waitForVisibility(anasayfaPage.gecisliResim2, 5);
        Assert.assertTrue(anasayfaPage.gecisliResim2.isDisplayed());
        extentTest.pass("Gecisli resimler calisdi");
    }

    @Test(priority = 6)
    public void yanlisTarihTest() {
        extentTest.info("kullanici olarak yanlis tarih ile rezervasyon yapilir");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        DateTimeFormatter duzenle = DateTimeFormatter.ofPattern("dd/MM/YYYY");
        LocalDate tarih = LocalDate.now();
        anasayfaPage.checkIn.sendKeys(tarih.minusDays(20).format(duzenle));
        anasayfaPage.checkOut.sendKeys(tarih.plusDays(5).format(duzenle));
        Select selectRoomType = new Select(anasayfaPage.roomTypeDropdown);
        Select selectAdults = new Select(anasayfaPage.adultsDropdown);
        selectRoomType.selectByVisibleText("Double");
        selectAdults.selectByVisibleText("2 Adult");
        anasayfaPage.checkAvailabilityButton.click();
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Rooms";
        Assert.assertTrue(actualTitle.contains(expectedTitle));
        extentTest.fail("Gecmis tarih olmasina ragmen calisti");
    }

}
