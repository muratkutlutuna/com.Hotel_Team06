package tests.us_0010;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase_10001 {

    WebDriver driver;
    @BeforeClass
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
   public  void roomsTest() {
        //1- "https://www.hotelmycamp.com/" sayfasina gider
        driver.get("https://www.hotelmycamp.com/");

        //"Rooms" secenegine tiklar
        driver.findElement(By.xpath("//a[text()='Rooms']")).click();


    }

}
