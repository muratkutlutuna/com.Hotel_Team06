package tests.us_0010;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.UserReservationPage;
import utilities.TestBaseRapor;

public class TestCase_10002 extends TestBaseRapor {


    @Test
    public void advancedSearchTest(){

        TestCase_10001 ilkTest=new TestCase_10001();
        ilkTest.roomsTest();

        extentTest=extentReports.createTest("TestCase_10002","Advanced Search kutusundaki bilgiler dolduruldu ve arama yapildi.");

        UserReservationPage userReservation_page =new UserReservationPage();

        extentTest.info("Advanced Search bilgileri dolduruldu.");
        userReservation_page.girisTarihiElementi.clear();
        userReservation_page.girisTarihiElementi.sendKeys("02/26/2022");
        userReservation_page.cikisTarihiElementi.clear();
        userReservation_page.cikisTarihiElementi.sendKeys("02/28/2022");

        Select selectRoom=new Select(userReservation_page.selectRoomTypeElementi);
        selectRoom.selectByValue("7");

        Select selectAdult=new Select(userReservation_page.selectAdultCountElementi);
        selectAdult.selectByValue("2");

        Select childrenCount=new Select(userReservation_page.childrenElementi);
        childrenCount.selectByVisibleText("1 Children");

        userReservation_page.locationElementi.click();

        extentTest.pass("Search butonuna tiklandi.");
        userReservation_page.roomsSearchButonu.click();
    }
}
