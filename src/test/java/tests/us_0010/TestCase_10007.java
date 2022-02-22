package tests.us_0010;

import org.testng.annotations.Test;
import pages.UserReservationPage;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class TestCase_10007 extends TestBaseRapor {

    @Test
    public void SuccessfullAccountCreationText(){
        TestCase_10006 altinciTest=new TestCase_10006();
        altinciTest.createAccountTesti();

        extentTest=extentReports.createTest("TestCase_10007"," Tekrar 'Login' butonuna tiklandi ve bir oda secilip 'Book Now' yapildi.");

        UserReservationPage userReservation_page =new UserReservationPage();

        extentTest.info("Acilan sekme kapatildi.");
        ReusableMethods.waitFor(2);
        userReservation_page.okButonu.click();
        ReusableMethods.waitFor(2);

        extentTest.info("'Login' butonuna tiklandi.");
        ReusableMethods.waitFor(1);
        userReservation_page.registrationLoginLinki.click();

        extentTest.info("Login bilgileri dolduruldu ve 'Submit' butonuna tiklandi.");
        userReservation_page.loginUserNameBox.sendKeys("aaaaa");
        userReservation_page.loginPasswordBox.sendKeys("aabbccD1!");
        userReservation_page.loginSubmitButonu.click();

        extentTest.pass(" 'Save' butonuna tiklandi.");
        userReservation_page.userBilgiSaveButonu.click();

        extentTest.info("Acilan sekme kapatildi.");
        userReservation_page.uptadeOkButton.click();
        ReusableMethods.waitFor(2);
        userReservation_page.uptadeOkButton.click();
        ReusableMethods.waitFor(1);

        extentTest.info("Oda tipi secildi ve acilan seceneklerden bir oda secildi.");
        userReservation_page.sagdakiDoubleRooom.click();
        userReservation_page.sonRoomBookButonu.click();
    }
}
