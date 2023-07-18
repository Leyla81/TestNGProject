package techproed.tests.day25PageObjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C03_PropertiesKullanimi {
    @Test
    public void amazonTest() {


        //amazon sayfasına gidelim

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        //Driver classından getDriver methodunu kullandık ConfigReader classından amazon baglantısını aldık

        //baslıgın amazon icerdigini test edelim
        String actualTitle =Driver.getDriver().getTitle();
        String expectedTitle = ConfigReader.getProperty("expectedTitle");
        Assert.assertTrue(actualTitle.contains(expectedTitle));

        //arama kutusunda iphone aratalim

        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys(ConfigReader.getProperty("searchText"), Keys.ENTER);


        //sayfayı kapatalım
        Driver.closeDriver();

        //google sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));

        //sayfayı kapatalım
        Driver.closeDriver();

        //facebook sayfasına gidelim

        Driver.getDriver().get("https://facebook.com");
    }
}
