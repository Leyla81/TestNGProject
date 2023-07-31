package techproed.tests.day30_listeners;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

@Listeners(techproed.utilities.Listeners.class)
public class C01_ListenersTest1 {
/*
    Olusturdugumuz test class'inda listeners yapisini kullanabilmek icin class'dan once @Listeners notasyonu
    olustururuz. Ve bu notasyona parametre olarak olusturmus oldugumuz listeners class'inin yolunu belirtiriz
     */


    @Test(invocationCount = 10,successPercentage = 90)
    public void test01() {
        System.out.println("PASSED");
        Assert.assertTrue(true);
        Assert.assertEquals(2,2);
    }
    /*
    Test methodlarınızı birden fazla çalıştırmak isterseniz @ test notasyonundan sonrava invocationCount
    parametresi ile belirttiğimiz sayı kadar testlerimiz tekrar çalışır.
    Listeners ile onTestFailedButWithinSuccessPercentage() bu methodu kullanmak istersek @Test notasyonundan sonra
    invocationCount = 10 ile birlikte successPercentage parametresi kullanarak ornegin testlerim 10 kez calissin
    successPercentage parametresine belirttigim %90 bize 10 kez calisan testlerimizden 1 tanesi fail olsa bile
    bu testi passed olarak verecektir. Eger iki test fail olursa onTestFailedButWithinSuccessPercentage() bu method
    devreye girecektir.

    */

    @Test
    public void test02() {
        System.out.println("FAIL");
        Assert.assertTrue(false);//bilerek hata aldık
    }

    @Test
    public void test03() {
        System.out.println("Skip");
        throw new SkipException("bu method atlandı");
    }

    @Test
    public void test04() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.getDriver().findElement(By.id("fdgfdgfd"));//bilerek hata aldık screenshot aldı
    }
}
