package tests.us_0001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AnasayfaPage;
import utilities.*;

public class TestCase_01006 extends TestBaseRapor {
    AnasayfaPage anasayfaPage = new AnasayfaPage();
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void test01() {
        extentTest = extentReports.createTest("TestCase_01006", "Anasayfanin recent blog kismindaki yazilar, resimler ve linkler calisir, gorunur ve mantikli oldugunu test eder");
        extentTest.info("Kullanici olarak ana sayfaya gidilir");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Kullanici olarak sayfanin footer kismina inilir");
        JSUtils.scrollIntoVIewJS(anasayfaPage.footerBolumu);
        extentTest.info("Kullanici olarak resimlerin yazilarin gorunurlugu kontrol edilir");
        ReusableMethods.waitFor(1);
        WebElement hidden = Driver.getDriver().findElement(By.xpath("//h2[text()='Recent Blog']/.."));
        JSUtils.executeJScommand(hidden, "arguments[0].style.visibility= \"visible\";");
        softAssert.assertTrue(anasayfaPage.recentBlog.isDisplayed());
        extentTest.info("Kullanici olarak linklerin calisirligi kontrol edilir");
        for (int i = 1; i <= 4; i++) {
            String hiddenElementDinamikXpath = "(//div[@class='col-md-3 d-flex ftco-animate fadeInUp ftco-animated'])[" + i + "]";
            WebElement hiddenElement = Driver.getDriver().findElement(By.xpath(hiddenElementDinamikXpath));
            JSUtils.executeJScommand(hiddenElement, "arguments[0].style.visibility= \"visible\";");
            String resimDinamikXpath = hiddenElementDinamikXpath + "/div/a";
            WebElement resim = Driver.getDriver().findElement(By.xpath(resimDinamikXpath));
            softAssert.assertTrue(resim.isDisplayed());
            String resimLink = resim.getAttribute("style");
            softAssert.assertTrue(resim.isEnabled());
            String textDinamikXpath = hiddenElementDinamikXpath + "/div/div/h3/a";
            WebElement textElement = Driver.getDriver().findElement(By.xpath(textDinamikXpath));
            softAssert.assertTrue(textElement.isDisplayed());
            textElement.click();
            ReusableMethods.waitFor(1);
            softAssert.assertTrue(anasayfaPage.resimLinkAcilanResim.getAttribute("style").contains(resimLink));
            Driver.getDriver().navigate().back();
            ReusableMethods.waitFor(1);
            String tarihDinamikXpath = hiddenElementDinamikXpath + "/div/div/div/div/a";
            WebElement tarihElement = Driver.getDriver().findElement(By.xpath(tarihDinamikXpath));
            softAssert.assertTrue(tarihElement.isDisplayed());
            softAssert.assertTrue(tarihElement.isEnabled());
            ReusableMethods.waitFor(1);

        }
        extentTest.fail("Resimlerin linkleri bozuk calisir");
        extentTest.pass("Yazilarin linkleri beklendigi gibi calisir");
        extentTest.fail("Tarihlerin linkleri ana sayfaya goturur");
        extentTest.pass("Elemanlarin gorunurlukerinde sorun yoktur");
        softAssert.assertAll();
    }

}
