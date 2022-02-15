package tests.us_0010;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase_10002 {
    WebDriver driver;
    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void advancedSearchTest(){
        //Advanced Search bari bulunur
        driver.findElement(By.xpath("//div[@class='sidebar-wrap bg-light ftco-animate fadeInUp ftco-animated']")).click();
        //check-in kismi temizlenir
        driver.findElement(By.xpath("//input[@id='checkin_date']")).clear();
        //checkin tarihi girilir
        driver.findElement(By.xpath("//input[@id='checkin_date']")).sendKeys("02-17-2022");
        //check-out tabi temizlenir
        driver.findElement(By.xpath("//input[@id='checkout_date']")).clear();
        //check-out tarihi girilir
        driver.findElement(By.xpath("//input[@id='checkout_date']")).sendKeys("02-23-2022");

        //SelectRoomType webelementi locate edilir ve select classindan bir obje olusturulur
        WebElement selectRoomType= driver.findElement(By.xpath("//select[@id='IDRoomType']"));
        Select selectRoom=new Select(selectRoomType);
        //value ile Double room secenegi secilir
        selectRoom.selectByValue("7");

        //SelectAdultCount webelementi locate edilir ve select classindan bir  obje olusturulur
        WebElement selectAdultCount=driver.findElement(By.xpath("//select[@id='AdultCount']"));
        Select selectAdult=new Select(selectAdultCount);
        //value ile 2 Adult secenegi secilir
        selectAdult.selectByValue("2");

        //Select Children webelementi locate edilir ve select classindan bir obje olusturulur
        WebElement selectChildren= driver.findElement(By.xpath("//select[@id='ChildrenCount']"));
        Select childrenCount=new Select(selectChildren);
        //selectByVisibleText ile 1 children secenegi secilir
        childrenCount.selectByVisibleText("1 Children");

        //check location tab
        driver.findElement(By.xpath("//input[@id='location']")).click();
        //click on Search button
        driver.findElement(By.xpath("//input[@value='Search']")).click();


        //acilan sayfada asagidaki Double linkine tiklanarak oda seceneklerine ulasilir
        //driver.findElement(By.xpath("(//a[@href='/RoomDetail/37'])[1]")).click();

    }
}
