package tests.us_0008;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestCase_08005 {

    HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();

    @Test
    public void TestCase05 (){

        // HotelMyCamp sitesine gidilir
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        // Log in linkine tiklanir
        hotelMyCampPage.hMCAnasayfaLogInLinki.click();
        hotelMyCampPage.usernameLogInBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"),Keys.TAB);

        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.logInButonu.click();

        // Hotel Management butonu tiklanir
        hotelMyCampPage.hotelManagementLinkii.click();

        // Room reservations butonu tiklanir
        hotelMyCampPage.roomReservationsLinki.click();

        // ADD ROOM RESERVATION butonu tiklanir
        hotelMyCampPage.addRoomReservationLinki.click();

        // Create Hotelroomreservatıon yazisinin ekranda görüldügü kotrol edilir
        Assert.assertTrue(hotelMyCampPage.createHotelRoomReservatıonYazisi.isDisplayed());

        //Select User a tiklanir
        hotelMyCampPage.dropDownSelectUser.click();

        ReusableMethods.waitFor(2);

        // dropdown dan bir user secilir
        Select options=new Select(hotelMyCampPage.dropDownSelectUser);
        options.selectByIndex(1);

        //Select HotelRoom a tiklanir
        hotelMyCampPage.dropDownSelectUser.click();

        // dropdown dan bir user secilir
        Select select=new Select(hotelMyCampPage.dropDownSelectHotelRoom);
        select.selectByIndex(2);

        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();

        // Price kismina fiyat girilir
        actions.click(hotelMyCampPage.reservationCreatPrice)
                .sendKeys("20", Keys.TAB)
                .sendKeys("16.03.2022",Keys.ENTER, Keys.TAB, Keys.TAB) //Reservasyon baslangic tarihi secilir
                .sendKeys("22.05.2021", Keys.ENTER, Keys.TAB, Keys.TAB)//Reservasyon bitis tarihi secilir
                .sendKeys("2",Keys.TAB)                                // Yetiskin sayisi girilir
                .sendKeys("0",Keys.TAB).perform();                     // Cocuk sayisi girilir

        actions.click(hotelMyCampPage.contactNameSurname)
                .sendKeys(faker.name().fullName(), Keys.TAB)
                .sendKeys(faker.phoneNumber().cellPhone(), Keys.TAB)
                .sendKeys(faker.internet().emailAddress(), Keys.TAB)
                .sendKeys("yagli müsteri")
                .perform();

        // Approved ya da is paid ten birisi secilir
        hotelMyCampPage.approvedKutucugu.click();

        //Reservasyonu tamamlamak icin Save butonu tiklanir
        hotelMyCampPage.roomReservationCreatButonu.click();

        // Save butonuna tikladiktan sonra " RoomReservation was inserted successfully "
        // yazisinin ekranda görüldügü kotrol edilir

        Assert.assertTrue(hotelMyCampPage.reservationbasariliyazisi.isDisplayed());

        // Sayfa kapatilir

        Driver.closeDriver();








    }




}
