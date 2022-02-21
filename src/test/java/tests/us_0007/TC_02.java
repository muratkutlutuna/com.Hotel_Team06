package tests.us_0007;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC_02 {

    //HOTELMYCAMP ana sayfasına gidilir
    //Login butonuna tiklanir
    //Username'e gecerli bir username girilir
    //Password'a gecerli bir password girilir
    //Log in butonuna tiklanir

    //"Hotel Management" menüsü tiklanir
    //"Hotel Rooms" link butonu tıklanır
    //"DETAILS" butonu tiklanır
    //"Edit Hotelroom" yazisinin görünürlüğü test edilir

    @Test
    public void test02 () {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.usernameBox.sendKeys("manager");
        hotelMyCampPage.passwordBox.sendKeys("Manager1!");
        hotelMyCampPage.loginButonu.click();
        // buraya kadar az farkla birlikte test case ile aynı


        hotelMyCampPage.hotelManagementLinki.click();

        WebElement roomListLinki = Driver.getDriver().findElement(By.xpath("//a[@href='/admin/HotelRoomAdmin']"));
        roomListLinki.click();

        WebElement detailsButton = Driver.getDriver().findElement(By.xpath("//a[@href='./HotelRoomAdmin/Edit?Id=13']"));
        detailsButton.click();

        WebElement editHotelRoom = Driver.getDriver().findElement(By.xpath("//a[text()='Edit Hotelroom']"));

        Assert.assertTrue(editHotelRoom.isDisplayed(), "Oda bilgilerini guncelleme sayfasına basarili giris yapılamadı");


    }


}
