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

    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']")
    public WebElement addUserButonu;


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


    /////////////////////////////////////////////// KÜBRA     ///////////////////////////////////////////////

    @FindBy(xpath = "//a[@href='/admin/HotelRoomAdmin']\t")
    public WebElement hotelRoomsLinki;

    @FindBy(xpath = "//a[@class='btn btn-circle btn-default']\t")
    public WebElement addHotelRoomButonu;

    @FindBy(xpath = "//div[@class='caption']")
    public WebElement createHotelRoomYazıElementi;

    @FindBy(xpath = "//select[@class='form-control input-lg required']")
    public WebElement dropdownSelectHotelElement;

    @FindBy(xpath = "//select[@id='IDGroupRoomType']")
    public WebElement dropdownSelectRoomTypeElementi;

    @FindBy(xpath = "//button[@id='btnSubmit']")
    public WebElement createHotelRoomSaveButonu;

    @FindBy(xpath = "//div[@class='bootbox-body']")
    public WebElement başarılıKayıtYazısıElementi;

    @FindBy (xpath = "//button[text()='OK']")
    public WebElement başarılıKayıtOKButonu;


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
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////
}