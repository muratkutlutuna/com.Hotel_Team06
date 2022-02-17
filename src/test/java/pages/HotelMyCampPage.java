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

//***************************hatice*************************************************

    @FindBy(xpath ="//span[.='Hotel Management']" )
    public WebElement hotelManagementYaziElementi;

    @FindBy(xpath = "//span[text()='List Of Hotels']")
    public WebElement listOfHotelYaziElementi;

    @FindBy(xpath = "(//i[@class='icon-calendar'])[2]")
    public WebElement hotelListIkonElementi;

    @FindBy(xpath = "(//a[@class='btn btn-xs default'])[1]")
    public WebElement ilkDetailsButonElementi;

    @FindBy(xpath = "(//div[@class='portlet-title'])[1]")
    public WebElement editHotelYaziElementi;

    @FindBy(xpath = "//div[@class='portlet-title'][2]")
    public WebElement hotelDataYaziElementi;

    @FindBy(xpath = "//input[@id='Code']")
    public WebElement codeKutusuElementi;

    @FindBy(id = "Name")
    public WebElement nameKutusuElementi;

    @FindBy(id = "Address")
    public WebElement addressKutusuElementi;

    @FindBy(id = "Phone")
    public WebElement phoneKutusuElementi;

    @FindBy(id = "Email")
    public WebElement emailKutusuElementi;

    @FindBy(xpath = "//select[@id='IDGroup']")
    public WebElement dropdownElementi;

    @FindBy(xpath = "(//button[@class='btn green'])[1]")
    public WebElement saveButonElementi;

    @FindBy(xpath = "//div[.='Hotel was updated successfully']")
    public  WebElement hotelWasupdatedSuccessfullyYaziElementi;

    @FindBy(xpath = "//div[.='Would you like to continue?']")
    public WebElement wouldYouLikeToContinueYaziElementi;

    @FindBy(xpath = "//button[.='OK']")
    public WebElement okButonElementi;

    @FindBy(xpath = "//button[@id='btnDelete']")
    public WebElement deleteButonElementi;

    @FindBy(xpath = "//a[.='Photos']")
    public  WebElement photosButonElementi;

    @FindBy(xpath = "//a[@class='btn yellow']")
    public WebElement selectFileButonElementi;

    @FindBy(xpath = "//a[text()='Properties']")
    public WebElement propertiesButonElementi;

    @FindBy(xpath = "//select[@id='lkpBarcodeTypes']")
    public WebElement tipBolumuDropDownElementi;

    @FindBy(xpath = "//input[@id='txtBarcodeCode']")
    public WebElement properpiesCodeBolumuElementi;

    @FindBy(xpath = "//textarea[@id='txtBarcode']")
    public WebElement valueBolumuElementi;

    @FindBy(xpath = "(//button[@class='btn green'])[2]")
    public WebElement propertiesSaveButonElementi;

//*************************************hatice***********************************************************



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