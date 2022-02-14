package tests.us_0007;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_03 {






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

    @Test
    public void test03 () {

        //HOTELMYCAMP ana sayfasına gidilir
        //Login butonuna tiklanir
        //Username'e gecerli bir username girilir
        //Password'a gecerli bir password girilir
        //Log in butonuna tiklanir

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.usernameBox.sendKeys("manager");
        hotelMyCampPage.passwordBox.sendKeys("Manager1!");
        hotelMyCampPage.loginButonu.click();



        //"Hotel Management" menüsü tiklanir
        //"Hotel Rooms" link butonu tıklanır
        //"DETAILS" butonu tiklanır


        hotelMyCampPage.hotelManagementLinki.click();

        WebElement roomListLinki = Driver.getDriver().findElement(By.xpath("//a[@href='/admin/HotelRoomAdmin']"));
        roomListLinki.click();

        WebElement detailsButton = Driver.getDriver().findElement(By.xpath("//a[@href='./HotelRoomAdmin/Edit?Id=13']"));
        detailsButton.click();

        // buraya kadar az farkla test case - 2 ile aynı





    }
}
