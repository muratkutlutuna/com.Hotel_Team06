package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HotelRoomsPage {

    public HotelRoomsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    /////////////////////////////////////////////// KÜBRA LOCATE'LER ///////////////////////////////////////////////

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

    @FindBy (xpath = "//a[@class='dropdown-toggle']")
    public WebElement sağÜstManagerButonu;

    @FindBy (xpath = "//i[@class='icon-key']")
    public WebElement logOutButonu;

}
