package tests.us_0004;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class TestCase_04001 {

    @Test
        public void loginTesti(){
            Driver.getDriver().get("https://www.hotelmycamp.com");
            Driver.getDriver().findElement(By.xpath("//a[text()='Log in']")).click();
            WebElement loginKutusu=Driver.getDriver().findElement(By.id("UserName"));
            Actions actions=new Actions(Driver.getDriver());

            actions.click(loginKutusu).
                    sendKeys("manager").
                    sendKeys(Keys.TAB).
                    sendKeys("Manager1!").
                    sendKeys(Keys.TAB).
                    sendKeys(Keys.ENTER).
                    perform();
        }

        @Test (dependsOnMethods = "loginTesti")
        public void otelListesiTesti(){
            WebElement hotelManagementElementi=Driver.getDriver().findElement(By.id("menuHotels"));
            Actions actions=new Actions(Driver.getDriver());

            actions.click(hotelManagementElementi).perform();

            WebElement hotelListElementi=Driver.getDriver().findElement(By.xpath("//a[@href='/admin/HotelAdmin']"));
            actions.click(hotelListElementi).perform();
        }

        @Test (dependsOnMethods = "otelListesiTesti")
        public void otelEklemeTesti(){
            Driver.getDriver().findElement(By.xpath("//span[@class='hidden-480'] ")).click();
        }


        @Test (dependsOnMethods = "otelEklemeTesti")
        public void kayitTesti(){
            WebElement codeElementi= Driver.getDriver().findElement(By.id("Code"));

            Actions actions=new Actions(Driver.getDriver());

            actions.click(codeElementi).
                    sendKeys("55000-001").
                    sendKeys(Keys.TAB).
                    sendKeys("Hotel Baydar").
                    sendKeys(Keys.TAB).
                    sendKeys("Mimar Sinan Mahallesi No:185 Atakum/Samsun").
                    sendKeys(Keys.TAB).
                    sendKeys("+90 362 123 45 67").
                    sendKeys(Keys.TAB).
                    sendKeys("hotelbaydar@gmail.com").
                    sendKeys(Keys.TAB).
                    sendKeys(Keys.ARROW_DOWN).
                    click().
                    perform();

            actions.sendKeys(Keys.PAGE_DOWN);

            Driver.getDriver().findElement(By.xpath("//button[@id='btnSubmit']")).click();

            Driver.getDriver().findElement(By.xpath("//button[@class='btn btn-primary']")).click();
            // driver.switchTo().alert().accept();
            Driver.getDriver().navigate().back();
        }
        @Test (dependsOnMethods = "kayitTesti")
        public void goruntulemeTesti(){
            WebElement aramaKutusuElementi= Driver.getDriver().findElement(By.xpath("//input[@name='Name']"));
            Actions actions=new Actions(Driver.getDriver());

            actions.moveToElement(aramaKutusuElementi).click();
            actions.sendKeys("Baydar").
                    perform();
            Driver.getDriver().findElement(By.xpath("//div[@class='margin-bottom-5']")).click();

            WebElement hotelElementi= Driver.getDriver().findElement(By.xpath("(//tr[@role='row'])[3]"));
            String actualhotelElementi= hotelElementi.getText();
            String arananKelime="Baydar";
            Assert.assertTrue(actualhotelElementi.contains(arananKelime));
    }






}
