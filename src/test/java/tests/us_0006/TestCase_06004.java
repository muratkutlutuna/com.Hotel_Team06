package tests.us_0006;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import pages.HotelRoomsPage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TestCase_06004 extends TestBaseRapor{

    HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
    HotelRoomsPage hotelRoomsPage=new HotelRoomsPage();

    Actions actions;
    Select select;
    Faker faker;

    @Test
    public void test04(){

       extentTest=extentReports.createTest("HMC Project us_0006 TC004","Kayıt formu doldurulabilirliği test edildi");
        hotelMyCampPage.girisYap();
        extentTest.info("sayfaya başarılı bir şekilde giriş yapıldı");
        hotelMyCampPage.hotelManagementLinki.click();
        extentTest.info("hotel management linkine tıklandı");
        hotelMyCampPage.bekle(1);
        hotelRoomsPage.hotelRoomsLinki.click();
        extentTest.info("hotel rooms linkine tıklandı");
        hotelRoomsPage.addHotelRoomButonu.click();
       extentTest.info("addHotelRoom butonuna tıklandı");
        hotelMyCampPage.bekle(1);
        actions=new Actions(Driver.getDriver());
        faker=new Faker();
        select=new Select(hotelRoomsPage.dropdownSelectHotelElement);
        select.selectByIndex(1);
        extentTest.info("otel adı olarak HAPPY HOTEL seçildi");
        actions.sendKeys(Keys.TAB).sendKeys("0").perform();
        extentTest.info("zip code 0 girildiği halde kayıt gerçekleştirildi");
                actions.sendKeys(Keys.TAB).sendKeys(faker.name().name()).perform();
                extentTest.info("faker class'ı kullanılarak isim gönderildi");
                actions.sendKeys(Keys.TAB).sendKeys(faker.address().city()).perform();
        extentTest.info("faker class'ı kullanılarak adres gönderildi");
                actions.sendKeys(Keys.TAB).sendKeys(Keys.TAB).perform();
        actions.sendKeys("-600").perform();
        extentTest.info("fiyat için eksi değer girilmemeli.Eksi değer girildiği halde kayıt gerçekleştirildi");
        select=new Select(hotelRoomsPage.dropdownSelectRoomTypeElementi);
        actions.sendKeys(Keys.TAB).perform();
        select.selectByIndex(5);
        extentTest.info("otel odası olarak QUEEN seçildi");
        actions.sendKeys(Keys.TAB).sendKeys("0").perform();
        extentTest.info("Yetişkin sayısı 0 girildiği halde kayıt gerçekleştirildi");
        actions.sendKeys(Keys.TAB).sendKeys("50").perform();
       extentTest.info("Çocuk sayısı yetişkin olmadığı ve bir oda için 50 çocuk sayısı girildiği halde kayıt gerçekleştirildi");
        actions.sendKeys(Keys.TAB).sendKeys(Keys.SPACE).perform();
        hotelRoomsPage.createHotelRoomSaveButonu.click();
        extentTest.info("Formu kaydetmek için Save butonuna tıklandı");

        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(hotelRoomsPage.sağÜstManagerButonu).click(hotelRoomsPage.logOutButonu).perform();


    }
}
