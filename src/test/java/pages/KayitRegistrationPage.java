package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class KayitRegistrationPage {
    public KayitRegistrationPage() {
        PageFactory.initElements(Driver.getDriver() , this);
    }

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginLinki;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButonu;

    @FindBy(xpath = "//h1[text()='Register']")
    public WebElement kayitSayfasi;

    @FindBy(xpath = "//span[text()='Create a new account']")
    public WebElement kayitButonu;

    @FindBy(xpath = "//input[@id='Email']")
    public WebElement eMailBox;

    @FindBy(xpath = "//input[@id='NameSurname']")
    public WebElement fullName;

    @FindBy(xpath = "//input[@id='PhoneNo']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@id='SSN']")
    public WebElement socialSecurityNumber;

    @FindBy(xpath = "//input[@id='DrivingLicense']")
    public WebElement drivingLicense;

    @FindBy(xpath = "//select[@id='IDCountry']")
    public WebElement selectCountryBox;

    @FindBy(xpath = "//select[@id='IDState']")
    public WebElement selectStateBox;

    @FindBy(xpath = "//input[@id='Address']")
    public WebElement adressBox;

    @FindBy(xpath = "//input[@id='WorkingSector']")
    public WebElement workingSectorBox;

    @FindBy(xpath = "//input[@id='BirthDate']")
    public WebElement birthDateBox;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement registerSaveButonu;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement basariliKayitYazisi;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement registerOkButonu;

    public void bekle (int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
