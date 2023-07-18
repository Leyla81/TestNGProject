package techproed.tests.day26_PagesLocate;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalCars;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class C04_PositiveTest {
    @Test
    public void test01() {

//Acceptance Criteria:
//Admin olarak, uygulamaya giriş yapabilmeliyim
//https://www.bluerentalcars.com/
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalCarUrl"));
        BlueRentalCars rentalCars =new BlueRentalCars();
        rentalCars.login.click();
        ReusableMethods.bekle(3);


//Admin email: jack@gmail.com
//Admin password: 12345
rentalCars.email.sendKeys(ConfigReader.getProperty("blueRentalemail"), Keys.TAB,
        ConfigReader.getProperty("blueRentalpassword"),Keys.ENTER);

//Giris yaptıgını dogrula
        Assert.assertTrue(rentalCars.loginVerify.getText().contains("Jack"));
        ReusableMethods.bekle(2);

        //sayfayı kapatalım
        Driver.closeDriver();













    }
}
