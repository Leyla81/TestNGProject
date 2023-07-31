package techproed.tests.day28_dataProvider;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.Google;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C02_DataProviderTest {

        @DataProvider
        public static Object[][] arabalar() {
            return new Object[][]{{"volvo"},{"audi"},{"mercedes"},{"ford"}};
        }

        /*
            Google sayfasına gidip
            DataProvider ile belirtilen araç isimlerini aratalım
             */
        @Test(dataProvider = "arabalar")
        public void test01(String araclar) {
            //Google sayfasına gidelim
            Driver.getDriver().get(ConfigReader.getProperty("googleUrl"));

            //Dataprovider'daki verilerle arama yapalım
            Google googlePage =new Google();
            googlePage.aramaKutusu.sendKeys(araclar,Keys.ENTER);//Keys.Enter yerine submit de kullanılır //googlePage.aramaKutusu.submit();
             ReusableMethods.bekle(3);

             //her arama icin sayfa resmi alalım
            ReusableMethods.tumSayfaResmi(araclar);

            //sayfayı kapatalim
            Driver.closeDriver();
    }
}
