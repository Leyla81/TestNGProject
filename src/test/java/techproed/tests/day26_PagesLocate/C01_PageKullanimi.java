package techproed.tests.day26_PagesLocate;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.OpenSourcePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C01_PageKullanimi {


    @Test
    public void test01() {
        //https://opensource-demo.orangehrmlive.com/web/index.php/auth/login adrese gidelim

       /*
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); ----boyle de gidilir

        */
//Properties ile gitme
        Driver.getDriver().get(ConfigReader.getProperty("opensourceUrl"));
//kullaniciAdi, kullaniciSifre, submitButton elementlerini locate edelim
       // kullaniciAdi=Admin
        //kullaniciSifre=admin123
        OpenSourcePage openSourcePage =new OpenSourcePage();//Pages altındakı class ile obje olusturduk

        openSourcePage.username.sendKeys(ConfigReader.getProperty("username_opensource"));
        openSourcePage.password.sendKeys(ConfigReader.getProperty("password_opensource"));

        ReusableMethods.bekle(3);//---Thread.sleep methodunu ReusableMethods clasından cagırdık(Utilities)
        openSourcePage.loginButton.click();


//Login Testinin basarili oldugunu test et
        Assert.assertTrue(openSourcePage.verify.isDisplayed());
    }
}
