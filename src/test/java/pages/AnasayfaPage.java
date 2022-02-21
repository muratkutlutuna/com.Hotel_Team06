package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class AnasayfaPage {
    public AnasayfaPage(){
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
    //====== Anasayfa Welcome to hotelmycamp kismi========
    @FindBy(xpath = "//span[@class='subheading']")
    public WebElement welcomeToHotelmycampYazisi;
    @FindBy(xpath = "//h2[text()='Welcome To Our Hotel']")
    public WebElement welcomeToOurHotelBasligi;
    @FindBy(xpath = "//div[@class='col-md-12 py-5 wrap-about pb-md-5 ftco-animate fadeInUp ftco-animated']/p")
    public WebElement welcomeYazisi;
    @FindBy(xpath = "(//span[@class='icon-facebook'])[1]")
    public WebElement facebookIkon1;
    @FindBy(xpath = "(//span[@class='icon-google-plus'])[1]")
    public WebElement googleIkon1;
    @FindBy(xpath = "(//span[@class='icon-instagram'])[1]")
    public WebElement instagramIkon1;
    @FindBy(xpath = "(//span[@class='flaticon-reception-bell'])")
    public WebElement zilIkonu;
    @FindBy(xpath = "(//span[@class='flaticon-serving-dish'])")
    public WebElement tepsiIkonu;
    @FindBy(xpath = "(//span[@class='flaticon-car'])")
    public WebElement arabaIkonu;
    @FindBy(xpath = "(//span[@class='flaticon-spa'])")
    public WebElement mumIkonu;
    @FindBy(xpath = "(//h3[@class='heading mb-3'])[1]")
    public WebElement frontDesk257Yazisi;
    @FindBy(xpath = "(//h3[@class='heading mb-3'])[2]")
    public WebElement restaurantBarYazisi;
    @FindBy(xpath = "(//h3[@class='heading mb-3'])[3]")
    public WebElement transferServicesYazisi;
    @FindBy(xpath = "(//h3[@class='heading mb-3'])[4]")
    public WebElement spaSuitesYazisi;
    @FindBy(xpath = "//section[@class='ftco-section bg-light']")
    public WebElement ourRoomsBolumu;
    @FindBy(xpath = "(//h2[@class='mb-4'])[3]")
    public WebElement ourRoomsBasligi;
    @FindBy(xpath = "//a[@class='navbar-brand']")
    public WebElement logo;
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement ilkLoginLinki;
    //========Element Test Etme=====//
    public static void elementCalismasiniGorunurlugunuVeYazisiniKontrolEt(WebElement webElement, String beklenenElementYazisi) {
        Assert.assertTrue(webElement.isDisplayed(), beklenenElementYazisi + " elementi gorunmuyor!!");
        Assert.assertTrue(webElement.getText().contains(beklenenElementYazisi), beklenenElementYazisi + " elementinin yazisi yanlis!!");
        webElement.click();
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(beklenenElementYazisi), beklenenElementYazisi + " linki calismiyor!!");
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
    }

    public static void elementCalismasiniGorunurlugunuKontrolEt(WebElement webElement, String beklenenElementYazisi) {
        Assert.assertTrue(webElement.isDisplayed(), beklenenElementYazisi + " elementi gorunmuyor!!");
        webElement.click();
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(beklenenElementYazisi), beklenenElementYazisi + " linki calismiyor!!");
        Driver.getDriver().navigate().back();

    }

    //===== Anasayfa Rooms Kisimi =====
    @FindBy(xpath = "//input[@id='UserName']")
    public WebElement usernameBox;
    @FindBy(xpath = "//input[@id='Password']")
    public WebElement passwordBox;
    @FindBy(xpath = "//input[@id='btnSubmit']")
    public WebElement loginButonu;
    @FindBy(xpath = "//div[@class='validation-summary-errors']")
    public WebElement girisYapilamadiYaziElementi;
    @FindBy(xpath = "//span[text()='ListOfUsers']")
    public WebElement basariliGirisYaziElementi;
    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementLinki;
    @FindBy(xpath = "//a[@href='/admin/HotelAdmin']")
    public WebElement hotelListLinki;
    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addHotelLinki;
    @FindBy(xpath = "//input[@id='Code']")
    public WebElement addHotelCodeKutusu;
    @FindBy(xpath = "//select[@id='IDGroup']")
    public WebElement addHotelDropdown;
    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement addHotelSaveButonu;
    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addUserButonu;
    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement addHotelSuccessfully;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement addHotelSuccesfullyOkButtonu;
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
    @FindBy(xpath = "//section[@id='section-counter']")
    public WebElement istatistikBolumu;
    @FindBy(xpath = "//div[@class='row ftco-animate fadeInUp ftco-animated']")
    public WebElement yorumSayfasiHiddenContainer;
    //====== Anasayfa Footer =======
    @FindBy(xpath="//section[@class='ftco-section'][2]")
    public WebElement footerBolumu;
    @FindBy(xpath = "//h2[text()='Recent Blog']")
    public WebElement recentBlog;
    @FindBy(xpath="(//div[@class='room-img'])[3]")
    public WebElement resimLinkAcilanResim;
    //======= Anasayfa Instagram =======
    @FindBy(xpath = "//section[@class='instagram']")
    public WebElement instagramBolumu;
    @FindBy(xpath = "//button[@class='mfp-close']")
    public WebElement closeButonu;
    @FindBy(xpath = "//button[@title='Next (Right arrow key)']")
    public WebElement sagYonButonu;
    @FindBy(xpath = "//button[@title='Previous (Left arrow key)']")
    public WebElement solYonButonu;
    @FindBy(xpath = "//img[@class='mfp-img']")
    public WebElement instagramResimi;
    //===== Anasayfa Footer ======
    @FindBy(xpath = "(//h2[@class='ftco-heading-2'])[1]")
    public WebElement footerIkonu;
    @FindBy(xpath = "(//h2[@class='ftco-heading-2'])[1]/../p")
    public WebElement kisaAciklamaYazisi;
    @FindBy(xpath = "//span[@class='icon-twitter']")
    public WebElement footerTwitterIkonu;
    @FindBy(xpath = "(//span[@class='icon-facebook'])[2]")
    public WebElement footerFacebookIkonu;
    @FindBy(xpath = "(//span[@class='icon-instagram'])[2]")
    public WebElement footerInstagramIkonu;
    @FindBy(xpath = "(//h2[@class='ftco-heading-2'])[2]")
    public WebElement usefulLinksYazisi;
    @FindBy(xpath = "(//h2[@class='ftco-heading-2'])[3]")
    public WebElement privacyYazisi;
    @FindBy(xpath = "(//h2[@class='ftco-heading-2'])[4]")
    public WebElement haveQuestionsYazisi;
    @FindBy(xpath = "(//a[@class='py-2 d-block'])[1]")
    public WebElement footerBlogYazisi;
    @FindBy(xpath = "(//a[@class='py-2 d-block'])[2]")
    public WebElement footerRoomsYazisi;
    @FindBy(xpath = "(//a[@class='py-2 d-block'])[3]")
    public WebElement footerAmenitiesTestYazisi;
    @FindBy(xpath = "(//a[@class='py-2 d-block'])[4]")
    public WebElement footerGiftCardYazisi;
    @FindBy(xpath = "(//a[@class='py-2 d-block'])[5]")
    public WebElement footerCareerYazisi;
    @FindBy(xpath = "(//a[@class='py-2 d-block'])[6]")
    public WebElement footerAboutUsYazisi;
    @FindBy(xpath = "(//a[@class='py-2 d-block'])[7]")
    public WebElement footerContactUsYazisi;
    @FindBy(xpath = "(//a[@class='py-2 d-block'])[8]")
    public WebElement footerServicesYazisi;
    @FindBy(xpath = "(//span[@class='text'])[1]")
    public WebElement footerAdresText;
    @FindBy(xpath = "(//span[@class='text'])[2]")
    public WebElement footerNumberText;
    @FindBy(xpath = "(//span[@class='text'])[3]")
    public WebElement footerMailText;
    @FindBy(xpath = "//span[@class='icon icon-map-marker']")
    public WebElement footerAdresIkonu;
    @FindBy(xpath = "//span[@class='icon icon-phone']")
    public WebElement footerNumberIkonu;
    @FindBy(xpath = "//span[@class='icon icon-envelope']")
    public WebElement footerMailIkonu;


}
