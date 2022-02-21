package tests.us_0007;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

import java.io.File;
import java.io.IOException;

public class TC_03 extends TestBaseRapor {


    @Test
    public void test03 () throws IOException {

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

        //Jasmine
        //1234
        //Haydar Aslan
        //Madrid
        //klımalı oda
        //250
        //Double
        //2
        //4
        WebElement hotelSelectDropdownButton = Driver.getDriver().findElement(By.xpath("//select[@id='IDHotel']"));
        Select select1 = new Select(hotelSelectDropdownButton);
        select1.selectByVisibleText("HAPPY HOTEL");

        WebElement codeBox = Driver.getDriver().findElement(By.xpath("//input[@id='Code']"));
        codeBox.clear();
        codeBox.sendKeys("1234");

        WebElement nameBox = Driver.getDriver().findElement(By.xpath("//input[@id='Name']"));
        nameBox.clear();
        nameBox.sendKeys("Haydar Aslan");

        WebElement locationBox = Driver.getDriver().findElement(By.xpath("//input[@id='Location']"));
        locationBox.clear();
        locationBox.sendKeys("Madrid");

        WebElement descriptionBox = Driver.getDriver().findElement(By.xpath("//textarea[@tabindex='0']"));
        descriptionBox.clear();
        descriptionBox.sendKeys("klımalı oda");

        WebElement priceBox = Driver.getDriver().findElement(By.xpath("//input[@id='Price']"));
        priceBox.clear();
        priceBox.sendKeys("250");


        WebElement roomTypeDropdownButton = Driver.getDriver().findElement(By.xpath("//select[@id='IDGroupRoomType']"));
        Select select2 = new Select(roomTypeDropdownButton);
        select2.selectByVisibleText("Double");


        WebElement maxAdultBox = Driver.getDriver().findElement(By.xpath("//input[@id='MaxAdultCount']"));
        maxAdultBox.clear();
        maxAdultBox.sendKeys("2");

        WebElement maxChildBox = Driver.getDriver().findElement(By.xpath("//input[@id='MaxChildCount']"));
        maxChildBox.clear();
        maxChildBox.sendKeys("4");

        WebElement isAvailableBox = Driver.getDriver().findElement(By.xpath("//input[@id='IsAvailable']"));
        if (!isAvailableBox.isSelected()) {
            isAvailableBox.click();
        }


        WebElement saveRoomButton = Driver.getDriver().findElement(By.xpath("//button[@class='btn green'][1]"));
        saveRoomButton.click();

        // String basarılıKayıtYazısı  = Driver.getDriver().switchTo().alert().getText();
      // WebElement basarılıOdaKayıtTexti = Driver.getDriver().findElement(By.xpath("//div[text()='HotelRoom was updated successfully']"));
       // Assert.assertTrue(basarılıKayıtYazısı.contains("successfully"));


        //WebElement okButton = Driver.getDriver().findElement(By.xpath("//button[text()='OK']"));
        //okButton.click();



    }
}
