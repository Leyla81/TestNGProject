package techproed.tests.day26_PagesLocate;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourcePageClass;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C02_PageKullnimi {
    @Test
    public void test01() {
        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim

       /*
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); ----boyle de gidilir

        */
//Properties ile gitme
        Driver.getDriver().get(ConfigReader.getProperty("opensourceUrl"));
//kullaniciAdi, kullaniciSifre, submitButton elementlerini locate edelim
        // kullaniciAdi=Admin-----properties dosyasında
        //kullaniciSifre=admin123-----properties dosyasında

        OpenSourcePageClass.username().sendKeys(ConfigReader.getProperty("username_opensource"));
        OpenSourcePageClass.password().sendKeys(ConfigReader.getProperty("password_opensource"));
        OpenSourcePageClass.loginButton().click();

        //Login Testinin basarili oldugunu test et
        Assert.assertTrue(OpenSourcePageClass.verify().isDisplayed());

        //sayfayı kapatın
        Driver.closeDriver();
    }
}
