package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class RoomReservationsPage {
    public RoomReservationsPage(){
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

    @FindBy(xpath = "//span[text()='Hotel Management']")
    public WebElement hotelManagementLinki;
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
    public WebElement editHotelroomreservatıonElementi;

    @FindBy(xpath = "//input[@title='DateStart']")
    public WebElement dateStartElementi;

    @FindBy(xpath = "//input[@title='DateEnd']")
    public WebElement dateEndElementi;

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


    @FindBy(xpath = "//a[@href='#tab_properties']")
    public WebElement roomReservationsPropertiesElementi;

    @FindBy(xpath = "//select[@id='lkpBarcodeTypes']")
    public WebElement propertiesTipElementi;

    @FindBy(xpath = "//input[@id='txtBarcodeCode']")
    public WebElement propertiesCodeElementi;

    @FindBy(xpath = "//textarea[@id='txtBarcode']")
    public WebElement propertiesValueElementi;

    @FindBy(xpath = "(//button[@class='btn green'])[2]")
    public WebElement propertiesSaveElementi;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement valueaddedElementi;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement valueaddedOkButonuElementi;

    @FindBy(xpath = "//button[@id='btnDelete']")
    public WebElement generalDataDeleteButonu;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement reservationSilinmesiOnayiElementi;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement updatedSuccessfullyYazisiElementi;

    @FindBy(xpath = "//span[@class='username username-hide-on-mobile']")
    public WebElement managerElementi;

    @FindBy(xpath = "//a[@href='/Admin/Account/Logoff']")
    public WebElement logOutElementi;

    @FindBy(xpath = "//a[.='Log out']")
    public  WebElement anaSayfaLogOutButonuElementi;

    @FindBy(xpath = "//tbody/tr/td[9]")
    public  WebElement deleteIslemindenSonraContacNameElementi;


    public void roomReservation(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        ilkLoginLinki.click();
        usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        loginButonu.click();
        hotelManagementLinki.click();
        roomReservation.click();

    }
    public void cikisYapma(){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(managerElementi).perform();
        logOutElementi.click();
    }
}
