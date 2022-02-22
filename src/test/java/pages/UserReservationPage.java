package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UserReservationPage {
    public UserReservationPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[text()='Rooms'])[1]")
    public WebElement roomsElementi;

    @FindBy(xpath = "//input[@id='checkin_date']")
    public WebElement girisTarihiElementi;

    @FindBy(xpath = "//input[@id='checkout_date']")
    public WebElement cikisTarihiElementi;

    @FindBy(xpath = "//select[@id='IDRoomType']")
    public WebElement selectRoomTypeElementi;

    @FindBy(xpath = "//select[@id='AdultCount']")
    public WebElement selectAdultCountElementi;

    @FindBy(xpath = "//select[@id='ChildrenCount']")
    public  WebElement childrenElementi;

    @FindBy(xpath = "//input[@id='location']")
    public WebElement locationElementi;

    @FindBy(xpath = "//input[@value='Search']")
    public WebElement roomsSearchButonu;

    @FindBy(xpath = "//a[text()='Double room']")
    public WebElement searchtenSonrakiDoubleRoomElementi;

    @FindBy(xpath = "//a[@href='/Rooms/7']")
    public WebElement doubleRoomSecenekleriElementi;

    @FindBy(xpath = "(//a[@class='btn-custom'])[1]")
    public WebElement ilkOdaSecenegiMoonBookNowElementi;

    @FindBy(xpath = "(//a[text()='Log in'])[2]")
    public WebElement ikinciLoginLinki;

    @FindBy(xpath = "//span[text()='Create a new account']")
    public WebElement createNewAccountButonu;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement userNameKutusu;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//input[@id='Email']")
    public WebElement emailKutusu;

    @FindBy(xpath = "//input[@id='NameSurname']")
    public WebElement fullNameKutusu;

    @FindBy(xpath = "//input[@id='PhoneNo']")
    public  WebElement phoneNoKutusu;

    @FindBy (xpath = "//input[@id='SSN']")
    public WebElement socialSecurityNumberKutusu;

    @FindBy (xpath = "//input[@id='DrivingLicense']")
    public WebElement drivingLicenseKutusu;

    @FindBy (xpath = "//select[@id='IDCountry']")
    public WebElement selectCountryKutusu;

    @FindBy (xpath = "//select[@id='IDState']")
    public WebElement selectStateKutusu;

    @FindBy(xpath = "//input[@id='Address']")
    public WebElement addressKutusu;

    @FindBy (xpath = "//input[@id='WorkingSector']")
    public WebElement workingSectorKutusu;

    @FindBy (xpath = "//input[@id='BirthDate']")
    public WebElement birthDateKutusu;

    @FindBy (xpath = "//input[@id='btnSubmit']")
    public WebElement saveButonu;

    @FindBy (xpath= "//div[@class='bootbox modal fade bootbox-alert show']")
    public static WebElement alertSayfasi;

    @FindBy (xpath = "//div[@class='modal-body']")
    public static WebElement userDataWasInsertedSuccessfullyText;

    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement okButonu;

    @FindBy(xpath = "//div[@id='divMessage']")
    public WebElement successfullRegistrationText;

    @FindBy (xpath = "(//a[text()='Log in'])[1]")
    public WebElement registrationLoginLinki;

    @FindBy (xpath = "//input[@value='Save']")
    public WebElement userBilgiSaveButonu;

    @FindBy (xpath = "(//button[@type='button'])[3]")
    public WebElement uptadeOkButton;

    @FindBy (xpath = "//input[@id='UserName']")
    public WebElement loginUserNameBox;

    @FindBy (xpath="//input[@id='Password']")
    public WebElement loginPasswordBox;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public  WebElement loginSubmitButonu;

    @FindBy (xpath = "//a[@href='/Rooms/322']")
    public WebElement sagdakiDoubleRooom;

    @FindBy(xpath = "(//a[@href='/RoomDetail/467'])[3]")
    public WebElement sonRoomBookButonu;

    @FindBy(xpath = "//input[@name='CheckinDate']")
    public WebElement sonCheckInKutusu;

    @FindBy(xpath = "//input[@name='CheckoutDate']")
    public WebElement sonCheckOutKutusu;

    @FindBy(xpath = "//select[@name='AdultCount']")
    public  WebElement sonAdultCount;

    @FindBy (xpath = "//select[@name='ChildrenCount']")
    public WebElement sonChildrenCount;

    @FindBy (xpath = "//input[@name='NameOnCreditCard']")
    public WebElement NameOncreditCardKutusu;

    @FindBy (xpath = "//input[@name='CreditCardNumber']")
    public  WebElement creditCardNumberKutusu;

    @FindBy (xpath = "//select[@name='CreditCardExpirationYear']")
    public WebElement creditCardExpirationYearKutusu;

    @FindBy (xpath = "//select[@name='CreditCardExpirationMonth']")
    public WebElement creditCardExpirationMonthKutusu;

    @FindBy (xpath = "//input[@name='CVV']")
    public WebElement cvvkutusu;

    @FindBy(xpath = "//textarea[@name='Message']")
    public WebElement messageKutusu;

    @FindBy (xpath = "//input[@value='Book this room']")
    public WebElement bookThisRoomButton;

    @FindBy (xpath = "//div[@class='bootbox-body']")
    public WebElement successfullResevationText;

    @FindBy (xpath = "//*[contains(text(),'Reservation was made successfully')]")
    public WebElement reservationBasariliElementi;

    @FindBy (xpath = "//button[@class='btn btn-primary']")
    public WebElement sonOkButonu;

    @FindBy (xpath="(//div[@class='container'])[3]")
    public WebElement reservationDetailPage;

    @FindBy (xpath="(//a[.=' here '])[2]")
    public WebElement reservationLinkHereElementi;

}
