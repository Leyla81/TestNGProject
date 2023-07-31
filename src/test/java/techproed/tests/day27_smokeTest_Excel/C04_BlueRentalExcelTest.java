package techproed.tests.day27_smokeTest_Excel;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalCars;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelReader;
import techproed.utilities.ReusableMethods;

public class C04_BlueRentalExcelTest {


    @Test
    public void test01() {


        //Excel dosyasındaki tum email ve passwordler ile
        //BlueRentalCar sayfasına gidip login olalım
        String dosyaYolu ="src/test/java/techproed/resources/mysmoketestdata.xlsx";
        String sayfaIsmi = "customer_info";
        ExcelReader reader = new ExcelReader(dosyaYolu,sayfaIsmi);

        //sayfaya gidelim
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalCarUrl"));
        BlueRentalCars rentalCars = new BlueRentalCars();

        //bir loop olusturup excel dosyasındaki tum verileri yazdiralım ve login olalım

        //fori ile excelde bulunan butun verilerle sayafaya gigidip login olup logout yapacagız

        for (int i = 1; i <=reader.rowCount() ; i++) { //---i yi 1 den baslattik cunku veriler 1.satirda balıyor
            String email =reader.getCellData(i,0);
            String password =reader.getCellData(i,1);
            System.out.println(email+"||"+password);

           rentalCars.login.click();
            ReusableMethods.bekle(2);

            rentalCars.email.sendKeys(email, Keys.TAB,password,Keys.ENTER);
            ReusableMethods.bekle(2);

            rentalCars.loginVerify.click();
            Assert.assertTrue(rentalCars.logout.isDisplayed());

            rentalCars.logout.click();
            ReusableMethods.bekle(2);

            rentalCars.ok.click();

        }
    }

















}
