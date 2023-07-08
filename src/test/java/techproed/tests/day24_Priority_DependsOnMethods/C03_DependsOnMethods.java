package techproed.tests.day24_Priority_DependsOnMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class C03_DependsOnMethods {
    WebDriver driver;
    @Test
    public void test01() {
        //Bu methodda driver ayarlarını yapalım
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @Test(priority = 1 ,dependsOnMethods = "test01")
    public void test02() {
        //amazon sayfasına gidelim
        driver.get("https://amazon.com");
    }  @Test(priority = 2)
    public void test03() {
        //Amazonda arama kutusunda iphone aratalim
        driver.findElement(By.id("twotabsearchtextboz")).sendKeys("iphone", Keys.ENTER);
    }
}
