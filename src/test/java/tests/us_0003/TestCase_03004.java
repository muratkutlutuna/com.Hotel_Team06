package tests.us_0003;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.KayitRegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TestCase_03004 extends TestBaseRapor {
    KayitRegistrationPage kayitRegistrationPage=new KayitRegistrationPage();


    @Test
    public void test01(){
        extentTest=extentReports.createTest("HotelMyCamp us_0003 TestCase_03004","https://hotelmycamp.com test edildi");
        //4)save butonunun görünürlügü kontrol edilip butona tiklanabilmeli

        //https://www.hotelmycamp.com/ sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        // sag üstteki login butonuna tiklanir
        kayitRegistrationPage.loginLinki.click();

        //create a new account butonunun görünürlügü test edilir
        Assert.assertTrue(kayitRegistrationPage.kayitButonu.isDisplayed());
        extentTest.info("kayit butonunun görünürlügü test edildi");

        //create a new account butonuna tiklanir
        kayitRegistrationPage.kayitButonu.click();

        //Kayit sayfasinin acildigi kontrol edilir
        Assert.assertTrue(kayitRegistrationPage.kayitSayfasi.isDisplayed());
        extentTest.info("kayit sayfasinin acildigi test edildi");

        //username textbox unun görünürlügü kontrol edilmeli ve kullanici ismi girilmeli
        Assert.assertTrue(kayitRegistrationPage.usernameBox.isDisplayed());
        extentTest.info("username boxunun görünürlügü test edildi");
        Faker faker=new Faker();
        kayitRegistrationPage.usernameBox.sendKeys(faker.name().username());

        //password textbox unun görünürlügü kontrol edilmeli ve sifre girilmeli
        Assert.assertTrue(kayitRegistrationPage.passwordBox.isDisplayed());
        extentTest.info("password boxunun görünürlügü test edildi");
        kayitRegistrationPage.passwordBox.sendKeys("Aa12345.");

        //e mail text boxunun görünürlügü kontrol edilmeli ve e mail girilmeli
        Assert.assertTrue(kayitRegistrationPage.eMailBox.isDisplayed());
        extentTest.info("email boxunun görünürlügü test edildi");
        kayitRegistrationPage.eMailBox.sendKeys(faker.internet().emailAddress());

        //full name text boxunun görünürlügü kontrol edilmeli ve tam isim girilmeli
        Assert.assertTrue(kayitRegistrationPage.fullName.isDisplayed());
        extentTest.info("fullname boxunun görünürlügü test edildi");
        kayitRegistrationPage.fullName.sendKeys(faker.name().fullName());

        //Phone no textboxunun görünürlügü kontrol edilmeli ve telefon numarasi girilmeli
        Assert.assertTrue(kayitRegistrationPage.phoneNumber.isDisplayed());
        extentTest.info("Phone Number boxunun görünürlügü test edildi");
        kayitRegistrationPage.phoneNumber.sendKeys(faker.phoneNumber().phoneNumber());

        //Social Security Number text boxunun görünürlügü kontrol edilmeli ve sosyal güvenlik numarasi girilmeli
        Assert.assertTrue(kayitRegistrationPage.socialSecurityNumber.isDisplayed());
        extentTest.info("SSN boxunun görünürlügü test edildi");
        kayitRegistrationPage.socialSecurityNumber.sendKeys("123456789");

        //Driving License textboxunun görünürlgü kontrol edilmeli ve ehliyet numarasi girlmeli
        Assert.assertTrue(kayitRegistrationPage.drivingLicense.isDisplayed());
        extentTest.info("Driving License boxunun görünürlügü test edildi");
        kayitRegistrationPage.drivingLicense.sendKeys("347839473");

        //select country textboxunun görünürlügü kontrol edilmeli ve ülke secilmeli
        Assert.assertTrue(kayitRegistrationPage.selectCountryBox.isDisplayed());
        extentTest.info("select country boxunun görünürlügü test edildi");
        Select select=new Select(kayitRegistrationPage.selectCountryBox);
        select.selectByVisibleText("Germany");

        //select state text boxunun görünürlügü kontrol edilmeli ve varsa eyalet secilmeli
        Assert.assertTrue(kayitRegistrationPage.selectStateBox.isDisplayed());
        extentTest.info("select state boxunun görünürlügü test edildi");

        //Adress textboxunun görünürlügü kontrol edilmeli ve adres girilmeli
        Assert.assertTrue(kayitRegistrationPage.adressBox.isDisplayed());
        extentTest.info("Adress boxunun görünürlügü test edildi");
        kayitRegistrationPage.adressBox.sendKeys("absc str. 17");

        //Working sector text boxunun görünürlügü kontrol edilmeli ve is alani girilmeli
        Assert.assertTrue(kayitRegistrationPage.workingSectorBox.isDisplayed());
        extentTest.info("Working Sector boxunun görünürlügü test edildi");
        kayitRegistrationPage.workingSectorBox.sendKeys("IT");

        //birth date text boxunun görünürlügü kontrol edilmeli ve dogum tarihi girilmeli
        Assert.assertTrue(kayitRegistrationPage.birthDateBox.isDisplayed());
        extentTest.info("birth date boxunun görünürlügü test edildi");
        kayitRegistrationPage.birthDateBox.sendKeys("12.08.1995");

        //save butonun görünürlügü kontrol edilip butona basilmali
        Assert.assertTrue(kayitRegistrationPage.registerSaveButonu.isDisplayed());
        extentTest.info("save butonunun görünürlügü test edildi");
        kayitRegistrationPage.registerSaveButonu.click();
    }
}
