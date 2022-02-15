package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelMyCampPage {
    public HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkLoginLinki;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButonu;

    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    public WebElement girisYapilamadiYaziElementi;

    @FindBy(xpath="//span[text()='ListOfUsers']")
    public WebElement basariliGirisYaziElementi;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementLinki;

    @FindBy(xpath = "//a[@href='/admin/HotelAdmin']")
    public WebElement hotelListLinki;

    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addHotelLinki;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement addHotelCodeKutusu;

    @FindBy ( xpath="//select[@id='IDGroup']")
    public WebElement addHotelDropdown;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement addHotelSaveButonu;


    // us_0008 (Mustafa) WebElementleri

    @FindBy(xpath="//a[.='Log in']")
    public WebElement hMCAnasayfaLogInLinki;

    @FindBy(xpath = "//input[@id='UserName']")
    public  WebElement usernameLogInBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordbox;

    @FindBy(id = "btnSubmit")
    public WebElement logInButonu;

    @FindBy(xpath = "//a[@id='menuYonetim']")
    public WebElement SystemManagementYazisi;

    @FindBy(xpath = "//span[.='Hotel Management']")
    public  WebElement hotelManagementLinkii;

    @FindBy(xpath = "(//i[@class='icon-calendar'])[4]")
    public WebElement roomReservationsLinki;

    @FindBy(xpath = "//span[.='List Of Reservations']")
    public WebElement listOfReservationsYazisi;

    @FindBy(xpath = "//span[.='Add Room Reservation ']")
    public WebElement addRoomReservationLinki;

    @FindBy(className = "caption")
    public WebElement createHotelRoomReservatıonYazisi;

    @FindBy(xpath = "//select[@title='Select User']")
    public WebElement dropDownSelectUser;

    @FindBy(xpath = "//select[@id='IDHotelRoom']")
    public WebElement dropDownSelectHotelRoom;

    @FindBy(xpath = "//input[@id='Price']")
    public WebElement reservationCreatPrice;

    @FindBy(xpath = "//input[@id='ContactNameSurname']")
    public WebElement contactNameSurname;

    @FindBy(xpath = "//input[@id=\"Approved\"]")
    public WebElement approvedKutucugu;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement roomReservationCreatButonu;

    @FindBy(xpath = "//div[.='RoomReservation was inserted successfully']")
    public WebElement reservationbasariliyazisi;



    public void bekle(int saniye){
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void girisYap(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        ilkLoginLinki.click();
        usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        loginButonu.click();
    }


}