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