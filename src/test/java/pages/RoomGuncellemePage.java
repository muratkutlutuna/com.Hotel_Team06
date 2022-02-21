package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RoomGuncellemePage {

    public RoomGuncellemePage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "//span[text()='ListOfUsers']")
    public WebElement basariliGirisTexti;

    @FindBy (xpath ="//a[@href='/admin/HotelRoomAdmin']" )
    public WebElement roomListLinki;

    @FindBy (xpath = "//a[@href='./HotelRoomAdmin/Edit?Id=13']")
    public WebElement detailsButton;

    @FindBy (xpath = "//select[@id='IDHotel']")
    public WebElement hotelSelectDropdownButton;

    @FindBy (xpath = "//input[@id='Name']")
    public WebElement nameBox;

    @FindBy (xpath = "//input[@id='Location']")
    public WebElement locationBox;

    @FindBy (xpath = "//textarea[@tabindex='0']")
    public WebElement descriptionBox;

    @FindBy (xpath = "//select[@id='IDGroupRoomType']")
    public WebElement roomTypeDropdownButton;

    @FindBy (xpath = "//input[@id='MaxAdultCount']")
    public WebElement maxAdultBox;

    @FindBy (xpath = "//input[@id='MaxChildCount']")
    public WebElement maxChildBox;

    @FindBy (xpath = "//div[@class='caption']")
    public WebElement editHotelRoom;

    @FindBy (xpath = "//input[@id='IsAvailable']")
    public WebElement isAvailableBox;

    @FindBy (xpath = "//button[@class='btn green'][1]")
    public WebElement saveRoomButton;

    @FindBy (xpath = "//div[text()='HotelRoom was updated successfully']")
    public WebElement basarılıOdaKayıtTexti;

    @FindBy (xpath = "//button[text()='OK']")
    public WebElement okButton;

    @FindBy (xpath = "//button[text()='Delete']")
    public WebElement deleteButton;

    @FindBy (xpath = "//div[text()='Would you like to continue?']")
    public WebElement deleteOKText;

    @FindBy (xpath = "//button[@data-bb-handler='confirm']")
    public WebElement deleteOKbutton;

    @FindBy (xpath = "//button[@class='bootbox-close-button close']")
    public WebElement couldntDeleteBoxClose;

    @FindBy (xpath = "//html/body/div[5]/div/div/div[1]/div")
    public WebElement couldntDeleteText;
    // ustteki ve alttaki aynı yerin locateri
    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement basarisizDeleteYazisi;

    @FindBy (xpath = "//span[@class='username username-hide-on-mobile']")
    public WebElement managerButton;

    @FindBy(xpath = "//a[@href='/Admin/Account/Logoff']")
    public WebElement logOutButton;

    @FindBy (xpath = "//h3[text()='Log in']")
    public WebElement loginPenceresi;














}
