package tests.us_0001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AnasayfaPage;
import utilities.*;

import java.util.List;

public class TextCase_01007 extends TestBaseRapor {
    AnasayfaPage anasayfaPage = new AnasayfaPage();
    SoftAssert softAssert = new SoftAssert();

    @DataProvider
    public static Object[][] elementler() {
        AnasayfaPage a = new AnasayfaPage();
        Object[][] elementlerList = {{a.footerIkonu, null, false}, {a.kisaAciklamaYazisi, null, false},
                {a.usefulLinksYazisi, null, false}, {a.privacyYazisi, null, false}, {a.haveQuestionsYazisi, null, false},
                {a.footerAdresText, null, false}, {a.footerNumberText, null, false}, {a.footerMailText, null, false},
                {a.footerAdresIkonu, null, false}, {a.footerNumberIkonu, null, false}, {a.footerMailIkonu, null, false},
                {a.footerBlogYazisi, "Blog", false}, {a.footerRoomsYazisi, "Rooms", false},
                {a.footerAmenitiesTestYazisi, "Amenities test", false}, {a.footerGiftCardYazisi, "Gift Card", false},
                {a.footerCareerYazisi, "Career", false}, {a.footerAboutUsYazisi, "About Us", false},
                {a.footerContactUsYazisi, "Contact Us", false}, {a.footerServicesYazisi, "Services", false},
                {a.footerTwitterIkonu, "Twitter", true},
                {a.footerFacebookIkonu, "Facebook", true},
                {a.footerInstagramIkonu, "Instagram", true}
        };

        return elementlerList;
    }

    @Test
    public void instagramTest() {
        extentTest = extentReports.createTest("TestCase_01007", "Ana sayfanin footer kismindaki yazilar, resimler ve linkler calisir ve gorunur oldugunu test eder");
        extentTest.info("Kullanici olarak ana sayfaya gidilir");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Kullanici olarak sayfanin Footer kismina inilir");
        JSUtils.scrollIntoVIewJS(anasayfaPage.instagramBolumu);
        extentTest.info("Kullanici olarak resimlerin yazilarin gorunurlugu kontrol edilir");
        for (int i = 1; i <= 4; i++) {
            String hiddenDinamikXpath = "(//div[@class='col-sm-12 col-md ftco-animate fadeInUp ftco-animated'])[" + i + "]";
            WebElement hidden = Driver.getDriver().findElement(By.xpath(hiddenDinamikXpath));
            JSUtils.executeJScommand(hidden, "arguments[0].style.visibility= \"visible\";");
            String resimDinamikXpath = hiddenDinamikXpath + "/a";
            WebElement resim = Driver.getDriver().findElement(By.xpath(resimDinamikXpath));
            String resimHref = resim.getAttribute("href");
            softAssert.assertTrue(resim.isDisplayed() & resim.isEnabled());
            String instagramSimgesiDinamikXpath = resimDinamikXpath + "//span";
            WebElement instagramSimgesi = Driver.getDriver().findElement(By.xpath(instagramSimgesiDinamikXpath));
            ReusableMethods.hover(instagramSimgesi);
            softAssert.assertTrue(instagramSimgesi.isDisplayed());
            resim.click();
            String acilanResimDinamikXpath = "//img[@src=\"" + resimHref.substring(27) + "\"]";
            WebElement acilanResim = Driver.getDriver().findElement(By.xpath(acilanResimDinamikXpath));
            softAssert.assertTrue(acilanResim.isDisplayed());
            for (int j = 1; j <= 4; j++) {
                anasayfaPage.sagYonButonu.click();
            }
            softAssert.assertTrue(anasayfaPage.instagramResimi.isDisplayed());
            for (int j = 1; j <= 4; j++) {
                anasayfaPage.solYonButonu.click();
            }
            softAssert.assertTrue(anasayfaPage.instagramResimi.isDisplayed());
            anasayfaPage.closeButonu.click();
        }
        extentTest.pass("Resimler ve yazilar gorunur durumdadir");
        extentTest.pass("Resim yonlendirme tuslari ve linkler calisri durumdadir");
    }

    @Test(dataProvider = "elementler")
    public void footerTest(WebElement element, String beklenenElementYazisi, boolean ikonMu) {
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        JSUtils.scrollIntoVIewJS(anasayfaPage.instagramBolumu);
        extentTest.info("Footer'daki elemanlarin gorunurlugu ve calismalari test edilir");
        if (beklenenElementYazisi == null) {
            softAssert.assertTrue(element.isDisplayed());
        } else if (ikonMu) {
            List<WebElement> hiddenElements = Driver.getDriver().findElements(By.xpath("//ul[@class='ftco-footer-social list-unstyled float-md-left float-lft mt-5']/li"));
            for (WebElement hidden : hiddenElements) {
                JSUtils.executeJScommand(hidden, "arguments[0].style.visibility= \"visible\";");
            }
            ReusableMethods.waitForVisibility(element, 10);
            softAssert.assertTrue(element.isDisplayed(), beklenenElementYazisi + " elementi gorunmuyor!!");
            element.click();
            String actualUrl = Driver.getDriver().getCurrentUrl();
            softAssert.assertTrue(actualUrl.contains(beklenenElementYazisi), beklenenElementYazisi + " linki calismiyor!!");
            Driver.getDriver().navigate().back();
        } else {
            softAssert.assertTrue(element.isDisplayed(), beklenenElementYazisi + " elementi gorunmuyor!!");
            softAssert.assertTrue(element.getText().contains(beklenenElementYazisi), beklenenElementYazisi + " elementinin yazisi yanlis!!");
            element.click();
            String actualTitle = Driver.getDriver().getTitle();
            softAssert.assertTrue(actualTitle.contains(beklenenElementYazisi), beklenenElementYazisi + " linki calismiyor!!");
            Driver.getDriver().navigate().back();
        }
        extentTest.pass("Footer'daki elemanlari gorunurdur");
        extentTest.fail("Footerdaki linkler bozuktur");
        softAssert.assertAll();
    }
}
