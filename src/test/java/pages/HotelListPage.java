package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelListPage {

    public HotelListPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

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



}
