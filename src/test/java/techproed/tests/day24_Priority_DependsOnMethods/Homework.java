package techproed.tests.day24_Priority_DependsOnMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework {


    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }
      /*  // 1. “http://zero.webappsecurity.com/” Adresine gidin

        // 2. Sign in butonuna basin
        // 3. Login kutusuna “username” yazin
        // 4. Password kutusuna “password” yazin
        driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("password");
        // 5. Sign in tusuna basin
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        // 6. Online banking menusu icinde Pay Bills sayfasina gidin
        // 7. “Purchase Foreign Currency” tusuna basin
        // 8. “Currency” drop down menusunden Eurozone’u secin
        // 9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
        // 10.soft assert kullanarak DropDown listesinin su secenekleri oldugunu test
        // edin "Select One", "Australia (dollar)", "Canada (dollar)","Switzerland
        // (franc)","China (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain
        // (pound)","Hong Kong (dollar)","Japan (yen)","Mexico (peso)","Norway
        // (krone)","New Zealand (dollar)","Sweden (krona)","Singapore
        // (dollar)","Thailand (baht)"*/

            @Test
            public void test01() {
                //1. “http://zero.webappsecurity.com/” Adresine gidin
                driver.get("http://zero.webappsecurity.com");

                //2. Sign in butonuna basin
               WebElement signIn= driver.findElement(By.xpath("//button[@id='signin_button']"));
               signIn.click();

                //3. Login kutusuna “username” yazin
                //4. Password kutusuna “password” yazin
                //5. Sign in tusuna basin
                WebElement login = driver.findElement(By.xpath("//input[@id='user_login']"));
                login.sendKeys("username", Keys.TAB,"password",Keys.TAB,Keys.ENTER);
                driver.navigate().back();

                //6. Online banking menusu icinde Pay Bills sayfasina gidin
               WebElement onlineBanking = driver.findElement(By.xpath("//li[@id='onlineBankingMenu']"));
               onlineBanking.click();
                driver.findElement(By.xpath("//span[@id='pay_bills_link']")).click();

                //7. “Purchase Foreign Currency” tusuna basin
               WebElement PurchaseForeignCurrency = driver.findElement(By.xpath("//a[text()='Purchase Foreign Currency']"));
               PurchaseForeignCurrency.click();

                //8. “Currency” drop down menusunden Eurozone’u secin
                WebElement dropdown = driver.findElement(By.xpath("//select[@id='pc_currency']"));
                Select select = new Select(dropdown);
                select.selectByVisibleText("Eurozone (euro)");

                //9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
                String actual = dropdown.getText();
                String expected = "Eurozone (Euro)";
                SoftAssert softAssert = new SoftAssert();
                softAssert.assertEquals(actual, expected);

                //10.soft assert kullanarak DropDown listesinin su secenekleri oldugunu test
                //   edin "Select One", "Australia (dollar)", "Canada (dollar)","Switzerland
                //            (franc)","China (yuan)","Denmark (krone)","Eurozone (euro)","Great Britain
                //            (pound)","Hong Kong (dollar)","Japan (yen)","Mexico (peso)","Norway
                //            (krone)","New Zealand (dollar)","Sweden (krona)","Singapore
                //            (dollar)","Thailand (baht)"

                List<WebElement> actualList = select.getOptions();


                for (WebElement w: actualList) {
                    System.out.println(w.getText());
                }



            }
        }


















