package techproed.tests.day26_PagesLocate;

import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.TechproTestCenter;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C03_PageKullanimi {


    @Test
    public void test01() {

//https://testcenter.techproeducation.com/index.php?page=form-authentication
        Driver.getDriver().get(ConfigReader.getProperty("testCentreUrl"));

//Page object Model kullanarak sayfaya giriş yapildigini test edin
        TechproTestCenter testCenter =new TechproTestCenter();  //obje olusturduk TechproTestCenter clasında verileri cagırmak icin

        testCenter.username.sendKeys(ConfigReader.getProperty("techpro_test_username"));
        testCenter.password.sendKeys(ConfigReader.getProperty("techpro_test_password"));
        ReusableMethods.bekle(3);
        testCenter.loginButton.click();

        Assert.assertTrue(testCenter.loginVerify.isDisplayed());
//Sayfadan cikis yap ve cikis yapildigini test et
        testCenter.logout.click();

        Assert.assertTrue(testCenter.logoutVerify.isDisplayed());




    }
}
