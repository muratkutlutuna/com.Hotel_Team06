package tests.us_0007;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HotelMyCampPage;
import pages.RoomGuncellemePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class TC_04 extends TestBaseRapor  {



        @Test
        public void test04() throws InterruptedException, IOException {

                extentTest=extentReports.createTest("Yönetici oda bilgilerini silebilmelidir", "Oda bilgilerinin silinebilmesi test edildi");
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

                //"DELETE" butonu tıklanır.

                roomGuncellemePage.deleteButton.click();

                Thread.sleep(2);

                // Açılan pencerede "Would you like to continue?" textinin gorunurlugu test edilir ve "OK" e tıklanır

                roomGuncellemePage.okButton.click();

                SoftAssert softAssert = new SoftAssert();
                softAssert.assertTrue(roomGuncellemePage.basarisizDeleteYazisi.isDisplayed());
                extentTest.info("ODA BİLGİLERİ SİLİNEMEDİ - Error: Couldn't delete room : please delete reservations for this room first");

                Thread.sleep(4);

                //Oda bilgilerinin silinip silinmediğini test etmek için ekran görüntüsü alır

                ReusableMethods.getScreenshot("US_0007_Test04_OdaBilgileriSilindiMi_SS");

                //roomGuncellemePage.couldntDeleteBoxClose.click();



        }

}
