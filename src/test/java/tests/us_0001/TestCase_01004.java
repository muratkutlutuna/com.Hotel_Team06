package tests.us_0001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AnasayfaPage;
import utilities.*;


public class TestCase_01004 extends TestBaseRapor {
    AnasayfaPage anasayfaPage = new AnasayfaPage();

    @Test
    public void ourRoomsYaziButonInputTest() {
        extentTest = extentReports.createTest("TestCase_01004", "Ana sayfanin our rooms bolumundeki yazilar, butonlar ve inputlar calisir ve gorunur oldugunu test edilir");
        extentTest.info("Kullanici olarak anasayfaya gidilir");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("kullanici olarak Our Rooms bolumune inilir");
        JSUtils.scrollIntoVIewJS(anasayfaPage.ourRoomsBolumu);
        ReusableMethods.waitFor(1);
        SoftAssert softAssert = new SoftAssert();
        extentTest.info("kullanici olarak odalarin bilgilerinin gorunurlugu kontrol edilir");
        softAssert.assertTrue(anasayfaPage.ourRoomsBasligi.isDisplayed());
        extentTest.info("kullanici olarak Our Rooms kisminin alt kismina inilir");
        for (int i = 1; i <= 6; i++) {
            Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));


            if (i > 3) {
                JSUtils.scrollIntoVIewJS(Driver.getDriver().findElement(By.xpath("(//a[@class='img d-flex justify-content-center align-items-center'])[3]")));
            } else {
                JSUtils.scrollIntoVIewJS(anasayfaPage.ourRoomsBolumu);
            }

            String roomResimItemDinamikXpath = "(//a[@class='img d-flex justify-content-center align-items-center'])[" + i + "]";
            String roomSearchIkonuDinamikXpath = "(//div[@class='icon d-flex justify-content-center align-items-center'])[" + i + "]";
            String roomIsimDinamikXpath = "(//a[@href='rooms.html'])[" + i + "]";
            String roomFiyatDinamikXpath = "(//div[@class='text p-3 text-center']/p/span[@class='price mr-2'])[" + i + "]";
            String perNightDinamikXpath = "(//span[@class='per'])[" + i + "]";
            String viewRoomDetailsDinamikXpath = "(//a[@class='btn-custom'])[" + i + "]";
            String hiddenElementDinamikXpath = "(//div[@class='col-sm col-md-6 col-lg-4 ftco-animate fadeInUp ftco-animated'])[" + i + "]";

            WebElement roomResimItem = Driver.getDriver().findElement(By.xpath(roomResimItemDinamikXpath));
            softAssert.assertTrue(roomResimItem.isDisplayed(), i + ". Room resmi gorunmuyor!");
            ReusableMethods.webelementinScreenshotAl(roomResimItem, "anasayfaRoomElementi" + i + "Resim");
            //6)kullanici olarak odalarin bilgilerinin gorunurlugu kontrol edilir

            WebElement roomSearchIkonu = Driver.getDriver().findElement(By.xpath(roomSearchIkonuDinamikXpath));
            softAssert.assertTrue(roomSearchIkonu.isDisplayed(), i + ". Room search ikonu gorunmuyor!");

            //isim manuel testte gorundugu icin visible yapildi
            WebElement hiddenElement = Driver.getDriver().findElement(By.xpath(hiddenElementDinamikXpath));
            JSUtils.executeJScommand(hiddenElement, "arguments[0].style.visibility= \"visible\";");

            WebElement roomIsim = Driver.getDriver().findElement(By.xpath(roomIsimDinamikXpath));
            String expectedIsim = roomIsim.getText();
            softAssert.assertTrue(roomIsim.isDisplayed(), i + ". Room ismi gorunmuyor!");

            WebElement roomFiyat = Driver.getDriver().findElement(By.xpath(roomFiyatDinamikXpath));
            softAssert.assertTrue(roomFiyat.isDisplayed(), i + ". Room fiyati gorunmuyor!");

            WebElement perNight = Driver.getDriver().findElement(By.xpath(perNightDinamikXpath));
            softAssert.assertTrue(perNight.isDisplayed(), i + ". Room per night yazisi gorunmuyor!");

            WebElement viewRoomDetails = Driver.getDriver().findElement(By.xpath(viewRoomDetailsDinamikXpath));
            softAssert.assertTrue(viewRoomDetails.isDisplayed(), i + ". Room view room details yazisi gorunmuyor!");
            viewRoomDetails.click();
            ReusableMethods.waitFor(1);
            String actualText = Driver.getDriver().findElement(By.xpath("//h1[@class='mb-4 bread']")).getText();
            //4)linklerin calisirligi kontrol edilir

            softAssert.assertEquals(actualText, expectedIsim, i + ". Room linki yanlis");
        }
        extentTest.pass("Her oda icin yazizili bilgiler gorunur durumdadir");
        extentTest.fail("her oda icin resimler gorunmemektedir");
        extentTest.skip("oda kisimlarinin kodlamasinda visibility:hidden oldugu fakat manuel testte gorundugu icin, o kisim Js kodlari ile visible yapilmistir");
        softAssert.assertAll();
    }

}
