package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RoomReservationsPage_2 {

    public RoomReservationsPage_2(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    //========================= us_0008 (Mustafa) WebElementleri==================

    @FindBy(xpath="//a[.='Log in']")
    public WebElement hMCAnasayfaLogInLinki;

    @FindBy(xpath = "//input[@id='UserName']")
    public  WebElement usernameLogInBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordbox;

    @FindBy(id = "btnSubmit")
    public WebElement logInButonu;

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementLinki;

    @FindBy(xpath = "//a[@id='menuYonetim']")
    public WebElement SystemManagementYazisi;

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
    public WebElement roomReservationPrice;


    @FindBy(xpath = "//input[@id=\"Approved\"]")
    public WebElement approvedKutucugu;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement roomReservationCreatButonu;

    @FindBy(xpath = "//div[text()='RoomReservation was inserted successfully']")
    public WebElement reservationbasariliyazisi;

    @FindBy(xpath = "//a[.='Log out']")
    public WebElement logOutButonu;


    @FindBy(xpath = "//input[@id='DateStart']")
    public WebElement roomReservationDateStart;


    @FindBy(xpath = "//input[@id='DateEnd']")
    public WebElement roomReservationDateEnd;

    @FindBy(xpath = "//input[@title='Contact Full Name']")
    public WebElement ContactNameSurnameBox;

    @FindBy(xpath = "")
    public WebElement pricebox;



    }



