package tests.us_0010;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserReservationPage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TestCase_10006 extends TestBaseRapor {
    @Test
    public void createAccountTesti() {
        TestCase_10005 besinciTest=new TestCase_10005();
        besinciTest.loginButonuTesti();

        extentTest=extentReports.createTest("TestCase_10006"," 'Create New Account' butonuna tiklandi ve istenilen bilgiler dolduruldu ve 'Save' butonuna tiklandi.");

        UserReservationPage userReservation_page =new UserReservationPage();

        extentTest.pass(" 'Create New Acoount' butonu goruntulendi.");
        Assert.assertTrue(userReservation_page.createNewAccountButonu.isDisplayed());

        extentTest.pass("\"Create new account\" a tiklandi.");
        userReservation_page.createNewAccountButonu.click();

        extentTest.info("Yeni hesap olusturmak icin bilgiler dolduruldu ve kaydedildi.");

        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();
        actions.click(userReservation_page.userNameKutusu)
                .sendKeys("aaaaa")
                .sendKeys(Keys.TAB)
                .sendKeys("aabbccD1!")
                .sendKeys(Keys.TAB)
                .sendKeys("aabbcc@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("aaa bbc")
                .sendKeys(Keys.TAB)
                .sendKeys("123-456-7899")
                .sendKeys(Keys.TAB)
                .sendKeys("1234567890")
                .sendKeys(Keys.TAB)
                .sendKeys("123456786")
                .sendKeys(Keys.TAB)
                .sendKeys("Turkey")
                .sendKeys(Keys.TAB)
                .sendKeys("--")
                .sendKeys(Keys.TAB)
                .sendKeys("12 avenue 34 street")
                .sendKeys(Keys.TAB)
                .sendKeys("IT")
                .sendKeys(Keys.TAB)
                .sendKeys("15/08/1996")
                .sendKeys(Keys.TAB)
                .perform();

        extentTest.pass("Save butonuna tiklandi.");
        userReservation_page.saveButonu.click();
    }
}
