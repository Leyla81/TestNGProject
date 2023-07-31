package techproed.tests.day28_dataProvider;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalCars;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C04_DataProviderConfigReaderTest {
    @DataProvider
    public static Object[][] blueRental() {
        return new Object[][]{{ConfigReader.getProperty("mail1"), ConfigReader.getProperty("sifre1")},
                              {ConfigReader.getProperty("mail2"), ConfigReader.getProperty("sifre2")},
                              {ConfigReader.getProperty("mail3"), ConfigReader.getProperty("sifre3")},
                              {ConfigReader.getProperty("mail4"), ConfigReader.getProperty("sifre4")},};
    }

    /*
    Dataprovider kullanarak .properties dosyasındaki veriler ile BlueRentalCar sitesine login olalim

     */
        @Test(dataProvider = "blueRental")
        public void test01 (String mail, String password){

            Driver.getDriver().get(ConfigReader.getProperty("blueRentalCarUrl"));
            BlueRentalCars rentalCars = new BlueRentalCars();
            rentalCars.login.click();
            ReusableMethods.bekle(2);
            rentalCars.email.sendKeys(mail, Keys.TAB,password,Keys.ENTER);
            ReusableMethods.bekle(2);

            Driver.closeDriver();











        }
    }
