package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.ConfigReader;
import utilities.Driver;


public class HotelMyCampPage {


    Actions actions;
    Faker faker;
    Select select;

    public HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //ana sayfanin navigasyon bolumundeki locatorler
    @FindBy(xpath = "//li[@id='navHome']")
    public WebElement navHomeButton;

    @FindBy(xpath = "//li[@id='navRooms']")
    public WebElement navRoomsButton;

    @FindBy(xpath = "//li[@id='navRestaurant']")
    public WebElement navRestaurantButton;

    @FindBy(xpath = "//li[@id='navAbout']")
    public WebElement navAboutButton;

    @FindBy(xpath = "//li[@id='navBlog']")
    public WebElement navBlogButton;

    @FindBy(xpath = "//li[@id='navContact']")
    public WebElement navContactButton;

    @FindBy(xpath = "//li[@id='navLogon']")
    public WebElement navLoginButton;
    //=============================
    //Ana sayfa check-in check-out butonlari
    @FindBy(xpath = "//input[@id='checkin_date']")
    public WebElement checkIn;

    @FindBy(xpath = "//div[@class='datepicker datepicker-dropdown dropdown-menu datepicker-orient-left datepicker-orient-bottom']")
    public WebElement takvim;

    @FindBy(xpath = "//input[@id='checkout_date']")
    public WebElement checkOut;

    @FindBy(xpath = "//select[@id='IDRoomType']")
    public WebElement roomTypeDropdown;

    @FindBy(xpath = "//select[@id='AdultCount']")
    public WebElement adultsDropdown;

    @FindBy(xpath = "//input[@value='Check Availability']")
    public WebElement checkAvailabilityButton;

    @FindBy(xpath = "(//h1[text()='Welcome To Hotelmycamp']/../../../../../.)[2]")
    public WebElement gecisliResim1;

    @FindBy(xpath = "(//h1[text()='Enjoy A Luxury Experience']/../../../../.)[2]")
    public WebElement gecisliResim2;


    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement logo;

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkLoginLinki;

    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement usernameBox;

    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;

    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButonu;

    @FindBy(xpath="//div[@class='validation-summary-errors']")
    public WebElement girisYapilamadiYaziElementi;

    @FindBy(xpath ="//span[text()='ListOfUsers']")
    public WebElement basariliGirisYazisi;

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


    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addUserButonu;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement addHotelSuccessfully;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement addHotelSuccesfullyOkButtonu;

    // kendi yaptiklarim

    @FindBy(xpath = "(//a[@href='/admin/RoomReservationAdmin'])[1]")
    public WebElement roomReservation;

    @FindBy(xpath = "//span[@class='caption-subject font-green-sharp bold uppercase']")
    public WebElement roomReservationGirisYazisiElementi;

    @FindBy(xpath = "//thead/tr[2]/td[9]/input")
    public WebElement contactNameSurnameBox;

    @FindBy(xpath = "//div[@class='table-scrollable']")
    public WebElement tableElement;

    @FindBy(xpath = "//button[@class='btn btn-sm yellow filter-submit margin-bottom']")
    public WebElement roomReservationSearchElementi;

    @FindBy(xpath = "//a[@class='btn btn-xs default']")
    public WebElement searchtenSonrakiDetailsElementi;

    @FindBy(xpath = "(//div[@class='caption'])[1]")
    public WebElement editHotelroomreservat??onElementi;

    @FindBy(xpath = "//input[@title='DateStart']")
    public WebElement dateStartElementi;

    @FindBy(xpath = "//label[.='AdultAmount']")
    public WebElement adultAmountElementiBosTiklama;

    @FindBy(xpath = "//input[@title='AdultAmount']")
    public WebElement adultAmountElementi;

    @FindBy(xpath = "//input[@title='ChildrenAmount']")
    public WebElement childrenAmountElementi;

    @FindBy(xpath = "//input[@title='Notes']")
    public WebElement notesElementi;

    @FindBy(xpath = "(//button[@class='btn green'])[1]")
    public WebElement generalDataSaveButonu;

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
    public WebElement createHotelRoomReservat??onYazisi;

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

    public void roomReservation(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        ilkLoginLinki.click();
        usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        loginButonu.click();
        hotelManagementLinki.click();
        roomReservation.click();

    }



    /////////////////////////////////////////////// K??BRA     ///////////////////////////////////////////////

    @FindBy(xpath = "//a[@href='/admin/HotelRoomAdmin']\t")
    public WebElement hotelRoomsLinki;

    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']\t")
    public WebElement addHotelRoomButonu;

    @FindBy(xpath = "//div[@class='caption']")
    public WebElement createHotelRoomYaz??Elementi;

    @FindBy(xpath = "//select[@class='form-control input-lg required']")
    public WebElement dropdownSelectHotelElement;

    @FindBy(xpath = "//select[@id='IDGroupRoomType']")
    public WebElement dropdownSelectRoomTypeElementi;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement createHotelRoomSaveButonu;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement ba??ar??l??Kay??tYaz??s??Elementi;

    @FindBy (xpath = "//button[text()='OK']")
    public WebElement ba??ar??l??Kay??tOKButonu;


    public void fakerCreateHotelRoom(){
        actions=new Actions(Driver.getDriver());
        faker=new Faker();
        select=new Select(dropdownSelectHotelElement);
        select.selectByIndex(1);
        actions.sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB).sendKeys(faker.name().name())
                .sendKeys(Keys.TAB).sendKeys(faker.address().city())
                .sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("600").perform();
        select=new Select(dropdownSelectRoomTypeElementi);
        select.selectByIndex(5);
        actions.sendKeys(Keys.TAB).sendKeys("1")
                .sendKeys(Keys.TAB).sendKeys("0")
                .sendKeys(Keys.TAB).sendKeys(Keys.SPACE).perform();

    }
}
