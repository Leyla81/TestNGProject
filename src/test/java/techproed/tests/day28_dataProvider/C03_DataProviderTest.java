package techproed.tests.day28_dataProvider;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalCars;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C03_DataProviderTest {

    @DataProvider
    public static Object[][] blueRentalLogin() {
        return new Object[][]{{"sam.walker@bluerentalcars.com","c!fas_art"},
                {"kate.brown@bluerentalcars.com","tad1$Fas"},
                {"raj.khan@bluerentalcars.com","v7Hg_va^"},
                {"pam.raymond@bluerentalcars.com","Nga^g6!"}};
    }

    @Test(dataProvider = "blueRentalLogin")
    public void test01(String email,String password) {

//blueRentalCar sitesine gidelim
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalCarUrl"));

// DataProvider daki login ve password ile login olalim
        BlueRentalCars blueRentalCars = new BlueRentalCars();
blueRentalCars.login.click();
        ReusableMethods.bekle(3);
blueRentalCars.email.sendKeys(email, Keys.TAB,password,Keys.ENTER);
ReusableMethods.bekle(3);

//sayfayi kapatalim
        Driver.closeDriver();




    }
}
