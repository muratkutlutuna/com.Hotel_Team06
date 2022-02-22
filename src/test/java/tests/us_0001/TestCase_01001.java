package tests.us_0001;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AnasayfaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TestCase_01001 extends TestBaseRapor {
    AnasayfaPage AnasayfaPage = new AnasayfaPage();

    @Test
    public void titelUrlIconTest(){
        extentTest = extentReports.createTest("TestCase_01001", "Anasayfanin title'i icon'u ve urle'si test edildi");
        extentTest.info("kullanici olarak ana sayfaya gidilir");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        extentTest.info("Title'in \"Hotelmycamp\"icerdigi kontrol edilir");
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = ConfigReader.getProperty("homeTitle");
        Assert.assertEquals(actualTitle,expectedTitle,"Title beklenen gibi degil!!");
        extentTest.info("url'nin \"https://www.hotelmycamp.com/\" oldugu kontrol edilir");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = ConfigReader.getProperty("HMCUrl");
        Assert.assertEquals(actualUrl,expectedUrl,"Url beklenen gibi degil!!");
        extentTest.info("Ana sayfaya gidildiginde \"HOTELMYCAMP\" ikonu gorulur olmalidir");
        String expectedIcon = "HOTELMYCAMP";
        String actualIcon = AnasayfaPage.logo.getText();
        Assert.assertEquals(actualIcon, expectedIcon,"Logo beklenen gibi degil!!");
        extentTest.pass("Title Ikon ve Url'nin beklenen deger oldugu test edildi");

    }
}
