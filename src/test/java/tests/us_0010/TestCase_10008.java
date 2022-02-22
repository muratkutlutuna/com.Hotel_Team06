package tests.us_0010;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UserReservationPage;
import utilities.TestBaseRapor;

public class TestCase_10008 extends TestBaseRapor {
    @Test
    public void KayittanSonrakiloginTesti()  {
        TestCase_10007 yedinciTest=new TestCase_10007();
        yedinciTest.SuccessfullAccountCreationText();

        extentTest=extentReports.createTest("TestCase_10008"," Bilgiler dolduruldu ve 'Book this room' butonuna tiklandi, Rezervasyon detaylari goruntulendi.");

        extentTest.info("Acilan sayfadaki istenilen bilgiler dolduruldu.");
        UserReservationPage userReservation_page =new UserReservationPage();
        userReservation_page.sonAdultCount.click();
        Select selectAdults=new Select(userReservation_page.sonAdultCount);
        selectAdults.selectByValue("2");

        userReservation_page.sonChildrenCount.click();
        Select childrenCounts=new Select(userReservation_page.sonChildrenCount);
        childrenCounts.selectByVisibleText("1 Children");

        userReservation_page.NameOncreditCardKutusu.sendKeys("Rana Kurt");
        userReservation_page.creditCardNumberKutusu.sendKeys("1234 5678 9012 3456");

        userReservation_page.creditCardExpirationYearKutusu.click();
        Select year=new Select(userReservation_page.creditCardExpirationYearKutusu);
        year.selectByVisibleText("2025");

        userReservation_page.creditCardExpirationMonthKutusu.click();
        Select month=new Select(userReservation_page.creditCardExpirationMonthKutusu);
        month.selectByVisibleText("April");
        userReservation_page.cvvkutusu.click();
        userReservation_page.cvvkutusu.sendKeys("375");
        userReservation_page.messageKutusu.sendKeys("Selam");

        extentTest.pass(" 'Book this room' butonuna tiklandi.");
        userReservation_page.bookThisRoomButton.click();

        extentTest.info(" 'here' linkina tiklandi.");
        userReservation_page.reservationLinkHereElementi.click();

        extentTest.pass("Rezervasyon detaylari goruntilendi.");
        Assert.assertTrue(userReservation_page.reservationDetailPage.isDisplayed());
    }
}
