package techproed.tests.day27_smokeTest_Excel;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalCars;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelReader;
import techproed.utilities.ReusableMethods;

public class C03_BlueRentalExcelTest {
    @Test
    public void test01() {
        /*
    Test yaptığımız sayfadaki dataları .properties yada excel dosyasından alabiliriz.
.properties dosyasından verileri okuyabilmemiz için ConfigReader class'ı oluşturmuştuk, Aynı şekilde
excel dosyasındaki verileri okuyabilmek için "resources" package altında  "ExcelReader" class'ı oluşturduk. Burdan alacağımız
email ve password bilgilerini String bir değişkene assing edip login testi yapacağımız sitede
sendKeys() methodu ile çok rahat kullanabiliriz.
 */
        ExcelReader excelReader = new ExcelReader("src/test/java/techproed/resources/mysmoketestdata.xlsx","customer_info");
        String email =excelReader.getCellData(1,0);
        String password =excelReader.getCellData(1,1);

        //BlueRentalcar sayfasina gidelim
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalCarUrl"));

//mysmoketestdata excel dosyasindan bir kullanici ile login olalim

        BlueRentalCars blueRentalCars =new BlueRentalCars();
        blueRentalCars.login.click();
        ReusableMethods.bekle(3);
        blueRentalCars.email.sendKeys(email, Keys.TAB, password, Keys.ENTER );

//login oldugumuzu dogrulayalim
        Assert.assertTrue(blueRentalCars.loginVerify.getText().contains("Sam"));

          /*
            Login webelementi login olduktan sonrada aynı locate sahip olabilme ihtimaline karşı
        daha garanti bir doğrulama yapmak için login olduktan sonra login webelementinin olduğu
        yerde login olduğumuz kullanıci ismi çıkacaktır. Bu webelementin yazısını getText() methodu
        ile alıp kullanıcı ismini içeriyomu içermiyomu olarak test ederiz
         */

//sayfayi kapatalim
        Driver.closeDriver();
















    }
}
