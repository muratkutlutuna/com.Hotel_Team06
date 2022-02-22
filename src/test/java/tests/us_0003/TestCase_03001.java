package tests.us_0003;

import org.testng.annotations.Test;
import pages.KayitRegistrationPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TestCase_03001 {
    KayitRegistrationPage kayitRegistrationPage=new KayitRegistrationPage();

    @Test
    public void test01(){
        //1)Kayit butonunu görebilmek icin login sayfasi görüntülenmeli


        //https://www.hotelmycamp.com/ sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        //sag üstteki login butonuna tiklanir
        kayitRegistrationPage.loginLinki.click();


    }
}
