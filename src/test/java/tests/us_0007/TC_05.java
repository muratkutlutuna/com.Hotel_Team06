package tests.us_0007;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import pages.RoomGuncellemePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TC_05 extends TestBaseRapor {


    @Test
    public void test05() throws InterruptedException {


        extentTest = extentReports.createTest("Yönetici log out yapabilmeli ve sayfayı kapatabilmelidir", "Basarili sekilde log out yapılması ve sayfanın kapatılması test edildi");

        //HOTELMYCAMP ana sayfasına gidilir
        //Login butonuna tiklanir
        //Username'e gecerli bir username girilir
        //Password'a gecerli bir password girilir
        //Log in butonuna tiklanir
        //"Hotel Management" menüsü tiklanir
        //"Hotel Rooms" link butonu tıklanır
        //"DETAILS" butonu tiklanır

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.loginButonu.click();

        hotelMyCampPage.hotelManagementLinki.click();
        RoomGuncellemePage roomGuncellemePage = new RoomGuncellemePage();

        roomGuncellemePage.roomListLinki.click();

        roomGuncellemePage.detailsButton.click();

        // kodlar buraya kadar test case-4 (46. satıra kadar) aynı


        //"manager" butonu üzerine 2 kez tıklar (ya da buton üzerine gelir)
        //"Log out" yazısına(linktext) tıklar
        //"Log in" penceresinin geldiğini test eder
        //Sayfayı kapatır

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].click();", roomGuncellemePage.managerButton);

        Thread.sleep(2);

        Actions actions = new Actions(Driver.getDriver());
        actions.click(roomGuncellemePage.logOutButton).perform();

        Assert.assertTrue(roomGuncellemePage.loginPenceresi.isDisplayed());

        extentTest.info("Yönetici, basarili sekilde log out yaptı ve sayfayı kapattı");

    }
}




