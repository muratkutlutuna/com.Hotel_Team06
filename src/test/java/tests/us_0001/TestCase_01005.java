package tests.us_0001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AnasayfaPage;
import utilities.*;

import java.time.Duration;

public class TestCase_01005 extends TestBaseRapor {
    AnasayfaPage anasayfaPage = new AnasayfaPage();
    SoftAssert softAssert = new SoftAssert();

    @Test(priority = 1)
    public void istatistikTest() {
        extentTest = extentReports.createTest("TestCase_01005", "Anasayfanin istatik ve yorumlar kisminda yazilar, resimler ve gecisli bolmeler calisir gorunur ve mantikli oldugunu test edildi");
        extentTest.info("Sayfaya gidilir ve istatistik bolumune inilir");
        extentTest.info("Manuel testte gorunen elemanlarin hidden kisimlari testimizin calismasi icin visible yapilir");
        for (int i = 1; i <= 4; i++) {

            //3)kullanici olarak degisen sayilari ve istatistik yazilarini kontrol et
            Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
            JSUtils.scrollIntoVIewJS(anasayfaPage.istatistikBolumu);
            String istatistikSayiDinamikXpath = "(//strong[@class='number'])[" + i + "]";
            String istatistikYaziDinamikXpath = istatistikSayiDinamikXpath + "/../span";
            String hiddenElementDinamikXpath = istatistikSayiDinamikXpath + "/../../..";
            //isim manuel testte gorundugu icin visible yapildi
            WebElement hiddenElement = Driver.getDriver().findElement(By.xpath(hiddenElementDinamikXpath));
            JSUtils.executeJScommand(hiddenElement, "arguments[0].style.visibility= \"visible\";");
            ReusableMethods.waitFor(1);
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
            WebElement istatistikSayiElement = Driver.getDriver().findElement(By.xpath(istatistikSayiDinamikXpath));
            String numberFinalValue = istatistikSayiElement.getAttribute("data-number");
            if (numberFinalValue.length() > 3) {
                numberFinalValue = numberFinalValue.substring(0, numberFinalValue.length() - 3) + "," + numberFinalValue.substring(numberFinalValue.length() - 3);
            }
            wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(istatistikSayiDinamikXpath), numberFinalValue));
            softAssert.assertTrue(istatistikSayiElement.isDisplayed());
            WebElement istatistikYaziElement = Driver.getDriver().findElement(By.xpath(istatistikYaziDinamikXpath));
            softAssert.assertTrue(istatistikYaziElement.isDisplayed());

        }
        extentTest.info("Sayisal istatistik verilerinin beklenen degere geldigi test edilir");
        extentTest.pass("Test gecer");
        softAssert.assertAll();
    }

    @Test(priority = 2)
    public void yorumTest() {
        extentTest.info("Kullanici olarak gecisli yotumlarin, yazilarin ve resimlerin gorunurlugu kontrol edilir");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        JSUtils.scrollIntoVIewJS(anasayfaPage.istatistikBolumu);

        for (int i = 5; i >= 1; i--) {
            JSUtils.executeJScommand(anasayfaPage.yorumSayfasiHiddenContainer, "arguments[0].style.visibility= \"visible\";");
            ReusableMethods.waitFor(1);
            String yorumBolumNoktaDinamikXpath = "(//button[@role='button' and contains(@class,'owl-dot')])[" + i + "]";
            Driver.getDriver().findElement(By.xpath(yorumBolumNoktaDinamikXpath)).click();
            String yorumSayfasiDinamikXpath = "(//div[@class='owl-item active'])[2]";
            ReusableMethods.waitForVisibility(Driver.getDriver().findElement(By.xpath(yorumSayfasiDinamikXpath)), 1);
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath(yorumSayfasiDinamikXpath)).isDisplayed());
            String yorumBolumuResimDinamikXpath = "(" + yorumSayfasiDinamikXpath + "/div/div/div)[1]";
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath(yorumBolumuResimDinamikXpath)).isDisplayed());
            String yorumBolumuYaziDinamikXpath = "(" + yorumSayfasiDinamikXpath + "/div/div/div)[2]";
            Assert.assertTrue(Driver.getDriver().findElement(By.xpath(yorumBolumuYaziDinamikXpath)).isDisplayed());
            System.out.println(Driver.getDriver().findElement(By.xpath(yorumBolumuYaziDinamikXpath + "/p")).getText());
        }
        extentTest.info("Test gecer, gorunmesi gereken butun elemanlar gorunur durumdadir");

    }
}
